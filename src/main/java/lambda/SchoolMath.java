package lambda;

import java.text.DecimalFormat;
import java.util.function.Function;

/**
 * SchoolMath.java
 *
 * @author guobin201314@gmail.com on 2018-12-06 18:23
 * @version 1.8.0
 */
public class SchoolMath {
    public static void main(String[] args) {
        MathLambda mathLambda1 = x -> x * 2;
        Integer math1 = mathLambda1.doubleNumber(2);
        System.out.println(math1);

        Number math2 = mathLambda1.add(2, 9);
        System.out.println(math2);

        MathLambda2 mathLambda2 = x -> x * 3;
        Number math3 = mathLambda2.doubleNumber(2);
        Number math4 = mathLambda2.add(2,3);
        Number math5 = mathLambda2.addMore(2, 3);

        System.out.println(math3);
        System.out.println(math4);
        System.out.println(math5);

        MyMoney myMoney = new MyMoney(9999999);

        Function<Integer, String> moneyFormat = i -> new DecimalFormat("#,###").format(i);
        // 函数可以链式调用
        myMoney.printMoney(moneyFormat.andThen(s -> "人民币" + s));
    }

}

@FunctionalInterface
interface MathLambda {
    int doubleNumber(int i);

    default int add(int x, int y) {
        return x + y;
    }
}

@FunctionalInterface
interface MathLambda2 extends MathLambda {
    default int addMore(int x, int y) {
        return x + y + 9;
    }
}

class MyMoney{
    public final int money;

    public MyMoney(int money) {
        this.money = money;
    }

    /**
     * 函数接口 apply
     * @param moneyFormat function
     */
    public void printMoney(Function<Integer, String> moneyFormat) {
        System.out.println("存款为：" + moneyFormat.apply(this.money));
    }
}