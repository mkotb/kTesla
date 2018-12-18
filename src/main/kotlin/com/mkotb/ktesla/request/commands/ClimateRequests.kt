package com.mkotb.ktesla.request.commands

import com.mkotb.ktesla.request.SuccessResponse
import com.mkotb.ktesla.request.TeslaRequest
import io.ktor.http.HttpMethod

/**
 * Starts the HVAC system
 */
class StartAutoConditioningRequest (
        vehicleId: Long
) : TeslaRequest<SuccessResponse>() {
    override val endpoint = "api/1/vehicles/$vehicleId/command/auto_conditioning_start"
    override val method = HttpMethod.Post
}

/**
 * Stops the HVAC system
 */
class StopAutoConditioningRequest (
        vehicleId: Long
) : TeslaRequest<SuccessResponse>() {
    override val endpoint = "api/1/vehicles/$vehicleId/command/auto_conditioning_stop"
    override val method = HttpMethod.Post
}

class SetTemperatureRequest (
        vehicleId: Long,
        /**
         * Temperature in celsius, regardless of region or display settings
         */
        val driverTemperature: Double,
        /**
         * Temperature in celsius, regardless of region or display settings
         */
        val passengerTemperature: Double
) : TeslaRequest<SuccessResponse>() {
    override val endpoint = "api/1/vehicles/$vehicleId/command/set_temp"
    override val method = HttpMethod.Post

    override fun generateParameters(): Map<String, Any?> {
        return mapOf (
                "driver_temp" to driverTemperature,
                "passenger_temp" to passengerTemperature
        )
    }
}