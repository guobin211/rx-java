package collection;

import java.util.Stack;

/**
 * stack 栈 先进后出
 * 中缀表达式转后缀表达式
 * @author GuoBin201314@gmail.com on 2018/11/17 19:31
 */
public class SelfStack {
    public static void main(String[] args) {
        String s = "1+2*(9-5)";
        display(s);
    }
    static void display(String s) {
        Stack stack;
        int len = s.length();
        String[] strings = s.split("");
        for (int i = 0; i <len; i++) {
            System.out.println(strings[i]);
        }
    }
}
