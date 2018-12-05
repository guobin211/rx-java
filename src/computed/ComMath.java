package computed;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

import static java.lang.Math.random;

/**
 * @author GuoBin201314@gmail.com on 2018/11/17 15:03
 */
public class ComMath {
    public static void main(String[] args) {
        System.out.println(Math.sqrt(8));
        System.out.println(random());
        Random r = new Random(12345);
        System.out.println(r.nextInt(10));
        BigInteger b = new BigInteger("1234567890");
        BigDecimal d = new BigDecimal("123.31");
        display(b);
        display(d);
    }

    private static void display(Number s) {
        System.out.println(s);
    }
}
