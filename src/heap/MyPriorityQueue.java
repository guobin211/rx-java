package heap;

import queue.IEventQueue;
import java.util.Queue;

/**
 * MyPriorityQueue class
 * 基于最大堆的优先级队列
 *
 * @author GuoBin
 * @email guobin201314@gmail.com
 * @date 2019-06-23
 */
public class MyPriorityQueue<E extends Comparable<E>> implements IEventQueue<E> {

    private MaxHeap<E> maxHeap;

    public MyPriorityQueue() {
        maxHeap = new MaxHeap<>();
    }

    @Override
    public void enqueue(E e) {
        maxHeap.add(e);
    }

    @Override
    public E dequeue() {
        return maxHeap.extractMax();
    }

    @Override
    public E getFront() {
        return maxHeap.findMax();
    }

    @Override
    public int getSize() {
        return maxHeap.size();
    }

    @Override
    public boolean isEmpty() {
        return maxHeap.isEmpty();
    }
}
