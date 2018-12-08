package lambda;

import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * FunctionDemo.java
 *
 * @author guobin201314@gmail.com on 2018-12-06 18:49
 * @version 1.8.0
 */
public class FunctionDemo {
    public static void main(String[] args) {
        // 断言
        Predicate<Integer> predicate = i -> i > 0;
        System.out.println(predicate.test(-6));

        Consumer<String> consumer = s -> System.out.println("消费了" + s);

        consumer.accept("consumer");
    }
}
