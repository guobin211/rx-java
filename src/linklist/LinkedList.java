package linklist;

/**
 * LinkedList
 * @author guobin201314@gmail.com on 2019-06-14 22:27
 */
public class LinkedList<E> {
    /**
     * 虚拟头节点，第一个元素是dummyHead.next
     */
    private Node dummyHead;
    /**
     * 容量length - 1 = 索引 index
     */
    private int size;

    public LinkedList() {
        dummyHead = new Node(null, null);
        size = 0;
    }

    public void removeElement(E e) {
        Node prev = dummyHead;
        while(prev.next != null){
            if(prev.next.e.equals(e)) {
                break;
            }
            prev = prev.next;
        }

        if(prev.next != null){
            Node delNode = prev.next;
            prev.next = delNode.next;
            delNode.next = null;
            size --;
        }
    }

    public E removeFirst() {
        return delete(0);
    }

    public E removeLast() {
        return delete(size - 1);
    }

    /**
     * 删除元素
     * @param index
     * @return
     */
    public E delete(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("index must >= 0 and < size");
        }
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
     * 是否包含元素
     * @param e
     * @return
     */
    public boolean includes(E e) {
        Node current = dummyHead.next;
        while (current != null) {
            if (current.e.equals(e)) {
                return true;
            } else {
                current = current.next;
            }
        }
        return false;
    }

    public void set(int index, E e) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("index must >= 0 and < size");
        }
        Node current = dummyHead.next;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.e = e;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("index must >= 0 and < size");
        }
        Node current = dummyHead.next;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.e;
    }

    public E getFirst() {
        return get(0);
    }

    public E getLast() {
        return get(size - 1);
    }

    // 增加节点
    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("index must >= 0 and <= size");
        }
        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        prev.next = new Node(e, prev.next);
        size++;
    }

    // 末尾增加
    public void push(E e) {
        add(size, e);
    }

    // 链表头添加
    public void shift(E e) {
        add(0, e);
    }

    // 链表头添加
    public void addFirst(E e) {
        add(0, e);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (Node curr = dummyHead.next; curr != null; curr = curr.next) {
            res.append(curr).append("->");
        }
        res.append("NULL");
        return res.toString();
    }

    public int getSize() {
        return size;
    }

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
