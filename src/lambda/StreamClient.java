package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * StreamClient
 * @Author guobin201314@gmail.com on 2019-06-07 20:35
 */

class CreateOfCollection {
    static void createByList() {
        List<String> list = new ArrayList<>();
        list.add("集合流1");
        list.add("集合流2");
        Stream<String> res = list.stream().map(s -> "map: " + s);
        res.forEach(System.out::println);
    }
}

class SelfGenerator {
    // 创建无限流
    static void createLimit() {
        // limit限制
        IntStream res = new Random(1).ints().limit(10);
        res.forEach(System.out::println);
    }
}

public class StreamClient {

    public static void main(String[] args) {
        int[] ratings = {11, 33, 22, 44, 55, 99, 12};
        int min = Integer.MAX_VALUE;
        // 函数式编程
        int min2 = IntStream.of(ratings).min().getAsInt();
        int res = IntStream.of(ratings).map(i -> i + 2).sum();
        System.out.println("求和为" + res);
        System.out.println(min2);
        // 断言函数
        Predicate<Integer> predicate = integer -> integer > 0;
        System.out.println(predicate.test(5));
        // 消费者
        Consumer<String> consumer = s -> System.out.println("消费者没有返回值：" + s);
        consumer.accept("data数据");

        // 函数
        Function<Integer, String> getUser = integer -> "age is" + integer;
        user(getUser);

        // 方法引用
        Consumer<String> stringConsumer = System.out::println;
        stringConsumer.accept("方法引用");

        // 创建流
        CreateOfCollection.createByList();
        SelfGenerator.createLimit();
        System.out.println(randomInt());
    }

    private static void user(Function<Integer, String> function) {
        System.out.println("user is jack; " + function.apply(19));
    }
    // 1-100以内的随机数
    private static int randomInt() {
        return (int) (System.currentTimeMillis() % (100 - 1) + 1);
    }
}
