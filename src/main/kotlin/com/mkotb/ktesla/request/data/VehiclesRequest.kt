package com.mkotb.ktesla.request.data

import com.mkotb.ktesla.model.VehicleData
import com.mkotb.ktesla.request.TeslaRequest
import com.mkotb.ktesla.request.TeslaResponse
import io.ktor.http.HttpMethod

 class VehiclesRequest: TeslaRequest<VehiclesResponse>() {
    override val endpoint = "api/1/vehicles"
    override val method = HttpMethod.Get
}

class VehiclesResponse (
        val response: List<VehicleData>,
        val count: Int
) : TeslaResponse()
