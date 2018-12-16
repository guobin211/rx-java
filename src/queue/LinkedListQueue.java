package queue;



/**
 * File LinkedListQueue.java
 *
 * @author guobin201314@gmail.com on 2018/12/16 09:22
 * @version jdk 1.8.0
 */
public class LinkedListQueue<E> implements Queue<E> {

    private Node head, tail;
    private int size;

    public LinkedListQueue() {
        head = null;
        tail = null;
        size = 0;
    }


    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void enqueue(E e) {
        if(tail == null){
            tail = new Node(e);
            head = tail;
        }
        else{
            tail.next = new Node(e);
            tail = tail.next;
        }
        size ++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("cannot dequeue from an empty queue");
        } else {
            Node resNode = head;
            head = head.next;
            resNode.next = null;
            if (head ==null) {
                tail = null;
            }
            size--;
            return  resNode.e;
        }
    }

    @Override
    public E getFront() {
        if (isEmpty()) {
            throw new IllegalArgumentException("cannot dequeue from an empty queue");
        } else {
            return  head.e;
        }
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
