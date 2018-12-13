package com.mkotb.ktesla.request

import com.mkotb.ktesla.model.DriveState
import io.ktor.http.HttpMethod

data class DriveStateRequest (
        val vehicleId: String
) : TeslaRequest<DriveStateResponse>() {
    override val endpoint = "api/1/vehicles/$vehicleId/data_request/drive_state"
    override val method = HttpMethod.Get
}

class DriveStateResponse (
        val response: DriveState
) : TeslaResponse()
