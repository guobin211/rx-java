package string;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Test
 *
 * @author GuoBin211 on 2019-05-29 13:38
 */
public class Test {
    public static void main(String[] args) {
        boolean died;
        died = true;
        // 字符
        char ch = 'a';
        // 整数
        byte bt = -128;
        byte bt1 = 127;
        short sh = -32568;
        int it = -222;
        int it8 = 012;
        long lon = 99999L;
        // 小数默认是double f d
        float flo = 1.99F;
        double db = 9.99;

        BigInteger bigInteger = new BigInteger("100");
        // 高精度整数运算
        System.out.println(bigInteger.subtract(new BigInteger(String.valueOf(it))));
        // 高精度小数运算
        BigDecimal bigDecimal = new BigDecimal(1.1);
        System.out.println(new BigDecimal(bigInteger));
        System.out.println(bigDecimal.add(new BigDecimal(bigInteger)));

        double res = db + flo;
        System.out.println(res);

        Number num = 123.321;
        String str = "jack";
        String[] strings = {"jack", "tom"};
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 6; i++) {
            list.add(i);
        }

        List<String> stringList = new ArrayList<String>();
        Collections.addAll(stringList, strings);

        System.out.println(stringList);
        System.out.println("8进制:" + it8);
        System.out.println(list);
        System.out.println(strings[1]);
    }
}
