package com.mkotb.ktesla.model

data class VehicleConfig (
        val canAcceptNavigationRequests: Boolean,
        val canActuateTrunks: Boolean,
        val carSpecialType: String,
        var carType: String,
        /**
         * The type of charge port, could be something like:
         * "US" or "EU"
         */
        var chargePortType: String,
        val euVehicle: Boolean,
        val exteriorColor: String,
        val hasAirSuspension: Boolean,
        val hasLudicrousMode: Boolean,
        val motorizedChargePort: Boolean,
        val perfConfig: String,
        // todo figure out what these values mean
        val plg: Boolean,
        val rhd: Boolean,
        val rearSeatHeaters: Int,
        val roofColor: String,
        // todo figure out what this means
        val seatType: Int,
        val spoilerType: String,
        val sunRoofInstalled: Int,
        /**
         * When there are no third row seats, the value is "None"
         * ... I still don't know what it is when there are some
         */
        val thirdRowSeats: String,
        val trimPadging: String,
        val wheelType: String,
        val timestamp: Long
)
