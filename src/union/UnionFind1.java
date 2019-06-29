package union;

/**
 * UnionFind1 class 并查集
 *
 * @author GuoBin guobin201314@gmail.com
 * @date 2019-06-28
 */
public class UnionFind1 implements UnionFind {

    private int[] ids;

    public UnionFind1(int size) {
        ids = new int[size];
        for (int i = 0; i < ids.length; i++) {
            // 存储的是所属与的集合编号
            ids[i] = i;
        }
    }

    @Override
    public int getSize() {
        return ids.length;
    }

    @Override
    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }

    @Override
    public void unionElements(int p, int q) {
        int pId = find(p);
        int qId = find(q);
        if (pId != qId) {
            for (int i = 0; i < ids.length; i++) {
                if (ids[i] == pId) {
                    ids[i] = qId;
                }
            }

        }
    }

    private int find(int p) {
        if (p < 0 || p >= ids.length) {
            throw new IllegalArgumentException("p is out if bound");
        }
        return ids[p];
    }
}
