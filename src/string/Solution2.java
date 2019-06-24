package string;

/**
 * Solution2 class
 *
 * @author GuoBin
 * @email guobin201314@gmail.com
 * @date 2019-06-20
 */
public class Solution2 {
    public String nearestPalindromic(String n) {
        StringBuilder res = new StringBuilder();
        int max = 0;
        for (int i = n.length() - 1; i >= 0; i--) {
            res.append(n.charAt(i));
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "12345";

        System.out.println(new Solution2().nearestPalindromic(s));
    }
}
