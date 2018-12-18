package com.mkotb.ktesla

class TeslaRequestException (
        val error: String,
        val errorDescription: String?
) : RuntimeException(error)
