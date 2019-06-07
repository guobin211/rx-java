package string;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * StreamString
 * @Author guobin201314@gmail.com on 2019-06-07 22:28
 */
public class StreamString {
    public static void main(String[] args) {
        String html = "<h1>hello java </h1> <p>欢迎使用java</p>";

        Stream.of(html.split(" ")).filter(s -> s.length() > 4).map(s -> s + "长度:" + s.length())
                .forEach(System.out::println);

        Integer len = Stream.of(html.split(" ")).map(String::length).reduce(0, (s1, s2) -> s1 + s2);
        System.out.println("文字的总长度" + len);
        // 并行流
        long res = IntStream.range(1, 100).parallel().peek(StreamString::debug).count();
        System.out.println(res);
        // 10 个 0 - 100 的数
//        new Random().ints().filter(i -> i > 0 && i < 100).limit(5).forEach(System.out::println);

        int[] arr = createNums(10);
        for (int value : arr) {
            System.out.println(value);
        }


    }

    private static void debug(int i) {
        System.out.println("debug " + i);
    }

    private static int[] createNums(int n) {
        int[] nums = new int[n];
        Random random = new Random(1);
        for (int i = 0; i < n; i++) {
            nums[i] = random.nextInt(100);
        }
        return nums;
    }
}
