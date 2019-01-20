package lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;

/**
 * FunctionDemo.java
 *
 * @author guobin201314@gmail.com on 2018-12-06 18:49
 * @version 1.8.0
 */
public class FunctionDemo {
    public static void main(String[] args) {
        // 断言 接收T对象并返回boolean
        Predicate<Integer> predicate = i -> i > 0;
        System.out.println(predicate.test(-6));
        // 接收T对象，不返回值
        Consumer<String> consumer = s -> System.out.println("消费了" + s);
        consumer.accept("consumer");

        getMinNumber();
        // 箭头函数
        new Thread(() -> System.out.println("线程")).start();
        // 实现 x+y 的级联表达式
        Function<Integer, Function<Integer, Integer>> func = x -> y-> x + y;
        // 柯里化函数
        System.out.println(func.apply(2).apply(3));
    }

    public static void getMinNumber() {
        int[] nums = {33,-55,22,-66,88,99};
        int min = IntStream.of(nums).min().getAsInt();
        System.out.println(min);
    }
}
