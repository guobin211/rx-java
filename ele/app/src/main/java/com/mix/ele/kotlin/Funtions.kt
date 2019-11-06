package com.mix.ele.kotlin

/**
 * @title Funtions
 * @author guobin211
 * @version 0.0.1
 * @date 2019-11-06  13:41
 */
class Funtions {
    override fun toString(): String {
        return "class Funtions: {}"
    }
}

fun printMessage(message: String, prefix: String = "Info", log: String?) {
    println("Log $message with $prefix and $log")
}

fun main() {
    printMessage("hello", "kt", null)
}

