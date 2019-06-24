package heap;

import java.util.ArrayList;
import java.util.Vector;

/**
 * BinaryHeap class
 *
 * 二叉堆是完全的二叉树
 * @author GuoBin
 * @email guobin201314@gmail.com
 * @date 2019-06-20
 */
abstract class BaseBinaryHeap<E> {
    private Vector<E> vector;
    public BaseBinaryHeap(int capacity) {
        this.vector = new Vector<E>(capacity <= 10 ? 10 : capacity);
    }
}
