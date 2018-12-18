package com.mkotb.ktesla.request.commands

import com.mkotb.ktesla.request.SuccessResponse
import com.mkotb.ktesla.request.TeslaRequest
import io.ktor.http.HttpMethod

/**
 * Unlocks the door to the car and extends handles if applicable
 */
class UnlockDoorRequest (
        vehicleId: Long
) : TeslaRequest<SuccessResponse>() {
    override val endpoint = "api/1/vehicles/$vehicleId/command/door_unlock"
    override val method = HttpMethod.Post
}

/**
 * Locks the door to the car and detracts handles if applicable
 */
class LockDoorRequest (
        vehicleId: Long
) : TeslaRequest<SuccessResponse>() {
    override val endpoint = "api/1/vehicles/$vehicleId/command/door_lock"
    override val method = HttpMethod.Post
}
