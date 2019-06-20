package queue;

/*
 * LinkedQueue
 * @Author guobin201314@gmail.com on 2019-06-14 23:34
 */
public class LinkedQueue<E> implements IEventQueue<E> {
    // 带尾节点的队列
    private Node head, tail;
    private int size;

    public LinkedQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void enqueue(E e) {
        if (tail == null) {
            tail = new Node(e);
            head = tail;
        } else {
            tail.next = new Node(e);
            tail = tail.next;
        }
        size++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("empty queue");
        }
        Node reNode = head;
        head = head.next;
        reNode.next = null;
        if (head == null) {
            tail = null;
        }
        size--;
        return reNode.e;
    }

    @Override
    public E getFront() {
        if (isEmpty()) {
            throw new IllegalArgumentException("empty queue");
        } else {
            return head.e;
        }
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Queue: front ");
        Node curr = head;
        while (curr != null) {
            res.append(curr).append("->");
            curr = curr.next;
        }
        res.append("Null tail");
        return res.toString();
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public class Node {
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }
}
