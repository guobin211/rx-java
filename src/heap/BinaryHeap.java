package heap;

import java.util.Vector;

/**
 * BinaryHeap class
 *
 * 二叉堆是完全的二叉树
 * @author GuoBin
 * @date 2019-06-20
 */
abstract class BaseBinaryHeap<E> {
    private Vector<E> vector;
    public BaseBinaryHeap(int capacity) {
        this.vector = new Vector<E>(capacity <= 10 ? 10 : capacity);
    }
}
