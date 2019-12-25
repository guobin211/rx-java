package heap;

import java.util.ArrayList;

/**
 * MaxHeap 最大堆
 * @author guobin211
 * @version 0.0.1
 */
public class MaxHeap<E extends Comparable<E>> {

    private ArrayList<E> data;

    public MaxHeap(int capacity) {
        this.data = new ArrayList<>(capacity);
    }

    public MaxHeap() {
        this.data = new ArrayList<>();
    }

    public int size() {
        return data.size();
    }

    /**
     * 堆空判断
     * @return 空堆
     */
    public boolean isEmpty() {
        return data.isEmpty();
    }

    public E findMax() {
        if (data.isEmpty()) {
            throw new IllegalArgumentException("the MaxHead is empty");
        }
        return data.get(0);
    }

    public E extractMax() {
        E res = findMax();
        // swap
        siftDown(0);
        return res;
    }

    /**
     * 添加元素
     * @param e element
     */
    public void add(E e) {
        data.add(data.size(), e);
        siftUp(data.size() - 1);
    }

    /**
     * 上浮
     * @param k 索引
     */
    private void siftUp(int k) {
        E temp;
        while (k >0 && data.get(parent(k)).compareTo(data.get(k)) < 0) {
            temp = data.get(k);
            data.set(k, data.get(parent(k)));
            data.set(parent(k), temp);
            k = parent(k);
        }
    }

    /**
     * 下沉操作
     * @param k 索引
     */
    private void siftDown(int k) {
        while (leftChild(k) < data.size()) {
            // todo
        }
    }

    /**
     * 获取父节点索引
     * @param index 元素的索引
     * @return 父节点的索引
     */
    private int parent(int index) {
        if (index == 0) {
            throw new IllegalArgumentException("index 0 doesn't have parent ");
        }
        return (index - 1 )/ 2;
    }

    /**
     * 获取左child的索引
     * @param index 元素的索引
     * @return 左孩子的索引
     */
    private int leftChild(int index) {
        return index * 2 + 1;
    }

    private int rightChild(int index) {
        return index * 2 + 2;
    }
}
