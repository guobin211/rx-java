package com.mix.ele.kotlin

/**
 * @title Inheritance
 * @author guobin211
 * @version 0.0.1
 * @date 2019-11-06  13:13
 */
open class Inheritance {
    open fun sayHello() {
        println("hello Inheritance !")
    }
}

/*
* 继成与覆写
* */
class SubYork: Inheritance() {

    override fun sayHello() {
        println("hello SubYork override Inheritance !")
    }
}

open class Tiger(private val name: String) {
    fun sayHello() {
        println("a tiger name is $name")
    }
}

class ChinaTiger(private val name: String, val place: String): Tiger(name) {
    fun sayWellcome() {
        println("a ChinaTiger name is $name from $place")
    }
}