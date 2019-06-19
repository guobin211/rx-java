package linklist;

/*
 * Sum
 * @Author guobin201314@gmail.com on 2019-06-16 21:11
 */
public class Sum {
    public static int sum(int[] arr) {
        return _sum(arr, 0);
    }

    // 递归求 [l...n]区间的和
    private static int _sum(int[] arr, int left) {
        // 最基本的问题，递归的终止条件
        if (left == arr.length) {
            return 0;
        } else {
            // 递归解决问题
            return arr[left] + _sum(arr, left + 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(sum(nums));
    }
}
