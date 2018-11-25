package array;

import java.util.Arrays;

/**
 * @author GuoBin201314@gmail.com on 2018/11/17 11:59
 */
public class EachArray {
    public static void main(String[] args) {
        display();
        displayByArrays();
        sortArray();
        displayHeight();
    }
    private static void display() {
        int[] i = {1, 3, 5, 7, 9};
        for (int anI : i) {
            System.out.println(anI);
        }
    }
    private static void displayByArrays() {
        String[] sArr = {"name", "jack", "from", "usa"};
        System.out.println(Arrays.toString(sArr));
    }

    /**
     * java自带排序
     */
    private static void sortArray() {
        double[] doubles = {1.3, 5.4, 55, -12.3, 66, -4};
        Arrays.sort(doubles);
        System.out.println(Arrays.toString(doubles));
    }

    /**
     * 二维数组
     */
    private static void displayHeight() {
        //  二维数组
        int[][] hArr = {
            {5,2,1,4},
            {2,-4,3,-8},
            {3,-2,5,-1},
        };
        System.out.println(Arrays.deepToString(hArr));
    }
}
