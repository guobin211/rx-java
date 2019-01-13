package queue;

/**
 * File LoopQueue.java
 * 循环队列
 *
 * @author guobin201314@gmail.com on 2018/12/8 21:10
 * @version jdk 1.8.0
 */
public class LoopQueue<E> implements Queue <E> {

    private E[] data;
    private int front, tail;
    private int size;

    public LoopQueue(int capacity) {
        data = ( E[] ) new Object[ capacity + 1 ];
        front = 0;
        tail = 0;
        size = 0;
    }

    public LoopQueue() {
        this(10);
    }

    public int getCpacity() {
        return data.length - 1;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return front == tail;
    }

    @Override
    public void enqueue(E e) {
        // 扩容
        if ((tail + 1) % data.length == front) {
            resize(getCpacity() * 2);
        }
        data[ tail ] = e;
        tail = (tail + 1) % data.length;
        size++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("empty queue");
        }

        E res = data[ front ];
        data[ front ] = null;
        front = (front + 1) % data.length;
        size--;

        // 缩容
        if (size == getCpacity() / 4 && getCpacity() > 4) {
            resize(getCpacity() / 2);
        }

        return res;
    }

    @Override
    public E getFront() {
        return data[front];
    }

    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Queue: size = %d, capacity = %d", size, getCpacity()));
        res.append("front [");

        for (int i = front; i !=tail; i=(i+1)%data.length) {
            res.append(data[i]);
            if ((i+1)%data.length != tail) {
                res.append(", ");
            }
        }

        res.append("] tail");
        return res.toString();
    }


    public static void main(String[] args) {
        LoopQueue<Integer> loopQueue = new LoopQueue <>();

        for (int i = 0; i <10 ; i++) {
            loopQueue.enqueue(i);
        }

        System.out.println(loopQueue.toString());

        loopQueue.dequeue();
        System.out.println(loopQueue.toString());

        System.out.print(loopQueue.getFront());

    }

    private void resize(int newCapacity) {
        E[] newData = ( E[] ) new Object[ newCapacity + 1 ];

        for (int i = 0; i < size; i++) {
            newData[ i ] = data[ (i + front) % data.length ];
        }
        data = newData;
        front = 0;
        tail = size;
    }
}
