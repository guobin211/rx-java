/*
 * string Operator
 * @author GuoBin211 on 2019-06-01 11:39
 */
package string;

public class Operator {
    public static void main(String[] args) {
        int m = 10;
        int n = 5;

        System.out.println(n++);    // 6
        System.out.println(m++);    // 11
        System.out.println(m++ * n--); // 11 * 66 => 12 5
        System.out.println(m + n);  // 12 +5 = 17

        int x = 53;
        // 转2进制 从右往左补0
        System.out.println(Integer.toBinaryString(x));  // 110101
        // 53  = 0000 0000 00 110101
        // 取反  1111 1111 11 001010  1=～0
        System.out.println(~x); // -54

        int a = 1;
        int b = 0;
        // 和
        System.out.println(a & b);
        // 或
        System.out.println(a | b);
        // 按位异或
        System.out.println(a ^ b); // 1
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println(b ^ a); // 1

        System.out.println(Integer.toBinaryString(4));  // 0000 0000 0000 0 100
        // 左移动2位置 0000 0000 0001 0000
        System.out.println(4<<2);

        System.out.println(toFullBinaryString(4));
        // 2进制转10进制
        System.out.println(Integer.parseInt(toFullBinaryString(2)));
    }

    /**
     * int 转 2进制
     * @param num
     * @return
     */
    private static String toFullBinaryString(int num) {
        char[] chs = new char[Integer.SIZE];
        for (int i = 0; i < Integer.SIZE; i++) {
            chs[Integer.SIZE - 1 - i] = (char) (((num >> i) & 1) + '0');
        }
        return new String(chs);
    }
}

