package com.mix.ele.kotlin

/**
 * @title MutableStack
 * @author guobin211
 * @version 0.0.1
 * @date 2019-11-06  13:08
 */
class MutableStack<E>(vararg items: E) {

    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)

    fun peek(): E = elements.last()

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"
}

/*
* Generic Functions
* vararg 可变长参数函数 类似js种的arguments
* ``` javascript
*   function log(...args) {
*
*   }
* ```
* */
fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)