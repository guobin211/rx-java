package linked;

/**
 * File LinkedList.java
 *
 * @author guobin201314@gmail.com on 2018/12/8 22:08
 * @version jdk 1.8.0
 */
public class LinkedList<E> {

    int size;

    /**
     * 节点的头部
     */
    private Node head;
    /**
     * 虚拟的节点头部
     */
    private Node dummyHead;

    public LinkedList() {
        head = null;
        dummyHead = new Node();
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * insert 插入元素
     *
     * @param index index
     * @param e     element
     */
    public void insert(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("index >= 0 and index <= size");
        }

        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        prev.next = new Node(e, prev.next);
        size++;
    }

    /**
     * 在链表头部添加元素
     *
     * @param e element
     */
    public void addFirst(E e) {
        insert(0, e);
    }

    /**
     * 尾部添加
     *
     * @param e element
     */
    public void addLast(E e) {
        insert(size, e);
    }

    /**
     * get
     *
     * @param index index
     * @return element
     */
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Illegal index!");
        }

        Node current = dummyHead.next;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.e;
    }

    /**
     * set
     *
     * @param index index
     * @param e     element
     */
    public void set(int index, E e) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Illegal index!");
        }
        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.e = e;
    }

    public E remove(int index) {
        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        Node resNode = prev.next;
        prev.next = resNode.next;
        resNode.next = null;

        size--;
        return resNode.e;
    }

    /**
     * has e
     *
     * @param e element
     * @return boolean
     */
    public boolean contains(E e) {
        Node cur = dummyHead.next;
        while (cur != null) {
            if (cur.e.equals(e)) {
                return true;
            } else {
                cur = cur.next;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        Node cur = dummyHead.next;
        while (cur != null) {
            stringBuilder.append(cur).append("->");
            cur = cur.next;
        }

        return stringBuilder.toString();
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
