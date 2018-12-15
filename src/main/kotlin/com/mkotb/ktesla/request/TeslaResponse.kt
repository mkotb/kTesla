package com.mkotb.ktesla.request

// Base TeslaResponse
open class TeslaResponse {
}

class SuccessResponse (
        val reason: String?,
        val result: Boolean
) : TeslaResponse()
