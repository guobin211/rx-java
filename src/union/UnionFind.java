package union;

/**
 * UnionFind class
 * 并查集
 * 1.合并两个元素
 * 2.检查两个元素是否是相连的
 * @author GuoBin guobin201314@gmail.com
 * @date 2019-06-28
 */
public interface UnionFind {
    /**
     * size
     * @return size
     */
    int getSize();

    /**
     * 是否相连
     * @param p int
     * @param q int
     * @return bool
     */
    boolean isConnected(int p, int q);

    /**
     * 合并元素
     * @param p int
     * @param q int
     */
    void unionElements(int p, int q);
}
