package com.mkotb.ktesla.request.commands

import com.mkotb.ktesla.request.SuccessResponse
import com.mkotb.ktesla.request.TeslaRequest
import io.ktor.http.HttpMethod

/**
 * Enables keyless driving. One could start driving the car
 * without a key within two minutes of sending this request
 */
class RemoteStartRequest (
        vehicleId: Long,
        /**
         * Password to the authenticated account
         */
        val password: String
) : TeslaRequest<SuccessResponse>() {
    override val endpoint = "api/1/vehicles/$vehicleId/command/remote_start"
    override val method = HttpMethod.Post

    override fun generateParameters(): Map<String, Any?> {
        return mapOf(
                "password" to password
        )
    }
}
