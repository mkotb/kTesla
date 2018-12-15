package com.mkotb.ktesla.request

import com.mkotb.ktesla.model.VehicleData
import io.ktor.http.HttpMethod

class VehicleDataRequest (
        vehicleId: Int
) : TeslaRequest<VehicleDataResponse>() {
    override val endpoint = "api/1/vehicles/$vehicleId/data_request/vehicle_state"
    override val method = HttpMethod.Get
}

class VehicleDataResponse (
        val response: VehicleData
) : TeslaResponse()
