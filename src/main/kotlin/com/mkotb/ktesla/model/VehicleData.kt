package com.mkotb.ktesla.model

import com.google.gson.annotations.SerializedName

open class VehicleData (
        /**
         * This is the id you want to use in
         * almost every request regarding the
         * vehicle. In terms of requests,
         * ignore vehicleId
         *
         * @see vehicleId
         */
        val id: Long,
        val vehicleId: Long,
        val vin: String,
        val displayName: String,
        @SerializedName("option_codes")
        val rawOptionCodes: String,
        val color: String?,
        val tokens: List<String>,
        /**
         * @see OnlineState
         */
        @SerializedName("state")
        val onlineState: String,
        val inService: Boolean,
        val backsetToken: String?,
        val backseatTokenUpdatedAt: Long?
) {
    val optionCodes: List<String>
        get() = rawOptionCodes.split(",")

    fun hasOptionCode(code: String): Boolean {
        return optionCodes.contains(code)
    }
}

object OnlineState {
    val ONLINE = "Online"
    val ASLEEP = "Asleep"
}