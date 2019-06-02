/*
 * array Client
 * @author GuoBin211 on 2019-06-02 18:31
 */
package array;

import java.util.Arrays;
import java.util.Random;

public class Client {
    public static void main(String[] args) {

        int genericArrayType = new Random().nextInt(100);
        System.out.println(genericArrayType);

        int size = 10;
        int[] ints = new int[5];
        // 填充数组
        Arrays.fill(ints, 10);
        // 修改数组
        for (int i = 0; i <5 ; i++) {
            System.out.println(ints[i]);
            ints[i] = i;
        }
        System.out.println(ints[0]);

        char[] chars = "abcdefghigklmnopqrstuvwxyz".toCharArray();
        System.out.println(chars);

        int[] arr = buildArray(5);
        System.out.println(arr[0]);
        System.out.println(arr[0] > arr[1]);
        Arrays.sort(arr);
        for (int value : arr) {
            System.out.println(value);
        }
    }

    private static int[] buildArray(int n) {
        int[] ints = new int[n];

        for (int i = 0; i < n; i++) {
            ints[i] = new Random().nextInt(100);
        }

        return ints;
    }
}

