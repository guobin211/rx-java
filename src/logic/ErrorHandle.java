package logic;

import java.util.Arrays;

/**
 * @author GuoBin201314@gmail.com on 2018/11/17 15:13
 */
public class ErrorHandle {
    /**
     * @param args start
     */
    public static void main(String[] args) {
        String test = "UTF-8";
        test(test);
        process("16");
    }

    /**
     * 捕获运行逻辑错误
     * @param e exception
     */
    public static void errorHandle(Exception e) {
        System.out.println(e.toString());
    }

    /**
     * 捕获异常从子类到父类
     * @param encoding string
     */
    static void test(String encoding) {
        System.out.println("编码方式" + encoding + "...");
        try {
            byte[] res = "test".getBytes(encoding);
            System.out.println("结果" + Arrays.toString(res));
        } catch (Exception e) {
            System.out.println("异常" + e.toString());
        } finally {
            System.out.println("end");
        }
    }
    static void process(String s) {
        try {
            int n = Integer.parseInt(s);
            int m = 100 / n;
            System.out.println(m);
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("异常" + e);
            errorHandle(e);
        } finally {
            System.out.println("end");
        }
    }
}
