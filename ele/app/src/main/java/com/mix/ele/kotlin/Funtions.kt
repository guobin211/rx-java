package com.mix.ele.kotlin

import kotlin.math.abs
import kotlin.math.cos

/**
 * @title Funtions
 * @author guobin211
 * @version 0.0.1
 * @date 2019-11-06  13:41
 */
class Funtions {
    private val eps = 1E-10 // "good enough", could be 10^-15

    /*
    * 尾递归函数
    * 允许一些通常用循环写的算法改用递归函数来写，而无堆栈溢出的风险
    * */
    tailrec fun findFixPoint(x: Double = 1.0): Double = if (abs(x - cos(x)) < eps) x else findFixPoint(cos(x))

    override fun toString(): String {
        return "class Funtions: {}"
    }
}

/*
 * 扩展函数
 * swap(1, 2)
 * 交换位置
 */
fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp
}

open class Base {}

class Derived : Base() {}

open class BaseCaller {

    open fun Base.printFunctionInfo() {
        println("Base extension function in BaseCaller")
    }

    open fun Derived.printFunctionInfo() {
        println("Derived extension function in BaseCaller")
    }

    fun call(b: Base) {
        // 调用扩展函数
        b.printFunctionInfo()
    }
}

/*
* 类的继承与方法重写
* */
class DerivedCaller : BaseCaller() {
    // 重写方法
    override fun Base.printFunctionInfo() {
        println("Base extension function in DerivedCaller")
    }

    override fun Derived.printFunctionInfo() {
        println("Derived extension function in DerivedCaller")
    }
}

fun printMessage(message: String, prefix: String = "Info", log: String?) {
    println("Log $message with $prefix and $log")
}

typealias printCallback = (printType: String) -> Unit

/*
* 函数的默认参数,命名参数
* */
fun reformat(str: String,
             normalizeCase: Boolean = true,
             upperCaseFirstLetter: Boolean = true,
             divideByCamelHumps: Boolean = false,
             wordSeparator: Char = ' '): List<String> {
    return str.split(wordSeparator);
}

/*
* 函数作为参数传入函数
* */
fun functionParams(name: String, callback: (data: String) -> Unit) {
    val data = "the name is $name";
    callback(data);
}

/*
* 函数的可变数量参数
* vararg声明函数的参数是可变的
* */
fun arguments(vararg str: String) {
    for (s in str) {
        println(s)
    }
}

fun main() {
    printMessage("hello", "kt", null)

    // 匿名函数
    val myLog = fun(data: String) {
        println(data.length)
        if (data.length > 15) {
            println(data)
        } else {
            println("the data too short")
        }
    }

    functionParams("jack", myLog)
    // 不可变类型 Array
    val args = arrayOf("jack", "tom")
    args[0] = "admin"
    arguments(str = *args)
    // 索引元素可变数组
    val list = mutableListOf<String>()
    val ints = mutableListOf<Int>()
    for (i in 1..10) {
        list.add("第${i}个元素")
        ints.add(i)
    }
    list.forEach { println(it) }
    // 函数连续调用
    ints.filter { it % 2 == 0 }.forEach { el -> println(el) }
}

