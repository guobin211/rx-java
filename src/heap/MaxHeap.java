package heap;

import java.util.IllformedLocaleException;
import java.util.Vector;

/**
 * MaxHeap class
 * <p>
 * 二叉堆某个节点的值总不大于其父节点的值
 * 堆的实现基于动态数组
 *
 * @author GuoBin
 * @date 2019-06-20
 */
public class MaxHeap<E extends Comparable<E>> {

    private Vector<E> data;

    public MaxHeap(int capacity) {
        data = new Vector<>(capacity);
    }

    public MaxHeap() {
        data = new Vector<>();
    }

    /**
     * 取出最大值
     *
     * @return e
     */
    public E extractMax() {
        E res = findMax();
        swap(0, data.size() - 1);
        data.remove(data.size() - 1);
        siftDown(0);
        return res;
    }

    /**
     * 下沉操作
     *
     * @param k int
     */
    private void siftDown(int k) {
        while (leftChild(k) < data.size()) {
            int j = leftChild(k);
            if (j + 1 < data.size() && data.get(j + 1).compareTo(data.get(j)) > 0) {
                j = rightChild(k);
                // data[j] 是 leftChild 和 rightChild中的最大值
            }
            if (data.get(k).compareTo(data.get(j)) >= 0) {
                break;
            }
            swap(k, j);
            k = j;
        }
    }

    public E findMax() {
        if (data.size() == 0) {
            throw new IllformedLocaleException("data is empty");
        }
        return data.get(0);
    }

    private void swap(int left, int right) {
        E temp = data.get(left);
        data.set(left, data.get(right));
        data.set(right, temp);
    }

    /**
     * 添加元素
     * 堆的上浮
     *
     * @param e element
     */
    public void add(E e) {
        data.add(e);
        siftUp(data.size() - 1);
    }

    /**
     * 上浮
     *
     * @param k key
     */
    private void siftUp(int k) {
        while (k > 0 && data.get(parent(k)).compareTo(data.get(k)) < 0) {
            // 和父节点交换位置
            E temp = data.get(k);
            data.set(k, data.get(parent(k)));
            data.set(parent(k), temp);
            k = parent(k);
        }
    }

    /**
     * 当前索引的父节点
     *
     * @param index int
     * @return int
     */
    private int parent(int index) {
        if (index == 0) {
            throw new IllformedLocaleException("index-0 doesn't have parent");
        }
        return (index - 1) / 2;
    }

    /**
     * 当前索引的左子节点
     *
     * @param index int
     * @return int
     */
    private int leftChild(int index) {
        return index * 2 + 1;
    }

    /**
     * 当前索引的右子节点
     *
     * @param index int
     * @return int
     */
    private int rightChild(int index) {
        return index * 2 + 2;
    }

    public int size() {
        return data.size();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

}
