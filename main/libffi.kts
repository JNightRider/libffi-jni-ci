#!/usr/bin/env kotlin

import java.io.File
import java.io.FileInputStream
import java.util.Properties

val libfiiConfig = File("./config.properties")
if (libfiiConfig.exists()) {
    val properties = Properties()
    properties.load(FileInputStream(libfiiConfig))
    properties.forEach { key, value ->
        println("$key: $value")
    }
} else {
    println("No config file found at $libfiiConfig")
}
