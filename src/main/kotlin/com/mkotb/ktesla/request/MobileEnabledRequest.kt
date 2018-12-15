package com.mkotb.ktesla.request

import io.ktor.http.HttpMethod

data class MobileEnabledRequest (
        val vehicleId: String
) : TeslaRequest<MobileEnabledResponse>() {
    override val endpoint = "api/1/vehicles/$vehicleId/data_request/mobile_enabled"
    override val method = HttpMethod.Get
}

class MobileEnabledResponse (
        val response: Boolean
) : TeslaResponse()
