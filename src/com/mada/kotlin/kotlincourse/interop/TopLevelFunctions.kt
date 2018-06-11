@file:JvmName("UtilityClass")

package com.mada.kotlin.kotlincourse.interop

const val copyrightYear = 2016

fun prefix(prefix: String, value: String): String {
    return "$prefix-$value"
}