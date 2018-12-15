package com.mkotb.ktesla.request.data

import com.mkotb.ktesla.model.VehicleState
import com.mkotb.ktesla.request.TeslaRequest
import com.mkotb.ktesla.request.TeslaResponse
import io.ktor.http.HttpMethod

data class VehicleStateRequest (
        val vehicleId: Int
) : TeslaRequest<VehicleStateResponse>() {
    override val endpoint = "api/1/vehicles/$vehicleId/data_request/vehicle_state"
    override val method = HttpMethod.Get
}

class VehicleStateResponse (
        val response: VehicleState
) : TeslaResponse()
