package com.mkotb.ktesla.request.commands.charge

import com.mkotb.ktesla.request.SuccessResponse
import com.mkotb.ktesla.request.TeslaRequest
import io.ktor.http.HttpMethod

/**
 * Starts the charge if car is plugged in and not charging
 */
class ChargeStartRequest (
        vehicleId: Long
) : TeslaRequest<SuccessResponse>() {
    override val endpoint = "api/1/vehicles/$vehicleId/command/charge_start"
    override val method = HttpMethod.Post
}

/**
 * Stops the charge if car is plugged in but not charging
 */
class ChargeStopRequest (
        vehicleId: Long
) : TeslaRequest<SuccessResponse>() {
    override val endpoint = "api/1/vehicles/$vehicleId/command/charge_stop"
    override val method = HttpMethod.Post
}
