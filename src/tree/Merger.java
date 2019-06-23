package tree;

/**
 * Merger class
 *
 * @author GuoBin
 * @email guobin201314@gmail.com
 * @date 2019-06-23
 */
public interface Merger<E> {
    /**
     * 合并两个元素
     * @param a
     * @param b
     * @return
     */
    E merge(E a, E b);
}
