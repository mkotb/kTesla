package com.mkotb.ktesla.model

class TeslaData (
        id: Long,
        vehicleId: Long,
        vin: String,
        displayName: String,
        rawOptionCodes: String,
        color: String,
        tokens: List<String>,
        onlineState: String,
        inService: Boolean,
        backsetToken: String?,
        backseatTokenUpdatedAt: Long?,
        val driveState: DriveState,
        val climateState: ClimateState,
        val chargeState: ChargeState,
        val vehicleState: VehicleState,
        val vehicleConfig: VehicleConfig
) : VehicleData (
        id, vehicleId, vin,
        displayName, rawOptionCodes, color,
        tokens, onlineState, inService, backsetToken,
        backseatTokenUpdatedAt
)