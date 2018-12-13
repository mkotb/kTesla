package com.mkotb.ktesla.model

import com.google.gson.annotations.SerializedName

class DriveState (
        // last time (in epoch seconds) the gps location was updated
        @SerializedName("gps_as_of")
        val gpsTimestamp: Long,
        // gps heading
        val heading: Int,
        val latitude: Float,
        val longitude: Float,
        private val nativeLongitudeSupported: Int,
        val nativeLatitude: Float?,
        val nativeLongitude: Float?,
        // standard used to retrieve this data
        // e.g. value is WGS
        val nativeType: String,
        val shiftState: ShiftState,
        // speed of the car in user-preferred unit
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