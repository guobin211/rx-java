package queue;


import array.Array;

/**
 * File ArrayQueue.java
 *
 * @author guobin201314@gmail.com on 2018/12/8 20:38
 * @version jdk 1.8.0
 */
public class ArrayQueue<E> implements Queue<E> {

    private Array<E> array;

    public ArrayQueue(int capacity) {
        array = new Array(capacity);
    }

    public ArrayQueue() {
        array = new Array<>();
    }

    @Override
    public int getSize() {
        return array.getLength();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public void enqueue(E e) {
        array.addLast(e);
    }

    /**
     * 删除队列的尾部
     *
     * @return E
     */
    @Override
    public E dequeue() {
        return array.removeFirst();
    }

    /**
     * 队列的头
     *
     * @return E
     */
    @Override
    public E getFront() {
        return array.getFirst();
    }

    @Override
    public java.lang.String toString() {

        StringBuilder res = new StringBuilder();

        res.append("Queue: ");
        res.append("front [");

        for (int i = 0; i < array.getLength(); i++) {
            res.append(array.get(i));
            if (i != array.getLength() - 1) {
                res.append(", ");
            }
        }
        res.append("] tail");
        return res.toString();
    }

    public static void main(String[] args) {
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();

        for (int i = 0; i <5 ; i++) {
            arrayQueue.enqueue(i);
        }

        arrayQueue.dequeue();

        System.out.println(arrayQueue.getFront());
        System.out.println(arrayQueue.isEmpty());
        System.out.println(arrayQueue.getSize());
        System.out.println(arrayQueue.toString());

    }
}
