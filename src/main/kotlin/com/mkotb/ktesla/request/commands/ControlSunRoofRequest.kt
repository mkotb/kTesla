package com.mkotb.ktesla.request.commands

import com.mkotb.ktesla.request.SuccessResponse
import com.mkotb.ktesla.request.TeslaRequest
import io.ktor.http.HttpMethod

/**
 * Controls the sun roof of the Model S
 */
class ControlSunRoofRequest (
        vehicleId: Long,
        /**
         * The state to set it to. Either "vent" or "close" at the moment
         */
        val state: String
) : TeslaRequest<SuccessResponse>() {
    override val endpoint = "api/1/vehicles/$vehicleId/command/actuate_trunk"
    override val method = HttpMethod.Post

    override fun generateParameters(): Map<String, Any?> {
        return mapOf (
                "state" to state
        )
    }
}
