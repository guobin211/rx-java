package Array;

/**
 * Array
 *
 * @author guobin201314@gmail.com on 2019-01-13
 * @deprecated 1.8
 */
public class Sum {

    public static int sum(int[] arr) {
        return sum(arr, 0);
    }

    /**
     * 递归求和
     * @param arr int[]
     * @param l int
     * @return int
     */
    private static int sum(int[] arr, int l) {
        if (l == arr.length) {
            return 0;
        } else {
            return arr[l] + sum(arr, l + 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int res = Sum.sum(nums);

        System.out.println(res);
    }
}
