package avl;

import java.util.TreeMap;

/**
 * HashTable class
 *
 * @author GuoBin guobin201314@gmail.com
 * @date 2019-06-29
 */
public class HashTable<K, V> {
    private TreeMap<K, V>[] hashTable;
    private int m;
    private int size;

    public HashTable(int m) {
        this.m = m;
        size = 0;
        hashTable = new TreeMap[m];
        for (int i = 0; i < m; i++) {
            hashTable[i] = new TreeMap<>();
        }
    }

    public HashTable() {
        this(97);
    }

    public int getSize() {
        return size;
    }

    /**
     * 添加元素
     * @param key
     * @param value
     */
    public void add(K key, V value) {
        TreeMap<K, V> treeMap = hashTable[hash(key)];
        if (treeMap.containsKey(key)) {
            treeMap.put(key, value);
        } else {
            treeMap.put(key, value);
            size++;
        }
    }

    /**
     * 删除元素
     * @param key
     * @return
     */
    public V remove(K key) {
        TreeMap<K, V> treeMap = hashTable[hash(key)];
        V res = null;
        if (treeMap.containsKey(key)) {
            res = treeMap.remove(key);
            size--;
        }
        return res;
    }

    public void set(K key, V value) {
        TreeMap<K, V> treeMap = hashTable[hash(key)];
        if (treeMap.containsKey(key)) {
            treeMap.put(key, value);
        } else {
            throw new IllegalArgumentException("无法修改不存在的key");
        }
    }

    public boolean contains(K key) {
        return hashTable[hash(key)].containsKey(key);
    }

    public V get(K key) {
        return hashTable[hash(key)].get(key);
    }

    private int hash(K key) {
        return (key.hashCode() & 0x7fffffff) % m;
    }

}
