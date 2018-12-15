package com.mkotb.ktesla.model

import com.google.gson.annotations.SerializedName

data class ClimateState (
        val batteryHeater: Boolean,
        val batteryHeaterNoPower: Boolean,
        /**
         * Temperature setting for driver seat in configured temperature unit
         *
         * @see GuiSettings.temperatureUnit
         */
        @SerializedName("driver_temp_setting")
        val driverTemperature: Double,
        /**
         * Fan level
         */
        val fanStatus: Int,
        /**
         * The temperature inside of the car in configured temperature unit
         *
         * @see GuiSettings.temperatureUnit
         */
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
        /**
         * The max temperature the car can provide in configured temperature unit
         *
         * @see GuiSettings.temperatureUnit
         */
        val maxAvailableTemperature: Double,
        /**
         * The min temperature the car can provide in configured temperature unit
         *
         * @see GuiSettings.temperatureUnit
         */
        val minAvailableTemperature: Double,
        /**
         * The temperature outside the car in the configured temperature unit
         *
         * @see GuiSettings.temperatureUnit
         */
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
        /**
         * Whether the side mirror heaters are on
         */
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
