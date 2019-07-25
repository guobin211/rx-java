package heap;

import java.util.IllformedLocaleException;
import java.util.Random;
import java.util.Vector;

/**
 * MainHeap class
 *
 * @author GuoBin
 * @date 2019-06-20
 */
public class MainHeap {
    public static void swap(Vector vector, int l, int r) {
        if (l >= vector.size() || l < 0 || r >= vector.size() || r < 0) {
            throw new IllformedLocaleException("index must in [ 0, size() -1 ]");
        }
        Object temp = vector.get(l);
        vector.set(l, vector.get(r));
        vector.set(r, temp);
    }

    public static void main(String[] args) {
        int n = 10000;
        MaxHeap<Integer> maxHeap = new MaxHeap<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            maxHeap.add(random.nextInt(Integer.MAX_VALUE));
        }

        int[] arr = new int[n];
        // 堆排序
        for (int i = 0; i < n; i++) {
            arr[i] = maxHeap.extractMax();
        }
        // 堆排序检测
        for (int i = 1; i < n; i++) {
            if (arr[i-1] < arr[i]) {
                System.out.println("Error MaxHead");
            }
        }
        System.out.println("Success MaxHead");

        Vector<Integer> vector = new Vector<>();
        int size = 10;
        for (int i = 0; i < size; i++) {
            vector.add(i + 1);
        }

        for (int val : vector) {
            System.out.print(val);
        }

        swap(vector, 0, 9);
        for (int val : vector) {
            System.out.print(val);
        }
    }
}
