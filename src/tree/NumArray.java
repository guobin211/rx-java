package tree;

/**
 * NumArray class
 *
 * @author GuoBin
 * @email guobin201314@gmail.com
 * @date 2019-06-23
 */
public class NumArray {
    /**
     * 存储从 [0, index] 内元素的和
     */
    private int[] sum;

    public NumArray(int[] nums) {
        sum = new int[nums.length + 1];
        sum[0] = 0;
        for (int i = 1; i < sum.length; i++) {
            sum[i] = sum[i - 1] + nums[i - 1];
        }
    }

    public int sumRange(int i, int j) {
        return sum[j + 1] - sum[i];
    }

    public void update(int index, int val) {
        int del = val - sumRange(index, index -1);
        for (int i = index; i < sum.length; i++) {
            sum[index] = sum[index] + del;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, -5, -4, -3};

        NumArray numArray = new NumArray(nums);
        System.out.println(numArray.sumRange(0, 2));

        numArray.update(2, 3);
        System.out.println(numArray.sumRange(0,2));

    }
}
