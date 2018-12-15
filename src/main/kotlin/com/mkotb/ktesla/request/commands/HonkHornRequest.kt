package com.mkotb.ktesla.request.commands

import com.mkotb.ktesla.request.SuccessResponse
import com.mkotb.ktesla.request.TeslaRequest
import io.ktor.http.HttpMethod

/**
 * Honks horn twice
 */
class HonkHornRequest (
        vehicleId: Int
) : TeslaRequest<SuccessResponse>() {
    override val endpoint = "api/1/vehicles/$vehicleId/command/honk_horn"
    override val method = HttpMethod.Post
}

