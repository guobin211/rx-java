package array;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution1 class
 *
 * @author GuoBin 杨辉三角
 * @email guobin201314@gmail.com
 * @date 2019-06-19
 */
public class Solution1 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List son = new ArrayList();
            for (int j = 0; j <= i ; j++) {
                if (j == 0|| j == i){
                    son.add(1);
                } else {
                    Integer a = res.get(i - 1).get(j);
                    Integer b = res.get(i - 1).get(j - 1);
                    son.add(a + b);
                }
            }
            res.add(son);
        }
        return res;
    }

    public static void main(String[] args) {
        List res = new Solution1().generate(5);
        System.out.println(res);
    }
}
