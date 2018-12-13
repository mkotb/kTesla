package com.mkotb.ktesla.util

import com.google.gson.TypeAdapter
import com.google.gson.stream.JsonReader
import com.google.gson.stream.JsonWriter
import kotlinx.serialization.enumFromName
import kotlin.reflect.KClass

class LowercaseEnumAdapter<T : Enum<T>>(private val clazz: KClass<T>): TypeAdapter<T>() {
    override fun write(writer: JsonWriter, value: T) {
        writer.value(value.name.toLowerCase())
    }

    override fun read(reader: JsonReader): T {
        return enumFromName(clazz, reader.nextString().toUpperCase())
    }
}
