package com.mkotb.tesla.request

import com.mkotb.tesla.model.ChargeState
import io.ktor.http.HttpMethod

class ChargeStateRequest (
        vehicleId: String
) : TeslaRequest<ChargeStateResponse>() {
    override val endpoint = "api/1/vehicles/$vehicleId/data_request/charge_state"
    override val method = HttpMethod.Get
}

data class ChargeStateResponse (
        val response: ChargeState
): TeslaResponse()
