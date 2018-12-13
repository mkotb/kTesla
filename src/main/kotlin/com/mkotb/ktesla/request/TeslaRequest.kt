package com.mkotb.ktesla.request

import io.ktor.http.HttpMethod

abstract class TeslaRequest<R: TeslaResponse> {
    // whether the request requires a token to be sent
    open val authenticated = true
    // endpoint for the request, without preceding slash
    abstract val endpoint: String
    // http method for the request
    abstract val method: HttpMethod

    /**
     * Returns query parameters for the request
     */
    open fun generateParameters(): Map<String, Any?> {
        return emptyMap()
    }
}
