package queue;

/**
 * File Queue.java
 *
 * @author guobin201314@gmail.com on 2018/12/8 20:39
 * @version jdk 1.8.0
 */
public interface Queue<E> {

    int getSize();

    boolean isEmpty();

    void enqueue(E e);

    E dequeue();

    E getFront();
}
