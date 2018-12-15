package com.mkotb.ktesla.model

import com.google.gson.annotations.SerializedName

class DriveState (
        /**
         * The last time (in epoch seconds) the gps location was updated
         */
        @SerializedName("gps_as_of")
        val gpsTimestamp: Long,
        /**
         * GPS Heading
         *
         * Value is between 0 and 360 where:
         * 0 (or 360) is North
         * 90 is East
         * 180 is South
         * 270 is West
         */
        val heading: Int,
        val latitude: Float,
        val longitude: Float,
        private val nativeLongitudeSupported: Int,
        val nativeLatitude: Float?,
        val nativeLongitude: Float?,
        /**
         * Standard used to retrieve this data
         * e.g. a possible value is WGS
         */
        val nativeType: String,
        val shiftState: ShiftState,
        /**
         * Speed of the car in configured distance unit
         *
         * @see GuiSettings.distanceUnit
         */
        val speed: Int,
        val timestamp: Long
) {
    val isNativeLongitudeSupported: Boolean
        get() = nativeLongitudeSupported == 1
}

enum class ShiftState {
    @SerializedName("D")
    DRIVE,
    @SerializedName("R")
    REVERSE,
    @SerializedName("P")
    PARKED,
    @SerializedName("N")
    NEUTRAL
}