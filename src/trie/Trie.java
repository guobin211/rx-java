package trie;

import java.util.TreeMap;

/**
 * Trie class
 * 字典树
 *
 * @author GuoBin
 * @email guobin201314@gmail.com
 * @date 2019-06-23
 */
public class Trie {

    private Node root;
    private int size;

    public Trie() {
        root = new Node();
        size = 0;
    }

    /**
     * 检测是否包含
     * @param word string
     * @return bool
     */
    public boolean contains(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (curr.next.get(c) == null) {
                return false;
            } else {
                curr = curr.next.get(c);
            }
        }
        return curr.isWord;
    }

    /**
     * 添加新单词
     * @param word string
     */
    public void add(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (curr.next.get(c) == null) {
                curr.next.put(c, new Node());
            }
            curr = curr.next.get(c);
        }
        // 成功添加单词维护变量
        if (!curr.isWord) {
            curr.isWord = true;
            size++;
        }
    }

    public int getSize() {
        return size;
    }

    private static class Node {
        boolean isWord;
        public TreeMap<Character, Node> next;

        Node(boolean isWord) {
            this.isWord = isWord;
            next = new TreeMap<>();
        }

        Node() {
            this(false);
        }
    }
}
