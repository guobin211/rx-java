package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 二分搜索树
 *        node
 *  left小    right大
 * @author guobin
 * @param <E>
 */
public class BST<E extends Comparable<E>> implements IBst<E> {

    private Node root;
    private int size;

    public BST() {
        root = null;
        size = 0;
    }

    public void remove(E e) {
        root = remove(root, e);
    }

    /**
     * 删除节点
     * @param node Node
     * @param e element
     * @return New Node
     */
    private Node remove(Node node, E e) {
        if (node == null) {
            return null;
        }
        if (e.compareTo(node.e) < 0) {
            node.left = remove(node.left, e);
        } else if (e.compareTo(node.e) > 0) {
            node.right = remove(node.right, e);
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
            // 获取要删除节点的最小子节点，替换要删除节点的位置
            Node success = minimum(node.right);
            success.left = removeMin(node.right);
            size++;

            success.left = node.left;
            node.left = node.right = null;
            size--;
            return success;
        }
        return node;
    }

    /**
     * 删除最大节点
     */
    void removeMax() {
        E res = maximum();
        root = removeMax(root);
    }

    private Node removeMax(Node node) {
        if (node.right == null) {
            Node leftNode = node.left;
            node.left = null;
            size--;
            return leftNode;
        } else {
            node.right = removeMax(node.right);
        }
        return node;
    }

    /**
     * 移除min
     * @return e
     */
    public E removeMin() {
        E res = minimum();
        root = removeMin(root);
        return res;
    }

    /**
     * 移除节点
     * @param node e
     * @return Node
     */
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

    public E maximum() {
        if (size == 0) {
            throw new IllegalArgumentException("BST is empty!");
        }
        return maximum(root).e;
    }

    private Node maximum(Node node) {
        if (node.right == null) {
            return node;
        } else {
            return maximum(node.right);
        }
    }

    private E minimum() {
        if (size == 0) {
            throw new IllegalArgumentException("BST is empty!");
        }
        return minimum(root).e;
    }

    private Node minimum(Node node) {
        if (node.left == null) {
            return root;
        } else {
            return minimum(node.left);
        }
    }

    /**
     * 层序遍历 非递归 队列遍历
     */
    void postOrderQueue() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node current = queue.remove();
            System.out.print(current.e + "->");
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }

    /**
     *  前序遍历 非递归 栈遍历
     */
    void prevOrderStack() {
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node current = stack.pop();
            System.out.print(current.e + "->");
            if (current.right != null) {
                stack.push(current.right);
            }
            if (current.left != null) {
                stack.push(current.left);
            }
        }
    }

    /**
     * 中序遍历
     */
    void centerOrder() {
        centerOrder(root);
    }

    private void centerOrder(Node node) {
        if (node != null) {
            centerOrder(node.left);
            System.out.print(node.e + "->");
            centerOrder(node.right);
        }
    }

    /**
     * 后序遍历
     */
    void postOrder() {
        postOrder(root);
    }

    private void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.e + "->");
        }
    }

    /**
     * 前序遍历
     */
    void prevOrder() {
        prevOrder(root);
    }

    /**
     * 递归前序遍历
     * @param node Node
     */
    private void prevOrder(Node node) {
        if (node != null) {
            System.out.print(node.e + "->");
            prevOrder(node.left);
            prevOrder(node.right);
        }
    }

    @Override
    public void add(E e) {
        // 单步骤写法
        root = add(root, e);
        // 传统写法
//        if (root == null) {
//            root = new Node(e);
//            size++;
//        } else {
//            _add(root, e);
//        }
    }

    // 向以node为根的二分搜索树中插入元素e，递归算法

    /**
     * 返回插入新节点后二分搜索树的根
     * @param node Node
     * @param e e
     * @return Node
     */
    private Node add(Node node, E e) {
        if (node == null) {
            size++;
            return new Node(e);
        }
        // 插入位置判断
        if (e.compareTo(node.e) < 0) {
            node.left = add(node.left, e);
        } else if (e.compareTo(node.e) > 0) {
            node.right = add(node.right, e);
        }
        return node;
    }

    private void _add(Node node, E e) {
        if (e.equals(node.e)) {
            return;
        } else if (e.compareTo(node.e) < 0 && node.left == null) {
            node.left = new Node(e);
            size++;
            return;
        } else if (e.compareTo(node.e) > 0 && node.right == null) {
            node.right = new Node(e);
            size++;
            return;
        }
        // 递归调用
        if (e.compareTo(node.e) < 0) {
            _add(node.left, e);
        } else {
            _add(node.right, e);
        }
    }

    @Override
    public boolean includes(E e) {
        return _includes(root, e);
    }

    // 递归判断
    private boolean _includes(Node node, E e) {
        if (node == null) {
            return false;
        }
        if (e.compareTo(node.e) == 0) {
            return true;
        } else if (e.compareTo(node.e) < 0) {
            return _includes(node.left, e);
        } else {
            return _includes(node.right, e);
        }
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        buildBSTString(root, 0, res);
        return res.toString();
    }

    private void buildBSTString(Node node, int depth, StringBuilder res) {
        if (node == null) {
            res.append(buildDepthString(depth)).append("null\n");
            return;
        }
        // 当前root节点
        res.append(buildDepthString(depth)).append(node.e).append("\n");
        // 递归子节点
        buildBSTString(node.left, depth + 1, res);
        buildBSTString(node.right, depth + 1, res);
    }

    private String buildDepthString(int depth) {
        return "--".repeat(Math.max(0, depth));
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private class Node {
        public E e;
        public Node left, right;

        Node(E e) {
            this.e = e;
            left = null;
            right = null;
        }
    }

}
