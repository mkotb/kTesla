package com.mkotb.ktesla

import com.google.gson.FieldNamingPolicy
import com.mkotb.ktesla.model.*
import com.mkotb.ktesla.request.*
import com.mkotb.ktesla.util.LowercaseEnumAdapter
import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import io.ktor.client.features.json.GsonSerializer
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.request.forms.formData
import io.ktor.client.request.forms.submitFormWithBinaryData
import io.ktor.client.request.header
import io.ktor.client.request.url
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.properties.Delegates
import kotlin.reflect.KClass

class TeslaApi (var token: String) {
    companion object {
        /* Client ID and Secret must be set by setup function before any usage of the API */
        private var clientId by Delegates.notNull<String>()
        private var clientSecret by Delegates.notNull<String>()
        /* URL for the Tesla API */
        val baseUrl = "https://owner-api.teslamotors.com"
        /*
         * HttpClient used universally by all instances of kTesla
         * Gson Serializer is used to convert kotlin objects to and from JSON
         */
        var client = HttpClient(CIO) {
            install(JsonFeature) {
                serializer = GsonSerializer {
                    setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)

                    fun <T : Enum<T>> registerEnumAdapter(clazz: KClass<T>) {
                        registerTypeAdapter(clazz.java, LowercaseEnumAdapter(clazz))
                    }

                    registerEnumAdapter(ChargePortState::class)
                    registerEnumAdapter(ChargingState::class)
                    registerEnumAdapter(AutoParkState::class)
                    registerEnumAdapter(OnlineState::class)
                }
            }
        }

        /**
         * Set up the Tesla API for use. This must be called before any
         * other methods of the API
         */
        fun setup(clientId: String, clientSecret: String) {
            this.clientId = clientId
            this.clientSecret = clientSecret
        }

        /**
         * Authenticate using an email & password. You can do this manually
         * if you would like to store the access code elsewhere, or call the
         * TeslaApi#create() function for kTesla to handle it for you
         */
        suspend fun authenticate(email: String, password: String): OAuthResponse {
            return send(null, AuthenticateRequest(
                    clientId,
                    clientSecret,
                    email,
                    password
            ))
        }

        suspend fun refreshToken(token: String): OAuthResponse {
            return send(null, RefreshTokenRequest(
                    clientId,
                    clientSecret,
                    token
            ))
        }

        /**
         * Send any TeslaRequest. This specific function is useful if the request
         * is unauthenticated and you do not have a TeslaApi instance.
         */
        suspend inline fun <reified T : TeslaResponse> send(api: TeslaApi?, request: TeslaRequest<T>) : T {
            // create mutable map of parameters
            val parameters = HashMap<String, Any?>(request.generateParameters())

            // transform into a form
            val form = formData {
                parameters.forEach { k, v ->
                    if (v != null) {
                        append(k, v)
                    }
                }
            }

            return client.submitFormWithBinaryData(formData = form) {
                // set HTTP Method and URL
                method = request.method
                url("$baseUrl/${request.endpoint}")

                // add api token if applicable
                if (request.authenticated && api != null) {
                    header("Authorization", "Bearer: ${api.token}")
                }
            }
        }

        /**
         * Create an instance of TeslaApi using an email and password.
         * Performs authentication and sets up a refresh task for you
         */
        suspend fun create(email: String, password: String): TeslaApi {
            return TeslaApi(authenticate(email, password))
        }
    }

    private var disabled = false

    /**
     * Create an instance of the TeslaApi and set up a task
     * to automatically refresh the token
     */
    constructor(auth: OAuthResponse) : this(auth.accessToken) {
        fun scheduleRefresh(auth: OAuthResponse) {
            GlobalScope.launch {
                delay(auth.expiresIn - 1000)

                if (!disabled) {
                    val newAuth = refreshToken(auth.refreshToken)

                    this@TeslaApi.token = newAuth.accessToken
                    scheduleRefresh(newAuth)
                }
            }
        }

        scheduleRefresh(auth)
    }

    /**
     * Disable the usage of this instance, and cancel
     * any refresh token tasks
     */
    fun disable() {
        disabled = true
    }

    suspend inline fun <reified T : TeslaResponse> send(request: TeslaRequest<T>): T {
        return send(this, request)
    }
}
