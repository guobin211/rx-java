package linked;

/**
 * File LinkedList.java
 *
 * @author guobin201314@gmail.com on 2018/12/8 22:08
 * @version jdk 1.8.0
 */
public class LinkedList<E> {

    int size;
    // 节点的头部
    private Node head;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 在链表头部添加元素
     * @param e element
     */
    public void addFirst(E e) {
//        Node node = new Node(e);
//        node.next = head;
//        head = node;

        // 一行代码实现
        head = new Node(e, head);
        size++;
    }

    /**
     * insert 插入元素
     * @param index index
     * @param e element
     */
    public void insert(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("index >= 0 and index <= size");
        }
        // 插入node节点
        if (index == 0) {
            addFirst(e);
        } else {
            Node prev = head;
            for (int i = 0; i < index-1; i++) {
                prev = prev.next;
            }

//            Node node = new Node(e);
//            node.next = prev.next;
//            prev.next = node;

            // 一行代码实现
            prev.next = new Node(e, prev.next);
            size++;
        }
    }

    /**
     * 尾部添加
     * @param e element
     */
    public void addLast(E e) {
        insert(size, e);
    }

    /**
     * 节点类
     */
    private class Node {
        private E e;
        private Node next;

        /**
         * 构造函数
         *
         * @param userE    el
         * @param userNext next
         */
        public Node(E userE, Node userNext) {
            this.e = userE;
            this.next = userNext;
        }

        public Node() {
            this(null, null);
        }

        public Node(E userE) {
            this.e = userE;
            this.next = null;
        }

        public String toString() {
            return e.toString();
        }
    }


}
