package com.mkotb.ktesla.model

import com.google.gson.annotations.SerializedName

class VehicleState (
        val apiVersion: Int,
        /**
         * @see AutoParkState
         */
        @SerializedName("autopark_state_v3")
        val autoParkState: String,
        @SerializedName("autopark_style")
        val autoParkStyle: String,
        val calendarSupported: Boolean,
        val carVersion: String,
        val centerDisplayState: Int,
        /**
         * Between 0-1, the extent to which the driver front door is open
         */
        @SerializedName("df")
        val driverFront: Double,
        /**
         * Between 0-1, the extent to which the driver rear door is open
         */
        @SerializedName("dr")
        val driverRear: Double,
        /**
         * Between 0-1, the extent to which the passenger front door is open
         */
        @SerializedName("pf")
        val passengerFront: Double,
        /**
         * Between 0-1, the extent to which the passenger rear door is open
         */
        @SerializedName("pr")
        val passengerRear: Double,
        /**
         * Between 0-1, the extent to which the front trunk is open
         */
        @SerializedName("ft")
        val frontTrunk: Double,
        val homeLinkNearby: Boolean,
        val isUserPresent: Boolean,
        val lastAutoParkError: String,
        val locked: Boolean,
        val mediaState: MediaState,
        val notificationsSupported: Boolean,
        /**
         * Odometer in configured units
         *
         * @see GuiSettings.distanceUnit
         */
        val odometer: Double,
        val parsedCalendarSupported: Boolean,
        val remoteStart: Boolean,
        val remoteStartSupported: Boolean,
        val softwareUpdate: SoftwareUpdate,
        @SerializedName("speed_limit_mode")
        val speedLimitStatus: SpeedLimitStatus,
        @SerializedName("sun_roof_percent_open")
        /**
         * How open the sun roof is (in percent)
         */
        val sunRoofStatus: Int,
        // todo convert to enum
        val sunRoofState: String,
        val timestamp: Long,
        val valetMode: Boolean,
        val valetPinNeeded: Boolean,
        val vehicleName: String
)

class MediaState (
        val remoteControlEnabled: Boolean
)

class SoftwareUpdate (
        /**
         * Expected duration in seconds
         */
        @SerializedName("expected_duration_sec")
        val expectedDuration: Int,
        /**
         * Status of the software update
         */
        val status: String
)

class SpeedLimitStatus (
        val active: Boolean,
        val currentLimitMph: Int,
        val maxLimitMph: Int,
        val minLimitMph: Int,
        val pinCodeSet: Boolean
)

object AutoParkState {
    val STANDBY = "Standby"
    val READY = "Ready"
}
