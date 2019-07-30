package union;

import java.util.Random;

/**
 * MainUnion class
 *
 * @author GuoBin guobin201314@gmail.com
 * @date 2019-06-29
 */
public class MainUnion {

    private static double testUf(UnionFind uf, int m) {
        int size = uf.getSize();
        Random random = new Random();
        long startTime = System.nanoTime();
        for (int i = 0; i < m; i++) {
            int a = random.nextInt(size);
            int b = random.nextInt(size);
            uf.unionElements(a, b);
        }

        for (int i = 0; i < m; i++) {
            int a = random.nextInt(size);
            int b = random.nextInt(size);
            uf.isConnected(a, b);
        }

        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000000.0;
    }

    public static void main(String[] args) {
        int size = 100000;
        // 决定树的深度
        int m = 100000;
        UnionFind1 unionFind1 = new UnionFind1(size);
        double time1 = testUf(unionFind1, m);
        System.out.println("time1: " + time1);
        UnionFind2 unionFind2 = new UnionFind2(size);
        double time2 = testUf(unionFind2, m);
        System.out.println("time2: " + time2);
        UnionFind3 unionFind3 = new UnionFind3(size);
        double time3 = testUf(unionFind3, m);
        System.out.println("time3: " + time3);
    }
}
