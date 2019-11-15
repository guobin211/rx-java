package com.mix.ele.kotlin

class DataProvider(private val rating: Float) {
    /*
    * switch case
    * */
    fun getLevelByRating(): String {
        return when {
            rating > 90 -> "优秀"
            rating > 80 -> "良好"
            rating > 60 -> "及格"
            else -> "不及格"
        }
    }
}

fun main() {
    println(DataProvider(77F).getLevelByRating())
}
