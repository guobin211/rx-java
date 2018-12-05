package array;

/**
 * @author GuoBin201314@gmail.com on 2018/11/15 22:34
 */
public class OrderArray {
    public static void main(String[] args) {
        int[] data = buildArray(5);
        int[] arrayData = {2, -2, 3, 5, -4};
        for (int i = 0; i < data.length; i++) {
            data[i] = i + 2;
        }
//        display(data);
        bubbleSort(arrayData);
        display(arrayData);
    }

    /**
     * 创建数组
     *
     * @param a int 元素个数
     */
    private static int[] buildArray(int a) {
        return new int[a];
    }

    /**
     * 展示数组的元素
     *
     * @param arr 数组
     */
    private static void display(int[] arr) {
        for (int anArr : arr) {
            System.out.print(anArr + "=====");
        }
    }

    /**
     * 冒泡排序
     *
     * @param arr int数组
     */
    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
