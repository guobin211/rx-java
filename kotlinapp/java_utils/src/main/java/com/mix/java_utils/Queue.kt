package com.mix.java_utils

import com.mix.java_utils.base.IQueue

/**
 * com.mix.java_utils
 * @author GuoBin 2020-06-27
 */
class Queue<E>: IQueue<E> {

    private val data: MutableList<E> = mutableListOf()

    override fun enqueue(e: E) {
        this.data.add(0, e);
    }

    override fun dequeue(): E {
        return this.data.removeAt(this.data.size - 1)
    }

    override fun getFront(): E {
        return this.data.first();
    }

    override fun getSize(): Int {
        return this.data.size;
    }

    override fun isEmpty(): Boolean {
        return this.data.isEmpty();
    }
}