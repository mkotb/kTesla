package com.mkotb.ktesla.model

import com.google.gson.annotations.SerializedName

data class ChargeState (
        @SerializedName("battery_heater_on")
        val batteryHeaterStatus: Boolean,
        /**
         * Battery level percentage 0-100
         */
        val batteryLevel: Int,
        /**
         * Battery range in the configured distance unit
         * @see GuiSettings.distanceUnit
         */
        val batteryRange: Double,
        /**
         * Charge current request in amps
         */
        val chargeCurrentRequest: Int,
        /**
         * Charge current request max in amps
         */
        val chargeCurrentRequestMax: Int,
        /**
         * KwH of how much energy has been added since plugged in
         */
        val chargeEnergyAdded: Double,
        val chargeLimitSoc: Int,
        val chargeLimitSocMax: Int,
        val chargeLimitSocMin: Int,
        val chargeLimitSocStd: Int,
        /**
         * Charge miles added since last charging session
         */
        val chargeMilesAddedIdeal: Double,
        val chargeMilesAddedRated: Double,
        @SerializedName("charge_port_door_open")
        val isChargePortOpen: Boolean,
        /**
         * @see ChargePortState
         */
        @SerializedName("charge_port_latch")
        val chargePortState: String,
        /**
         * charge rate in the configured charge unit
         *
         * @see GuiSettings.chargeRateUnit
         */
        val chargeRate: Double,
        val chargeToMaxRange: Boolean,
        /**
         * Charger actual current in amps
         */
        val chargerActualCurrent: Int,
        // unknown ATM, becomes lower while charging
        val chargerPilotCurrent: Int,
        /**
         * Power (in amps) delivered by the charger
         */
        val chargerPower: Int,
        /**
         * Voltage coming from the charger
         */
        val chargerVoltage: Int,
        /**
         * Current charging state
         *
         * @see ChargingState
         */
        val chargingState: String,
        @SerializedName("conn_charge_cable")
        /**
         * The charging cable used at the moment
         * Value is "<invalid>" when not charging
         */
        val chargeCable: String,
        /**
         * Estimated battery range in configured distance unit
         *
         * @see GuiSettings.distanceUnit
         */
        @SerializedName("est_battery_range")
        val estimatedBatteryRange: Double,
        /**
         * The brand of the fast charger e.g. it is "Tesla" when using a Tesla Supercharger
         * Value is "<invalid>" when not charging
         */
        val fastChargerBrand: String,
        val fastChargerPresent: Boolean,
        /**
         * Typically the same as fastChargerBrand
         */
        val fastChargerType: String,
        /**
         * The "best case scenario" for battery range
         * Typically 20-40 miles above estimatedBatteryRange
         * which tends to be conservative. Still uses the configured
         * distance unit
         *
         * @see estimatedBatteryRange
         * @see GuiSettings.distanceUnit
         */
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
        /**
         * The percentage of the battery level that is currently usable
         * Always lower than batteryLevel, typically two or so percent lower.
         *
         * @see batteryLevel
         */
        val usableBatteryLevel: Int
        // todo figure out what user charge enable request looks like
)

object ChargePortState {
    val ENGAGED = "Engaged"
    val DISENGAGED = "Disengaged"
}

object ChargingState {
    val CHARGING = "Charging"
    val DISCONNECTED = "Disconnected"
    val STOPPED = "Stopped"
}
