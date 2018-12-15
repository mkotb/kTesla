package com.mkotb.ktesla.model

import com.google.gson.annotations.SerializedName

class TeslaData (
        val id: Int,
        val userId: Int,
        val vehicleId: Int,
        val vin: String,
        val displayName: String,
        @SerializedName("option_codes")
        val rawOptionCodes: String,
        val color: String,
        val tokens: List<String>,
        @SerializedName("state")
        val onlineState: OnlineState,
        val inService: Boolean,
        val backsetToken: String?,
        val backseatTokenUpdatedAt: Long?,
        val driveState: DriveState,
        val climateState: ClimateState,
        val chargeState: ChargeState,
        val vehicleState: VehicleState,
        val vehicleConfig: VehicleConfig
) {
    val optionCodes: List<String>
        get() = rawOptionCodes.split(",")
}

enum class OnlineState {
    ONLINE,
    OFFLINE
}