package tree;

/**
 * Segment class
 *
 * @author GuoBin
 * @email guobin201314@gmail.com
 * @date 2019-06-23
 */
public class Segment<E> {
    private E[] data;
    private E[] tree;
    private Merger<E> merger;

    public void set(int index, E e) {
        if (index < 0 || index >= data.length) {
            throw new IllegalArgumentException("treeIndex is illegal");
        }
        data[index] = e;
        set(0,0,data.length -1 ,index, e);
    }

    /**
     * 更新某一个位置的元素
     * @param treeIndex 当前tree索引
     * @param left 左索引
     * @param right 右索引
     * @param index 插入的索引
     * @param e
     */
    private void set(int treeIndex, int left, int right, int index, E e) {
        if (left == right) {
            tree[treeIndex] = e;
            return;
        }
        // 中间点
        int mid = left + (right - left) /2;
        int leftIndex = leftChild(treeIndex);
        int rightIndex= rightChild(treeIndex);
        // 递归变更
        if (index > mid +1 ) {
            set(rightIndex, mid + 1, right, index, e);
        } else {
            // index <= mid
            set(leftIndex, left, mid, index, e);
        }
        // 重新merge
        tree[treeIndex] = merger.merge(tree[leftIndex], tree[rightIndex]);
    }

    public E query(int queryLeft, int queryRight) {
        if (queryLeft < 0 || queryLeft >= data.length ||
            queryRight < 0 || queryRight >= data.length || queryLeft > queryRight) {
            throw new IllegalArgumentException("Index is illegal.");
        }

        return query(0, 0, data.length - 1, queryLeft, queryRight);
    }

    /**
     * 递归查询线段内的数据
     *
     * @param treeIndex
     * @param left
     * @param right
     * @param queryLeft
     * @param queryRight
     * @return
     */
    private E query(int treeIndex, int left, int right, int queryLeft, int queryRight) {
        if (left == queryLeft && right == queryRight) {
            return tree[treeIndex];
        }
        int mid = left + (right - left) / 2;
        int leftTreeIndex = leftChild(treeIndex);
        int rightTreeIndex = rightChild(treeIndex);

        if (queryLeft >= mid + 1) {
            return query(rightTreeIndex, mid +1, right, queryLeft, queryRight);
        } else if (queryRight <= mid) {
            return query(leftTreeIndex, left, mid, queryLeft, queryRight);
        }

        E leftResult = query(leftTreeIndex, left, mid, queryLeft, mid);
        E rightResult = query(rightTreeIndex, mid + 1, right, mid + 1, queryRight);
        return merger.merge(leftResult, rightResult);
    }

    public Segment(E[] arr, Merger<E> merger) {
        this.merger = merger;
        data = (E[]) new Object[arr.length];
        System.arraycopy(arr, 0, data, 0, arr.length);
        tree = (E[]) new Object[arr.length * 4];
        buildSegmentTree(0, 0, data.length - 1);
    }

    private void buildSegmentTree(int treeIndex, int l, int r) {
        if (l == r) {
            tree[treeIndex] = data[l];
            return;
        }
        int leftTreeIndex = leftChild(treeIndex);
        int rightTreeIndex = rightChild(treeIndex);

        int mid = l + (r - l) / 2;
        buildSegmentTree(leftTreeIndex, l, mid);
        buildSegmentTree(rightTreeIndex, mid + 1, r);
        // 线段信息的综合，通过merger接口实现
        tree[treeIndex] = merger.merge(tree[leftTreeIndex], tree[rightTreeIndex]);
    }

    private int leftChild(int treeIndex) {
        return 2 * treeIndex + 1;
    }

    private int rightChild(int treeIndex) {
        return 2 * treeIndex + 2;
    }

    private E get(int index) {
        if (index < 0 || index >= data.length) {
            throw new IllegalArgumentException("treeIndex is illegal");
        }
        return data[index];
    }

    private int size() {
        return data.length;
    }

    private boolean isEmpty() {
        return data.length == 0;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("[");
        for (int i = 0; i < tree.length; i++) {
            if (tree[i] != null) {
                res.append(tree[i]);
            } else {
                res.append("null");
            }
            if (i != tree.length - 1) {
                res.append(",");
            }
        }
        return res.toString();
    }
}
