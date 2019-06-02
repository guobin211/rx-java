/*
 * string ScannerDel
 * @author GuoBin211 on 2019-06-02 11:30
 */
package string;

import java.lang.reflect.*;
import java.util.Scanner;
import java.util.regex.MatchResult;

public class ScannerDel {
    public static class Test {
        public static String name = "Test Class";
        static void regString(String s) {
            System.out.println("regString");
            Scanner scanner = new Scanner(s);
            // 正则表达式
            String pattern = "(\\d+[.]+\\d+[.]+\\d+[.]+\\d)@(\\d{2}/\\d{2}/\\d{4})";
            // 匹配扫描
            while (scanner.hasNext(pattern)) {
                scanner.next(pattern);
                MatchResult matchResult = scanner.match();
                String ip = matchResult.group(1);
                String date = matchResult.group(2);
                System.out.format("匹配的ip: %s 和日期 %s \n", ip, date);
            }
        }

        static void testEmail(String s) {
            String reg = "(\\d*)@(\\d*)";
            boolean res = s.matches(reg);
            System.out.println(res);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner("12, 33, 55 , 51 , 22");
        // 去除空格
        scanner.useDelimiter("\\s*,\\s*");
        while (scanner.hasNextInt()) {
            System.out.println(scanner.nextInt());
        }

        String str = "127.0.0.1@02/10/2005\n204.0.0.1@02/10/2005\n204.1.0.1@02/10/2005[ok:127.0.0.1]";
        Test.regString(str);

        String string = "Hello Java！welcome to china.";

        System.out.println(string.split(" ").length);
        Test.testEmail("844@qq.com");

        Test test = new Test();
        // 判断类和实例的关系
        System.out.println(Test.class.isInstance(scanner));
        // 自己声明的属性
        System.out.println(Test.class.getDeclaredFields().length);
        // 自己声明的方法
        System.out.println(Test.class.getDeclaredMethods().length);
        // class 自带的方法
        for (int i = 0; i < Test.class.getMethods().length; i++) {
            System.out.println(Test.class.getMethods()[i]);
        }

        try {
            // 反射 获取class信息
            Class<?> c= Class.forName("string.ScannerDel");
            for (Method method: c.getMethods()) {
                System.out.println(method);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

