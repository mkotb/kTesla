package com.mkotb.ktesla.request

import com.mkotb.ktesla.model.GuiSettings
import io.ktor.http.HttpMethod

data class GuiSettingsRequest (
        val vehicleId: Int
) : TeslaRequest<GuiSettingsResponse>() {
    override val endpoint = "api/1/vehicles/$vehicleId/data_request/gui_settings"
    override val method = HttpMethod.Get
}

class GuiSettingsResponse (
        val response: GuiSettings
) : TeslaResponse()
