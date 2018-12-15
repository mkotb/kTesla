package com.mkotb.ktesla.request.commands

import com.mkotb.ktesla.request.SuccessResponse
import com.mkotb.ktesla.request.TeslaRequest
import io.ktor.http.HttpMethod

class OpenTrunkRequest (
        vehicleId: Int,
        /**
         * Which trunk to open. Either "front" or "rear" at the moment
         */
        val trunk: String
) : TeslaRequest<SuccessResponse>() {
    override val endpoint = "api/1/vehicles/$vehicleId/command/actuate_trunk"
    override val method = HttpMethod.Post

    override fun generateParameters(): Map<String, Any?> {
        return mapOf (
                "which_trunk" to trunk
        )
    }
}
