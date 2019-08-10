package lambda;

/*
 * HelpThread
 * @Author guobin201314@gmail.com on 2019-06-07 20:38
 */

import java.text.DecimalFormat;
import java.util.function.Function;

@FunctionalInterface
interface ISumOfNumber {
    /**
     * 需要自己实现的方法
     * @param a int
     * @param b int
     * @return int
     */
    int addNumber(int a, int b);

    /**
     * 默认实现的方法
     * @param x int
     * @param y int
     * @return int
     */
    default int delete(int x, int y) {
        return x - y;
    }
}

class Money {
    private int money = 0;
    Money(int money) {
        this.money = money;
    }

    /**
     *  logMoney函数接受一个实现了函数接口的函数
     * @param formatMoney fn
     */
    void logMoney(Function<Integer, String> formatMoney) {
        System.out.println("Money is:" + formatMoney.apply(this.money));
    }
}

/**
 * @author guobin
 */
public class HelpThread {
    private static Runnable runnable = () -> System.out.println("属性尖头函数");

    public static void main(String[] args) {
        Money money = new Money(100);
        // 实现函数
        Function<Integer, String> stringFunction = i -> new DecimalFormat("#, ###").format(i);
        // 链式调用
        money.logMoney(stringFunction.andThen(s -> "人名币:" + s));

        new Thread(getStream()).start();
        new Thread(runnable).start();
        // 函数接口->箭头函数的实现
        ISumOfNumber sumOfNumber = (a, b) -> a + b + 3;
        System.out.println(sumOfNumber.addNumber(1,2));
        System.out.println(sumOfNumber.delete(5,3));
    }

    private static Runnable getStream() {
        return () -> System.out.println("方法尖头函数");
    }
}
