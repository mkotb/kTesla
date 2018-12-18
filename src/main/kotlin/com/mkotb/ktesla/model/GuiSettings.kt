package com.mkotb.ktesla.model

import com.google.gson.annotations.SerializedName

data class GuiSettings (
        /**
         * Whether time is displayed as 24-hour time
         */
        @SerializedName("gui_24_hour_time")
        val displayTimeAs24: Boolean,
        /**
         * Whether charge rate is in km/hr or mi/hr
         */
        @SerializedName("gui_charge_rate_units")
        val chargeRateUnit: DistanceUnit,
        /**
         * Whether distance rate is in km/hr or mi/hr
         */
        @SerializedName("gui_distance_units")
        val distanceUnit: DistanceUnit,
        @SerializedName("gui_range_display")
        val rangeDisplay: String,
        /**
         * Whether temperature is in Fahrenheit or Celsius
         */
        @SerializedName("gui_temperature_units")
        val temperatureUnit: TemperatureUnit,
        val timestamp: Long
)

// all in unit per hour
enum class DistanceUnit(private val conversionFactor: Double) {
    @SerializedName("mi/hr")
    MILES(1.609344),
    @SerializedName("km/hr")
    KILOMETERS(0.621371192237);

    infix fun convert(distance: Double): Double {
        return distance * conversionFactor
    }
}

enum class TemperatureUnit {
    @SerializedName("F")
    FAHRENHEIT,
    @SerializedName("C")
    CELSIUS
}
