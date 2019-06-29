package union;

/**
 * UnionFind2 class
 *
 * @author GuoBin guobin201314@gmail.com
 * @date 2019-06-29
 */
public class UnionFind2 implements UnionFind {

    private int[] parent;

    public UnionFind2(int size) {
        parent = new int[size];
        for (int i = 0; i < size; i++) {
            parent[i] = i;
        }
    }

    @Override
    public int getSize() {
        return parent.length;
    }

    @Override
    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }

    @Override
    public void unionElements(int p, int q) {
        int pRoot =find(p);
        int qRoot = find(q);
        if (pRoot != qRoot) {
            parent[pRoot] = qRoot;
        }
    }

    private int find(int p) {
        if (p < 0 || p > parent.length) {
            throw new IllegalArgumentException("p is out of size");
        }
        while (p != parent[p]) {
            p = parent[p];
        }
        return p;
    }
}
