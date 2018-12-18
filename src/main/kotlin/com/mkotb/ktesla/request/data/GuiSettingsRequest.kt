package com.mkotb.ktesla.request.data

import com.mkotb.ktesla.model.GuiSettings
import com.mkotb.ktesla.request.TeslaRequest
import com.mkotb.ktesla.request.TeslaResponse
import io.ktor.http.HttpMethod

data class GuiSettingsRequest (
        val vehicleId: Long
) : TeslaRequest<GuiSettingsResponse>() {
    override val endpoint = "api/1/vehicles/$vehicleId/data_request/gui_settings"
    override val method = HttpMethod.Get
}

class GuiSettingsResponse (
        val response: GuiSettings
) : TeslaResponse()
