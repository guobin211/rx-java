package array;

/**
 * Solution class
 *
 * @author GuoBin
 * @email guobin201314@gmail.com
 * @date 2019-06-19
 */
public class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len-1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] res = new int[len+1];
        res[0] = 1;
        return res;
    }
}
