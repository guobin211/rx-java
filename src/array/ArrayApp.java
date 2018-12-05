package array;

/**
 * @author guobin
 */
public class ArrayApp {
    public static void main(String[] arg) {
        long[] arr;
        arr = getArray(10);
        long searchKey;
        arr[0] = 77;
        arr[1] = 99;
        arr[3] = 55;
        arr[4] = 33;
        arr[5] = 22;
        arr[6] = 11;
        int j;
        for (j = 0; j < arr.length; j++) {
            System.out.print("第" + j + "个" + arr[j]);
            System.out.println();
        }

        searchKey = 55;
        for (j = 0; j < arr.length; j++) {
            if (arr[j] == searchKey) {
                break;
            }
        }
    }

    private static long[] getArray(int a) {
        System.out.print(a);
        return new long[a];
    }
}
