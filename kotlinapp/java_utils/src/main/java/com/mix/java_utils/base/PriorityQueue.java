package com.mix.java_utils.base;

/**
 * com.mix.java_utils.base
 * 优先队列
 * @author GuoBin 2020-06-24
 */
public interface PriorityQueue<E> {
    void enqueue(E e);
    E dequeue();
    E getFront();
    int getSize();
    boolean isEmpty();
}
