package com.mkotb.ktesla.request

import io.ktor.http.HttpMethod

abstract class TokenRequest (
        private val clientId: String,
        private val clientSecret: String
) : TeslaRequest<OAuthResponse>() {
    abstract val grantType: String
    override val authenticated = false
    override val endpoint = "oauth/token"
    override val method = HttpMethod.Post

    override fun generateParameters(): Map<String, Any?> {
        return mapOf (
                "grant_type" to grantType,
                "client_id" to clientId,
                "client_secret" to clientSecret
        )
    }
}

class AuthenticateRequest (
        clientId: String,
        clientSecret: String,
        private val email: String,
        private val password: String
) : TokenRequest(clientId, clientSecret) {
    override val grantType = "password"

    override fun generateParameters(): Map<String, Any?> {
        return HashMap<String, Any?>(super.generateParameters()).apply {
            put("email", email)
            put("password", password)
        }
    }
}

class RefreshTokenRequest (
        clientId: String,
        clientSecret: String,
        private val refreshToken: String
) : TokenRequest(clientId, clientSecret) {
    override val grantType = "refresh_token"

    override fun generateParameters(): Map<String, Any?> {
        return HashMap<String, Any?>(super.generateParameters()).apply {
            put("refresh_token", refreshToken)
        }
    }
}


data class OAuthResponse(
        val accessToken: String,
        val tokenType: String,
        val expiresIn: Long,
        val refreshToken: String,
        val createdAt: Long
): TeslaResponse()
