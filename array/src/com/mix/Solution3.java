package array;

import java.util.Arrays;

/**
 * Solution3 class
 *
 * @author GuoBin
 * @email guobin201314@gmail.com
 * @date 2019-06-20
 */
public class Solution3 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        int step = 2;
        for (int i = 0; i < nums.length; i += step) {
            res += nums[i];
        }
        return res;
    }
}
