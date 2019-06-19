package array;

/**
 * Solution1 class
 *
 * @author GuoBin
 * @email guobin201314@gmail.com
 * @date 2019-06-19
 */
public class Solution1 {
    public int[] findDiagonalOrder(int[][] matrix) {
        int m,n;
        m = matrix.length;
        n = matrix[0].length;
        if (m == 0 || n == 0) {
            return new int[0];
        }
        int[] res = new int[m * n];
        for (int i = 0; i < m * n; i++) {

        }
        return res;
    }
}
