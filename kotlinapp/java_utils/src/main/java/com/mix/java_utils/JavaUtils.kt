package com.mix.java_utils

import com.mix.java_utils.queue.Queue
import java.util.*

fun main() {
    println("Hello Kotlin Library")

//  testQueue()
    testPriorityQueue()
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

fun testPriorityQueue() {
    val priorityQueue = PriorityQueue<Number>()
    val count = 10
    for (i in 0 until count) {
        priorityQueue.add((Math.random() * 10 - 1))
    }

    println(priorityQueue.size)

    println(priorityQueue.toString())

    while (!priorityQueue.isEmpty()) {
        println(priorityQueue.poll())
    }
}