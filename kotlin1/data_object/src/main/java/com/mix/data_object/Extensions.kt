package com.mix.data_object

import java.lang.reflect.Array

/**
 * 扩展函数
 */
fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp
}

/**
 * 判断为空数组或字符串
 */
fun Any.isEmpty(): Boolean {
    return when (this) {
        is String -> {
            this === ""
        }
        is Array -> {
            this.isEmpty()
        }
        else -> {
            this.toString() === ""
        }
    }
}