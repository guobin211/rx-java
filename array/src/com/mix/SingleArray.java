/*
 * array SingleArray
 * @author GuoBin211 on 2019-06-01 11:20
 */
package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BsArray {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return "BsArray id:" + id;
    }
}

public class SingleArray {
    public static void main(String[] args) {

        // 长度为3的数组
        BsArray[] bsArray = new BsArray[3];
        for (int i = 0; i < 3; i++) {
            bsArray[i] = new BsArray();
        }

        System.out.println(bsArray[2]);

        List<Integer> integerList = new ArrayList<>(Arrays.asList(11, 12, 13, 14));
        System.out.println(integerList);

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

