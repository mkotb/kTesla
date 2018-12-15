package com.mkotb.ktesla.request

import com.mkotb.ktesla.model.VehicleState
import io.ktor.http.HttpMethod

data class VehicleStateRequest (
        val vehicleId: String
) : TeslaRequest<VehicleStateResponse>() {
    override val endpoint = "api/1/vehicles/$vehicleId/data_request/vehicle_state"
    override val method = HttpMethod.Get
}

class VehicleStateResponse (
        val response: VehicleState
) : TeslaResponse()
