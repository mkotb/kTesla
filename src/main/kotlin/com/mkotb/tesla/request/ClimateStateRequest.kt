package com.mkotb.tesla.request

import com.mkotb.tesla.model.ClimateState
import io.ktor.http.HttpMethod

data class ClimateStateRequest (
        val vehicleId: String
) : TeslaRequest<ClimateStateResponse>() {
    override val endpoint = "api/1/vehicles/$vehicleId/data_request/climate_state"
    override val method = HttpMethod.Get
}

class ClimateStateResponse (
        val response: ClimateState
) : TeslaResponse()
