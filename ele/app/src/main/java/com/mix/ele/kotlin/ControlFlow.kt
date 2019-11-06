package com.mix.ele.kotlin

/**
 * @title ControlFlow
 * @author guobin211
 * @version 0.0.1
 * @date 2019-11-06  13:24
 */
class ControlFlow {
    fun cases(obj: Any) {
        when (obj) {
            1 -> println("1 Number")
            "1" -> println("1 String")
            is Long -> println("Long is $obj")
            !is String -> println("Not String")
            else -> println("Unknown")
        }
    }
}

/**
 * testReturn
 * return. 默认从最直接包围它的函数或者匿名函数返回
 * i is 1 j is 1
 */
fun testReturn() {
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 10 downTo 1) {
            if (i >= j) {
                println("i is $i j is $j")
                // 终止最直接包围它的循环
                return
            }
        }
    }
}

/*
* 终止最直接包围它的循环
* */
fun testBreak() {
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 10 downTo 1) {
            if (i >= j) {
                println("i is $i j is $j")
                // 终止最直接包围它的循环
                break@loopJ
            }
        }
    }
}

/*
* 继续下一次最直接包围它的循环
* loopJ
* */
fun testContinue() {
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 10 downTo 1) {
            if (i >= j) {
                println("i is $i j is $j")
                // 终止最直接包围它的循环
//                continue@loopJ
                continue
            }
        }
    }
}

fun main() {
    println("hello kotlin ControlFlow")
    ControlFlow().cases(1)

    // return. 默认从最直接包围它的函数或者匿名函数返回
    // break。终止最直接包围它的循环
    // continue。继续下一次最直接包围它的循环
//    testReturn()
//    testBreak()
    testContinue()
}