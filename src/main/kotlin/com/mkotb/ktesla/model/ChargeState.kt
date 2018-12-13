package com.mkotb.ktesla.model

import com.google.gson.annotations.SerializedName

data class ChargeState (
        @SerializedName("battery_heater_on")
        val batteryHeaterStatus: Boolean,
        // battery level percentage 0-100
        val batteryLevel: Int,
        // battery range in the configured distance unit
        val batteryRange: Double,
        // in amps
        val chargeCurrentRequest: Int,
        // in amps
        val chargeCurrentRequestMax: Int,
        // KwH of how much energy has been added since plugged in
        val chargeEnergyAdded: Double,
        val chargeLimitSoc: Int,
        val chargeLimitSocMax: Int,
        val chargeLimitSocMin: Int,
        val chargeLimitSocStd: Int,
        // charge miles added since the last charging session
        val chargeMilesAddedIdeal: Double,
        val chargeMilesAddedRated: Double,
        @SerializedName("charge_port_door_open")
        val isChargePortOpen: Boolean,
        @SerializedName("charge_port_latch")
        val chargePortState: ChargePortState,
        // charge rate in KW
        val chargeRate: Double,
        val chargeToMaxRange: Boolean,
        // in amps
        val chargerActualCurrent: Int,
        // unknown ATM, becomes lower while charging
        val chargerPilotCurrent: Int,
        // power (in amps) delivered by the charger
        val chargerPower: Int,
        // voltage coming from the charger
        val chargerVoltage: Int,
        val chargingState: ChargingState,
        @SerializedName("conn_charge_cable")
        // the charging cable used at the moment
        // value is "<invalid>" when not charging
        val chargeCable: String,
        // estimated battery range in configured distance unit
        @SerializedName("est_battery_range")
        val estimatedBatteryRange: Double,
        // the brand of the fast charger
        // value is "<invalid>" when not charging
        // e.g. it is "Tesla" when using a Tesla Supercharger
        val fastChargerBrand: String,
        val fastChargerPresent: Boolean,
        // typically the same as fastChargerBrand
        val fastChargerType: String,
        // the "best case scenario" for battery range
        // typically 20-40 miles above estimatedBatteryRange
        // which is more conservative
        val idealBatteryRange: Double,
        val managedChargingActive: Boolean,
        val managedChargingStartTime: Long?,
        val managedChargingUserCanceled: Boolean?,
        val maxRangeChargeCounter: Int,
        val notEnoughPowerToHeat: Boolean?,
        val scheduledChargingPending: Boolean,
        val scheduledChargingStartTime: Long?,
        // todo figure out what unit this is in
        val timeToFullCharge: Double,
        val timestamp: Long,
        val tripCharging: Boolean,
        // what percentage of the battery level is currently usable
        // always lower than batteryLevel
        // Typically two or so percent lower
        val usableBatteryLevel: Int
        // todo figure out what user charge enable request looks like
)

enum class ChargePortState {
    ENGAGED,
    DISENGAGED
}

enum class ChargingState {
    CHARGING,
    DISCONNECTED,
    STOPPED
}