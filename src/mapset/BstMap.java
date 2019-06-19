package mapset;

import java.util.IllformedLocaleException;

/**
 * BstMap class
 *
 * @author GuoBin
 * @email guobin201314@gmail.com
 * @date 2019-06-19
 */
public class BstMap<K extends Comparable<K>, V> implements IMap<K, V>  {

    private Node root;
    private int size;

    @Override
    public void add(K k, V v) {
        root = add(root, k, v);
    }

    private Node add(Node node, K k, V v) {
        if (node == null) {
            size++;
            return new Node(k,v);
        }
        if (k.compareTo(node.key) < 0) {
            node.left = add(node.left, k, v);
        } else if (k.compareTo(node.key) > 0) {
            node.right = add(node.right, k, v);
        } else {
            node.value = v;
        }
        return node;
    }

    private Node getNode(Node node, K key) {
        if (node == null) {
            return null;
        } else {
            if (key.compareTo(node.key) == 0) {
                return node;
            } else if (key.compareTo(node.key) < 0) {
                return getNode(node.left, key);
            } else {
                return getNode(node.right, key);
            }
        }
    }

    @Override
    public V remove(K k) {
        Node node = getNode(root, k);
        if (node != null) {
            root = remove(root, k);
            return node.value;
        }
        return null;
    }

    private Node remove(Node node, K k) {
        if (node == null) {
            return null;
        }

        if (k.compareTo(node.key) < 0) {
            node.left = remove(node.left, k);
            return node;
        } else if (k.compareTo(node.key) > 0) {
            node.right = remove(node.right, k);
            return node;
        } else {
            if (node.left == null) {
                Node rightNode = node.right;
                node.right = null;
                size--;
                return rightNode;
            }

            if (node.right == null) {
                Node leftNode = node.left;
                node.left = null;
                size--;
                return leftNode;
            }
            Node success = minimum(node.right);
            success.left = removeMin(node.right);
            size++;

            success.left = node.left;
            node.left = node.right = null;
            size--;
            return success;
        }
    }

    private Node minimum(Node node) {
        if (node.left == null) {
            return root;
        } else {
            return minimum(node.left);
        }
    }

    private Node removeMin(Node node) {
        if (node.left == null) {
            Node rightNode = node.right;
            node.right = null;
            size--;
            return rightNode;
        } else {
            node.left = removeMin(node.left);
        }
        return node;
    }

    @Override
    public boolean has(K k) {
        return getNode(root, k) != null;
    }

    @Override
    public boolean contains(K k) {
        return getNode(root, k) != null;
    }

    @Override
    public V get(K k) {
        Node node = getNode(root, k);
        return node == null ? null : node.value;
    }

    @Override
    public void set(K k, V value) {
        Node node = getNode(root, k);
        if (node == null) {
            throw new IllformedLocaleException(k + " doesn't exist!");
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
        public Node left, right;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
            left = null;
            right = null;
        }
    }
}
