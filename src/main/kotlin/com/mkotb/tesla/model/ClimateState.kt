package com.mkotb.tesla.model

import com.google.gson.annotations.SerializedName

data class ClimateState (
        val batteryHeater: Boolean,
        val batteryHeaterNoPower: Boolean,
        // temperature setting for driver seat in celsius
        @SerializedName("driver_temp_setting")
        val driverTemperature: Double,
        // fan level
        val fanStatus: Int,
        // the inside temperature in celsius
        @SerializedName("inside_temp")
        val insideTemperature: Double,
        @SerializedName("is_auto_conditioning_on")
        val autoConditioningEnabled: Double,
        @SerializedName("is_climate_on")
        val climateStatus: Boolean,
        @SerializedName("is_front_defroster_on")
        val frontDefrosterEnabled: Boolean,
        val isPreconditioning: Boolean,
        @SerializedName("is_rear_defroster_on")
        val rearDefrosterEnabled: Boolean,
        @SerializedName("left_temp_direction")
        val leftTemperatureDirection: Int,
        // the max temperature the car can provide (celsius)
        val maxAvailableTemperature: Double,
        // the min temperature the car can provide (celsius)
        val minAvailableTemperature: Double,
        // the outside temperature
        val outsideTemperature: Double,
        @SerializedName("passenger_temp_setting")
        val passengerTemperatureSetting: Double,
        @SerializedName("right_temp_direction")
        val rightTemperatureDirection: Int,
        // seat heating configuration:
        val seatHeaterLeft: Boolean,
        val seatHeaterRight: Boolean,
        val seatHeaterRearCentre: Boolean,
        val seatHeaterRearLeft: Boolean,
        val seatHeaterRearRight: Boolean,
        @SerializedName("seat_heater_rear_left_back")
        val seatHeaterLeftTemperature: Double,
        @SerializedName("seat_heater_rear_right_back")
        val seatHeaterRightTemperature: Double,
        // whether the side mirror heaters are on
        @SerializedName("side_mirror_heaters")
        val sideMirrorHeater: Boolean,
        @SerializedName("smart_preconditioning")
        val smartPreconditioningEnabled: Boolean,
        @SerializedName("steering_wheel_heater")
        val steeringWheelHeaterEnabled: Boolean,
        @SerializedName("wiper_blade_heater")
        val wiperBladeHeaterEnabled: Boolean,
        val timestamp: Long
)
