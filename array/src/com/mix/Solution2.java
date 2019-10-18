package array;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution2 class
 *
 * @author GuoBin
 * @email guobin201314@gmail.com
 * @date 2019-06-19
 */
public class Solution2 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        if (rowIndex == 0) {
            res.add(1);
            return res;
        }
        long cur = 1;
        for (int i = 0; i <= rowIndex ; i++) {
            res.add((int) cur);
            cur = cur * (rowIndex - i) / (i + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        List<Integer> res = new Solution2().getRow(30);
        System.out.println(res);
    }
}
