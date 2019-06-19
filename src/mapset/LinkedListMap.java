package mapset;

/**
 * LinkedListMap class
 *
 * @author GuoBin
 * @email guobin201314@gmail.com
 * @date 2019-06-19
 */
public class LinkedListMap<K, V> implements IMap<K, V> {

    private Node dummy;
    private int size;

    public LinkedListMap() {
        dummy = new Node();
        size = 0;
    }

    private Node getNode(K key) {
        Node curr = dummy.next;
        while (curr!=null) {
            if (curr.key.equals(key)){
                return curr;
            }
            curr = curr.next;
        }
        return null;
    }

    @Override
    public void add(K k, V v) {
        Node node = getNode(k);
        if (node == null) {
            dummy.next = new Node(k, v, dummy.next);
            size++;
        } else {
            node.value = v;
        }
    }

    @Override
    public V remove(K k) {
        Node prev = dummy;
        while (prev.next != null) {
            if (prev.next.key.equals(k)){
                break;
            }
            prev = prev.next;
        }
        if (prev.next!=null){
            Node delNode = prev.next;
            prev.next = delNode.next;
            delNode.next = null;
            size--;
            return delNode.value;
        }
        return null;
    }

    @Override
    public boolean has(K k) {
        return getNode(k) != null;
    }

    @Override
    public boolean contains(K k) {
        return getNode(k) != null;
    }

    @Override
    public V get(K k) {
        Node node = getNode(k);
        return node == null ? null : node.value;
    }

    @Override
    public void set(K k, V value) {
        Node node = getNode(k);
        if (node == null) {
            throw new IllegalArgumentException(k + " doesn't exist!");
        } else {
            node.value = value;
        }
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    private class Node {
        public K key;
        public V value;
        public Node next;

        Node(K key, V value, Node next){
            this.key = key;
            this.value = value;
            this.next = next;
        }

        Node(K key) {
            this(key, null, null);
        }

        Node() {
            this(null, null, null);
        }

        @Override
        public String toString() {
            return "{" + key.toString() + " : " + value.toString() + "}";
        }
    }
}
