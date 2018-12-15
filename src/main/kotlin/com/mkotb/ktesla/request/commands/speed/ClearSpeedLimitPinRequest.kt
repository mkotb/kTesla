package com.mkotb.ktesla.request.commands.speed

import com.mkotb.ktesla.request.SuccessResponse
import com.mkotb.ktesla.request.TeslaRequest
import io.ktor.http.HttpMethod

class ClearSpeedLimitPinRequest (
        vehicleId: Int,
        // existing pin
        private val pin: Int
) : TeslaRequest<SuccessResponse>() {
    override val endpoint = "api/1/vehicles/$vehicleId/command/speed_limit_clear_pin"
    override val method = HttpMethod.Post

    override fun generateParameters(): Map<String, Any?> {
        return mapOf(
                "pin" to pin
        )
    }
}
