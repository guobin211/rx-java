package math;

/**
 * 算术运算
 *
 * @author GuoBin201314@gmail.com on 2018/11/16 10:57
 */
public class Arithmetic {
    public static void main(String[] arg) {
        int a = 3;
        int b = ++a;
        int c = 3;
        int d = --c;
        System.out.println("进行自增运算后的值等于" + b);
        System.out.println("进行自减运算后的值等于" + d);
        math();
        operation();
    }

    private static void math() {
        int a = 5;
        int b = 5;
        //  前缀自增自减法(++a,--a): 先进行自增或者自减运算，再进行表达式运算
        //  后缀自增自减法(a++,a--): 先进行表达式运算，再进行自增或者自减运算
        int x = 2 * ++a;
        int y = 2 * b++;
        System.out.println("自增运算符前缀运算后a=" + a + ",x=" + x);
        System.out.println("自增运算符后缀运算后b=" + b + ",y=" + y);
    }

    /**
     * 位运算符
     */
    private static void operation() {
        /* 60 = 0011 1100 */
        int a = 60;
        /* 13 = 0000 1101 */
        int b = 13;
        int c = 0;
        /* 12 = 0000 1100 */
        c = a & b;
        //  如果相对应位都是1，则结果为1，否则为0
        System.out.println("a & b = " + c);
        /* 61 = 0011 1101 */
        c = a | b;
        System.out.println("a | b = " + c);
        /* 49 = 0011 0001 */
        c = a ^ b;
        System.out.println("a ^ b = " + c);
        /*-61 = 1100 0011 */
        c = ~a;
        System.out.println("~a = " + c);
        /* 240 = 1111 0000 */
        c = a << 2;
        System.out.println("a << 2 = " + c);
        /* 15 = 1111 */
        c = a >> 2;
        System.out.println("a >> 2  = " + c);
        /* 15 = 0000 1111 */
        c = a >>> 2;
        System.out.println("a >>> 2 = " + c);
    }
}
