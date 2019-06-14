package stack;

import java.util.Stack;

/*
 * Solution
 * @Author guobin201314@gmail.com on 2019-06-12 21:26
 */
public class Solution {
    public static void main(String[] args) {
        String s = "({[]})";
        System.out.println((new Solution()).isValid(s));
        s = "{([)}]";
        System.out.println((new Solution()).isValid(s));
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c =='(' || c =='[' || c =='{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char topChar = stack.pop();
                    if (c == ')' && topChar !='(') {
                        return false;
                    }
                    if (c == ']' && topChar !='[') {
                        return false;
                    }
                    if (c == '}' && topChar !='{') {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
