package com.mkotb.ktesla.request

import com.mkotb.ktesla.model.VehicleData
import io.ktor.http.HttpMethod

data class VehiclesRequest (
        val vehicleId: Int
) : TeslaRequest<VehiclesResponse>() {
    override val endpoint = "api/1/vehicles/$vehicleId/data_request/drive_state"
    override val method = HttpMethod.Get
}

class VehiclesResponse (
        val response: List<VehicleData>,
        val count: Int
) : TeslaResponse()
