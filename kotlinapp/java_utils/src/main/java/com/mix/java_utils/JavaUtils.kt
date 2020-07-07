package com.mix.java_utils

import com.mix.java_utils.base.IQueue

fun main() {
    println("Hello Kotlin Library")

    testQueue()
}

fun testQueue() {
    val count = 100000;
    val queue = Queue<Number>()
    // 循环队列
    val queue2 = sun.misc.Queue<Number>()
    val time1 = System.currentTimeMillis()
    for (i in 0..count) {
        queue.enqueue(i)
    }
    for (i in 0..count) {
        queue.dequeue()
    }
    val time1End = System.currentTimeMillis()
    println("queue1: " + (time1End - time1))

    val time2 = System.currentTimeMillis()
    for (i in 0..count) {
        queue2.enqueue(i)
    }
    for (i in 0..count) {
        queue2.dequeue()
    }
    val time2End = System.currentTimeMillis()
    println("queue2: " + (time2End - time2))
}
