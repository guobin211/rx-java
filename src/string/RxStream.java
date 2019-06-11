package string;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * RxStream
 * @Author guobin201314@gmail.com on 2019-06-11 09:35
 */
public class RxStream {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        for (int value : arr) {
            System.out.println(value);
        }
        // map 改变值，不改变流
        IntStream.of(arr).map(RxStream::doubleNumber).forEach(System.out::println);
    }

    private static int doubleNumber(int n) {
        return n * 2;
    }
}
