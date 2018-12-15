package com.mkotb.ktesla.request.data

import com.mkotb.ktesla.model.DriveState
import com.mkotb.ktesla.request.TeslaRequest
import com.mkotb.ktesla.request.TeslaResponse
import io.ktor.http.HttpMethod

data class DriveStateRequest (
        val vehicleId: Int
) : TeslaRequest<DriveStateResponse>() {
    override val endpoint = "api/1/vehicles/$vehicleId/data_request/drive_state"
    override val method = HttpMethod.Get
}

class DriveStateResponse (
        val response: DriveState
) : TeslaResponse()
