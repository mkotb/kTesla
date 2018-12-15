package com.mkotb.ktesla.request.commands.speed

import com.mkotb.ktesla.request.SuccessResponse
import com.mkotb.ktesla.request.TeslaRequest
import io.ktor.http.HttpMethod

class SetSpeedLimitRequest (
        vehicleId: Int,
        // must be between 50 and 90 mph
        private val limit: Int
) : TeslaRequest<SuccessResponse>() {
    override val endpoint = "api/1/vehicles/$vehicleId/command/speed_limit_set_limit"
    override val method = HttpMethod.Post

    override fun generateParameters(): Map<String, Any?> {
        return mapOf(
                "limit_mph" to limit
        )
    }
}
