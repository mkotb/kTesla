package com.mkotb.ktesla.model

import com.google.gson.annotations.SerializedName

open class VehicleData (
        val id: Int,
        val vehicleId: Int,
        val vin: String,
        val displayName: String,
        @SerializedName("option_codes")
        val rawOptionCodes: String,
        val color: String,
        val tokens: List<String>,
        @SerializedName("state")
        val onlineState: OnlineState
) {
    val optionCodes: List<String>
        get() = rawOptionCodes.split(",")
}

enum class OnlineState {
    ONLINE,
    ASLEEP
}