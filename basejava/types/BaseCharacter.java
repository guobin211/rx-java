package types;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author GuoBin201314@gmail.com on 2018/11/17 11:25
 */
public class BaseCharacter {
    public static void main(String[] args) {
        char firstName = 'j';
        String name = "name";
        double dNumber = 1.031231025;
        //  占位符打印4位小数
        System.out.printf("%.4f",dNumber);
        String[] students = {"jack", "mary", "tom", "bull"};
        display(name);
        display(firstName);
        display(students);
        inputString();
    }
    private static void display(String some) {
        System.out.println(some);
    }
    private static void display(char some) {
        System.out.println(some);
    }
    private static void display(String[] some) {
        System.out.println(Arrays.toString(some));
    }

    /**
     * 控制台输入
     * class Scanner
     */
    private static void inputString() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(input);
    }
}
