package com.mkotb.ktesla.request.data

import com.mkotb.ktesla.model.TeslaData
import com.mkotb.ktesla.request.TeslaRequest
import com.mkotb.ktesla.request.TeslaResponse
import io.ktor.http.HttpMethod

class TeslaDataRequest (
        val vehicleId: Long
) : TeslaRequest<TeslaDataResponse>() {
    override val endpoint = "api/1/vehicles/$vehicleId/vehicle_data"
    override val method = HttpMethod.Get
}

class TeslaDataResponse (
        val response: TeslaData
) : TeslaResponse()

