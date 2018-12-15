package com.mkotb.ktesla.request.data

import com.mkotb.ktesla.request.TeslaRequest
import com.mkotb.ktesla.request.TeslaResponse
import io.ktor.http.HttpMethod

class MobileEnabledRequest (
        vehicleId: Int
) : TeslaRequest<MobileEnabledResponse>() {
    override val endpoint = "api/1/vehicles/$vehicleId/data_request/mobile_enabled"
    override val method = HttpMethod.Get
}

class MobileEnabledResponse (
        val response: Boolean
) : TeslaResponse()
