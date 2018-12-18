package com.mkotb.ktesla.request.commands.charge

import com.mkotb.ktesla.request.SuccessResponse
import com.mkotb.ktesla.request.TeslaRequest
import io.ktor.http.HttpMethod

/**
 * Opens the charge port door
 */
class OpenChargePortRequest (
        vehicleId: Long
) : TeslaRequest<SuccessResponse>() {
    override val endpoint = "api/1/vehicles/$vehicleId/command/charge_port_door_open"
    override val method = HttpMethod.Post
}

/**
 * Closes the charge port door if it's motorized
 */
class CloseChargePortRequest (
        vehicleId: Long
) : TeslaRequest<SuccessResponse>() {
    override val endpoint = "api/1/vehicles/$vehicleId/command/charge_port_door_close"
    override val method = HttpMethod.Post
}

