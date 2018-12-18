package com.mkotb.ktesla.model

object OptionCodes {
    val MODEL_S = "MDLS"
    val MODEL_X = "MDLX"
    val MODEL_3 = "MDL3"
    /**
     * North American region
     */
    val REGION_NA = "RENA"
    /**
     * Canadian Region
     */
    val REGION_CA = "RENC"
    /**
     * European region
     */
    val REGION_EU = "REEU"
    val TYPE_2_CHARGING_CONNECTOR = "APDX2"
    val NO_HEPA_FILTER = "AF00"
    val HEPA_FILTER = "AF02"
    val ENHANCED_AUTOPILOT = "APE1"
    val AUTOPILOT_2_BASE = "APF0"
    val AUTOPILOT_2_ENHANCED = "APF1"
    val FULL_SELF_DRIVING = "APF2"
    val AUTOPILOT_1_HARDWARE = "APPA"
    /**
     * One of the possible option codes for
     * AutoPilot 2.0 Hardware. Check the other
     * value as well
     *
     * @see AUTOPILOT_2_HARDWARE_B
     */
    val AUTOPILOT_2_HARDWARE_A = "APH0"
    val AUTOPILOT_2_HARDWARE_B = "APH2"
    val NO_AUDIO_PACKAGE = "AU00"
    val AUDIO_PACKAGE = "AU01"
    val NO_LUDICROUS = "BP00"
    val LUDICROUS_UPGRADE = "BP01"
    val NO_BATTERY_FIRMWARE_LIMIT = "BR00"
    /**
     * Car has a battery firmware limit
     * of 60 kWh
     */
    val BATTERY_FIRMWARE_LIMIT_60 = "BR03"
    /**
     * Car has a battery firmware limit
     * of 75 kWh
     */
    val BATTERY_FIRMWARE_LIMIT_75 = "BR05"
    val FROM_GENERAL_PRODUCTION = "BS00"
    val FROM_SPECIAL_PRODUCTION = "BS01"
    val STANDARD_CHARGER = "CH00"
    val DUAL_CHARGER = "CH01"
    val COUNTRY_US = "COUS"
    val NO_COLD_WEATHER_PACKAGE = "CW00"
    val SUBZERO_WEATHER_PACKAGE = "CW02"
    val NO_AUTOPILOT = "DA00"
    val LEFT_HAND_DRIVE = "DRLH"
    val RIGHT_HAND_DRIVE = "DRRH"
    val REAR_WHEEL_DRIVE = "DV2W"
    val ALL_WEEL_DRIVE = "DV4W"
    val NO_HOME_CHARGING = "HC00"
    val HOME_CHARGING = "HC01"
    val NO_SUPERCHARGING = "SC00"
    val SUPERCHARGING_ENABLED = "SC01"
    val PAY_PER_USE_SUPERCHARGING = "SC04"
    val FREE_SUPERCHRAGING = "SC05"
    val PACKAGE_NO_AUTOPILOT = "TP01"
    val PACKAGE_AUTOPILOT = "TP02"
    val PACKAGE_ENHANCED_AUTOPILOT = "TP03"
}