package com.mix.java_utils.base;

/**
 * com.mix.java_utils.base
 * 队列接口
 * @author GuoBin 2020-06-24
 */
public interface IQueue<E> {
    void enqueue(E e);
    E dequeue();
    E getFront();
    int getSize();
    boolean isEmpty();
}
