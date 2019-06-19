package linklist;

/*
 * DoubleLinkedList
 * @Author guobin201314@gmail.com on 2019-06-16 21:46
 */
public class DoubleLinkedList<E> {

    private int size;
    private Node head;

    public void add (int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("index must >= 0 and <= size");
        }
    }

    public DoubleLinkedList() {
        size = 0;
        head = new Node();
        head.prev = head.next = head;
    }

    public class Node {
        E e;
        Node next, prev;

        public Node(E e, Node next, Node prev) {
            this.e = e;
            this.next = next;
            this.prev = prev;
        }

        public Node() {
            this(null, null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }
}
