package com.mkotb.ktesla.request.data

import com.mkotb.ktesla.model.ChargeState
import com.mkotb.ktesla.request.TeslaRequest
import com.mkotb.ktesla.request.TeslaResponse
import io.ktor.http.HttpMethod

class ChargeStateRequest (
        vehicleId: Long
) : TeslaRequest<ChargeStateResponse>() {
    override val endpoint = "api/1/vehicles/$vehicleId/data_request/charge_state"
    override val method = HttpMethod.Get
}

data class ChargeStateResponse (
        val response: ChargeState
): TeslaResponse()
