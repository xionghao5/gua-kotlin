package com.gua.j8kgweb.util

class StringUtil {
    fun getRandomString(length: Int): String {
        val allowedChars = "rnm退钱,fuck,干,giao,妈卖批,瓜皮,靓仔,扑街"
        return (1..length)
            .map { allowedChars.random() }
            .joinToString("")
    }
}

fun main() {
    println(StringUtil().getRandomString(5))
}