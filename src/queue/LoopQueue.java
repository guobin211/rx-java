package queue;

/*
 * LoopQueue
 * @Author guobin201314@gmail.com on 2019-06-12 21:55
 */
public class LoopQueue<E> implements IEventQueue<E> {

    private E[] data;
    private int front, tail;
    private int size;

    public LoopQueue() {
        this(10);
    }

    public LoopQueue(int capacity) {
        data = (E[]) new Object[capacity + 1];
        front = 0;
        tail = 0;
        size = 0;
    }

    public int getCapacity() {
        // 容积需要空置一个位置
        return data.length - 1;
    }

    @Override
    public void enqueue(E e) {
        // 入队 查看队列是否满了
        if ((tail + 1) % data.length == front) {
            // 扩容
            resize(getCapacity() * 2);
        }
        data[tail] = e;
        tail = (tail + 1) % data.length;
        size++;
    }

    private void resize(int newCapacity) {
        E[] newData = (E[]) new Object[newCapacity + 1];
        for (int i = 0; i < size; i++) {
            // 赋值偏移拷贝
            newData[i] = data[(front + i) % data.length];
        }
        data = newData;
        front = 0;
        tail = size;
    }

    @Override
    public E dequeue() {
        // 出队
        if (isEmpty()) {
            throw new IllegalArgumentException("queue is empty!");
        } else {
            E ret = data[front];
            data[front] = null;
            front = (front + 1) % data.length;
            size--;
            if (size == getCapacity() / 4 && getCapacity() / 2 != 0) {
                resize(getCapacity() / 2);
            }
            return ret;
        }
    }

    @Override
    public E getFront() {
        if (isEmpty()) {
            throw new IllegalArgumentException("queue is empty!");
        }
        return data[front];
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
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Queue: size = %d , capacity = %d\n", size, getCapacity()));
        res.append("front: [");
        for (int i = front; i != tail; i = (i + 1) % data.length) {
            res.append(data[i]);
            if ((i + 1) % data.length != tail)
                res.append(", ");
        }
        res.append("] tail");
        return res.toString();
    }
}
