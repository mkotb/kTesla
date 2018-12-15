package com.mkotb.ktesla.model

class TeslaData (
        id: Int,
        vehicleId: Int,
        vin: String,
        displayName: String,
        rawOptionCodes: String,
        color: String,
        tokens: List<String>,
        onlineState: OnlineState,
        val inService: Boolean,
        val backsetToken: String?,
        val backseatTokenUpdatedAt: Long?,
        val driveState: DriveState,
        val climateState: ClimateState,
        val chargeState: ChargeState,
        val vehicleState: VehicleState,
        val vehicleConfig: VehicleConfig
) : VehicleData(
        id, vehicleId, vin,
        displayName, rawOptionCodes, color,
        tokens, onlineState
)