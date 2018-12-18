package com.mkotb.ktesla.request.data

import com.mkotb.ktesla.model.VehicleData
import com.mkotb.ktesla.request.TeslaRequest
import com.mkotb.ktesla.request.TeslaResponse
import io.ktor.http.HttpMethod

class VehicleDataRequest (
        vehicleId: Long
) : TeslaRequest<VehicleDataResponse>() {
    override val endpoint = "api/1/vehicles/$vehicleId/vehicle_data"
    override val method = HttpMethod.Get
}

class VehicleDataResponse (
        val response: VehicleData
) : TeslaResponse()
