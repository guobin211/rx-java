package logic;

/**
 * @author GuoBin201314@gmail.com on 2018/11/17 11:48
 */
public class Logic {
    public static void main(String[] args) {
        String test;
        test = "hello";
        isNull(test);
        System.out.println(test.getClass());
    }
    private static void isNull(String s) {
        String test = "hello";
        if (test.equals(s)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
