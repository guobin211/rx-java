package reflect;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author GuoBin201314@gmail.com on 2018/11/17 23:30
 */
public class Compare {
    public static void main(String[] args) {
        String[] strings;
        strings = new String[]{"A", "C", "B", "b", "c"};
        Arrays.sort(strings, Comparator.naturalOrder());
        //  使用内置方法排序
        Arrays.sort(strings, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(strings));
        lambda(strings);

        Field[] res = Arrays.class.getDeclaredFields();

        for (Field re : res) {
            System.out.println(re);
        }

    }

    /**
     * 箭头函数 排序
     * @param s []
     */
    static void lambda(String[] s) {
        Arrays.sort(s, (s1, s2) -> {
            return s1.toLowerCase().compareTo(s2.toLowerCase());
        });
        System.out.println(Arrays.toString(s));
    }
}
