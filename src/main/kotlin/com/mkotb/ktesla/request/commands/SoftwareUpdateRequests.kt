package com.mkotb.ktesla.request.commands

import com.mkotb.ktesla.request.SuccessResponse
import com.mkotb.ktesla.request.TeslaRequest
import io.ktor.http.HttpMethod

/**
 * Schedules a software update if one is available
 */
class ScheduleSoftwareUpdateRequest (
        vehicleId: Long,
        /**
         * How many seconds to delay the install
         * 0 for immediate
         */
        val timeToInstall: Long
) : TeslaRequest<SuccessResponse>() {
    override val endpoint = "api/1/vehicles/$vehicleId/command/schedule_software_update"
    override val method = HttpMethod.Post

    override fun generateParameters(): Map<String, Any?> {
        return mapOf (
                "offset_sec" to timeToInstall
        )
    }
}

/**
 * Cancels a software update if one is scheduled and hasn't started
 */
class CancelSoftwareUpdateRequest (
        vehicleId: Long
) : TeslaRequest<SuccessResponse>() {
    override val endpoint = "api/1/vehicles/$vehicleId/command/cancel_software_update"
    override val method = HttpMethod.Post
}