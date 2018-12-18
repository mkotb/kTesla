package com.mkotb.ktesla.request.data

import com.mkotb.ktesla.model.ClimateState
import com.mkotb.ktesla.request.TeslaRequest
import com.mkotb.ktesla.request.TeslaResponse
import io.ktor.http.HttpMethod

class ClimateStateRequest (
        vehicleId: Long
) : TeslaRequest<ClimateStateResponse>() {
    override val endpoint = "api/1/vehicles/$vehicleId/data_request/climate_state"
    override val method = HttpMethod.Get
}

class ClimateStateResponse (
        val response: ClimateState
) : TeslaResponse()
