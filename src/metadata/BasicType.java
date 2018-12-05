package metadata;

/**
 * 内置数据类型
 *
 * @author GuoBin201314@gmail.com on 2018/11/16 10:11
 */
public class BasicType {
    public static void main(String[] args) {
        //  byte 8位有符号，以二进制补码表示的整数，最小值 -2^7，最大值2^7-1
        byte btNumber = 10;
        //  short 数据类型是 16 位、有符号的以二进制补码表示的整数，最小 -2^15
        short stNumber = 1000;
        //  int 数据类型是32位、有符号的以二进制补码表示的整数， -2^31
        int intNumber = 1999;
        //  long 数据类型是 64 位、有符号的以二进制补码表示的整数, -2^63
        long lNumber = 100000L;
        //  float 数据类型是单精度、32位、的浮点数
        float fNumber = 234.5f;
        //  double 数据类型是双精度、64 位
        double dNumber = 123.5;
        boolean isTrue = Math.random() > 0.5;
        //  char类型是一个单一的 16 位 Unicode 字符, 最小值 \u0000
        char letter = 'a';
        System.out.print(btNumber + "\n");
        System.out.print(stNumber + "\n");
        System.out.print(intNumber + "\n");
        System.out.print(lNumber + "\n");
        System.out.print(fNumber + "\n");
        System.out.print(dNumber + "\n");
        System.out.print(isTrue + "\n");
        System.out.print(letter + "\n");

    }
}
