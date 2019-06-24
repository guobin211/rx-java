package string;

/**
 * Solution class
 *
 * @author GuoBin
 * @email guobin201314@gmail.com
 * @date 2019-06-20
 */
public class Solution {
    public void reverseString(char[] s) {
        int len = s.length;
        int chunk = 2;
        char temp;
        if (len % chunk == 0) {
            for (int i = 0; i <= len / chunk; i++) {
                temp = s[i];
                s[i] = s[len - 1 - i ];
                s[len - 1 - i] = temp;
            }
        } else {
            for (int i = 0; i < len / chunk; i++) {
                temp = s[i];
                s[i] = s[len - 1 - i ];
                s[len - 1 - i] = temp;
            }
        }
    }

    public void reverseString(String[] strings) {

    }

    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'c'};

        new Solution().reverseString(chars);
        System.out.println(chars);
    }
}
