package com.mkotb.ktesla.request.commands.charge

import com.mkotb.ktesla.request.SuccessResponse
import com.mkotb.ktesla.request.TeslaRequest
import io.ktor.http.HttpMethod

/**
 * Sets the charge limit to "standard"
 */
class ChargeStandardLimitRequest (
        vehicleId: Long
) : TeslaRequest<SuccessResponse>() {
    override val endpoint = "api/1/vehicles/$vehicleId/command/charge_standard"
    override val method = HttpMethod.Post
}

/**
 * Sets the charge limit to 100%
 */
class ChargeMaxLimitRequest (
        vehicleId: Long
) : TeslaRequest<SuccessResponse>() {
    override val endpoint = "api/1/vehicles/$vehicleId/command/charge_max_range"
    override val method = HttpMethod.Post
}


/**
 * Sets the charge limit to assigned value
 */
class SetChargeLimitRequest (
        vehicleId: Long,
        /**
         * Between 0-100. Percentage the battery will charge to
         */
        val percent: Int
) : TeslaRequest<SuccessResponse>() {
    override val endpoint = "api/1/vehicles/$vehicleId/command/set_charge_limit"
    override val method = HttpMethod.Post

    override fun generateParameters(): Map<String, Any?> {
        return mapOf (
                "percent" to percent
        )
    }
}

