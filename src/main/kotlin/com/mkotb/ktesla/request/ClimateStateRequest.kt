package com.mkotb.ktesla.request

import com.mkotb.ktesla.model.ClimateState
import io.ktor.http.HttpMethod

class ClimateStateRequest (
        vehicleId: Int
) : TeslaRequest<ClimateStateResponse>() {
    override val endpoint = "api/1/vehicles/$vehicleId/data_request/climate_state"
    override val method = HttpMethod.Get
}

class ClimateStateResponse (
        val response: ClimateState
) : TeslaResponse()
