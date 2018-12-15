package com.mkotb.ktesla.request

import com.mkotb.ktesla.model.TeslaData
import io.ktor.http.HttpMethod

data class TeslaDataRequest (
        val vehicleId: String
) : TeslaRequest<TeslaDataResponse>() {
    override val endpoint = "api/1/vehicles/$vehicleId/data_request/data"
    override val method = HttpMethod.Get
}

class TeslaDataResponse (
        val response: TeslaData
) : TeslaResponse()

