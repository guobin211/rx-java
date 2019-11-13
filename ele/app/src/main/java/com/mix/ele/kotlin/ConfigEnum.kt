package com.mix.ele.kotlin

/**
 * com.mix.ele.kotlin
 * @author guobin211
 * @date 2019-11-13 at 14:35
 * @version 0.0.1
 */
enum class ConfigEnum(val c: String) {
    HOST("http://localhost:8089/api")
}

enum class ColorEnum(val c: Int) {
    RED(0XFF0000),
    GREEN(0X00FF00),
    BLUE(0X0000FF)
}

fun main() {
    println(ColorEnum.BLUE)
}