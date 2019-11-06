package com.mix.ele.kotlin

/**
 * @title ControlFlow
 * @author guobin211
 * @version 0.0.1
 * @date 2019-11-06  13:24
 */
class ControlFlow {
    fun cases(obj: Any) {
        when(obj) {
            1 -> println("1 Number")
            "1" -> println("1 String")
            is Long -> println("Long is $obj")
            !is String -> println("Not String")
            else -> println("Unknown")
        }
    }
}

fun main() {
    println("hello kotlin ControlFlow")
    ControlFlow().cases(1)
}