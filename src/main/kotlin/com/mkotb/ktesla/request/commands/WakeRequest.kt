package com.mkotb.ktesla.request.commands

import com.mkotb.ktesla.model.VehicleData
import com.mkotb.ktesla.request.TeslaRequest
import com.mkotb.ktesla.request.TeslaResponse
import io.ktor.http.HttpMethod

class WakeRequest (
        vehicleId: Int
) : TeslaRequest<WakeResponse>() {
    override val endpoint = "api/1/vehicles/$vehicleId/wake_up"
    override val method = HttpMethod.Post
}

data class WakeResponse (
        val response: VehicleData
): TeslaResponse()
