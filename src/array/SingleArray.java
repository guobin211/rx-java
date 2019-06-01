/*
 * array SingleArray
 * @author GuoBin211 on 2019-06-01 11:20
 */
package array;

import java.util.ArrayList;
import java.util.List;

public class SingleArray {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        int[] ints = new int[5];
        String[] names = {"jack", "tom"};
        // 二维数组
        int[][] twoInts = new int[3][3];

        for (int i = 0; i < twoInts.length; i++) {
            for (int j = 0; j < twoInts[i].length; j++) {
                twoInts[i][j] = 1 + i + j;
            }
        }

        for (int[] ints1 : twoInts) {
            StringBuilder s1 = new StringBuilder();
            for (int i : ints1) {
                s1.append(i);
            }
            System.out.println(s1);
        }

        ints[0] = 1;
        for (int i = 0; i < 5; i++) {
            ints[i] = i;
        }
        System.out.println(ints[0]);
        for (int anInt : ints) {
            System.out.println(anInt);
        }

        for (String s : names) {
            System.out.println(s);
        }

        for (int i = 0; i < 10; i++) {
            strings.add(i + "");
        }

        System.out.println(strings);

    }
}

