package mapset;

/**
 * IMap class
 *
 * @author GuoBin
 * @email guobin201314@gmail.com
 * @date 2019-06-19
 */
public interface IMap<K, V> {
    /**
     * add
     * @param k
     * @param v
     */
    void add(K k, V v);

    /**
     * remove
     * @param k
     * @return
     */
    V remove(K k);

    /**
     * has
     * @param k
     * @return
     */
    boolean has(K k);

    /**
     * has
     * @param k
     * @return
     */
    boolean contains(K k);

    /**
     * get
     * @param k
     * @return
     */
    V get(K k);

    /**
     * set
     * @param k
     * @param value
     */
    void set(K k, V value);

    /**
     * kong
     * @return
     */
    boolean isEmpty();

    /**
     * size
     * @return
     */
    int getSize();

}
