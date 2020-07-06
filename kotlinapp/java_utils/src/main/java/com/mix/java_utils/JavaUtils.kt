package com.mix.java_utils

fun main() {
    println("Hello Kotlin Library")

    testQueue()
}

fun testQueue() {
    val queue = Queue<Number>()
    val queue2 = sun.misc.Queue<Number>()

    for (i in 0..10) {
        queue.enqueue(i)
        queue2.enqueue(i)
    }

    for (i in 0..10) {
        print(queue.dequeue())
        println(queue2.dequeue())
    }
}