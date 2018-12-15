package com.mkotb.ktesla.request.commands

import com.mkotb.ktesla.request.SuccessResponse
import com.mkotb.ktesla.request.TeslaRequest
import io.ktor.http.HttpMethod

/**
 *
 *
 * @author Mazen Kotb
 */
/**
 * Clears current PIN for Valet Mode.
 * PIN must be set when Valet mode is activated again
 *
 * @see SetValetModeRequest.password
 */
class ClearValetPinRequest (
        vehicleId: Int
) : TeslaRequest<SuccessResponse>() {
    override val endpoint = "api/1/vehicles/$vehicleId/command/reset_valet_pin"
    override val method = HttpMethod.Post
}

class SetValetModeRequest (
        val vehicleId: Int,
        /**
         * Whether to turn it on or off
         *
         * if false, must include password
         */
        val mode: Boolean,
        /**
         * PIN to deactivate Valet Mode
         */
        val password: Int?
) : TeslaRequest<SuccessResponse>() {
    override val endpoint = "api/1/vehicles/$vehicleId/command/set_valet_mode"
    override val method = HttpMethod.Post

    override fun generateParameters(): Map<String, Any?> {
        return mapOf(
                "mode" to mode,
                "password" to password
        )
    }
}