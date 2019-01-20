package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * stream   JdkStream
 *
 * @author guobin201314@gmail.com on 2019-01-20
 * @version 1.0.0 by JDK 1.8
 */
public class JdkStream {
    public static void main(String[] args) {
        List<String> listStr = new ArrayList<>();

        final IntStream intStream = Arrays.stream(new int[]{1, 3, 5, 7, 9});
        final IntStream intStream2 = intStream.filter(el -> el > 5);
        System.out.println(intStream2.iterator().next());

        IntStream intStream1 = IntStream.of(1, 3, 5);
        System.out.println(intStream1.max());
        stringStream();

        // 并行流
        long count = IntStream.range(1, 100).parallel().peek(JdkStream::debug).count();
        System.out.println(count);
    }

    public static void stringStream() {
        String str = "i am a good student";
        Stream.of(str.split(" ")).peek(System.out::println).forEach(System.out::println);
        // 顺序 foreach
        str.chars().parallel().forEachOrdered(el -> System.out.println((char) el));
        // 收集器 转 list
        List list = Stream.of(str.split(" ")).collect(Collectors.toList());
        // [i, am, a, good, student]
        System.out.println(list);
        // 使用reduce拼接字符串
        final Optional<String> reduceRes = Stream.of(str.split(" ")).reduce((b, a) -> b + "-" + a);
        // i-am-a-good-student
        System.out.println(reduceRes.orElse(""));
        // 字母个数
        Integer reduceInt = Stream.of(str.split(" ")).map(String::length).reduce(0, (a, b) -> a + b);
        System.out.println(reduceInt);
    }

    public static void debug(int i) {
        System.out.println("debug" + i);
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
