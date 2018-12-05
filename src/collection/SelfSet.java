package collection;

import java.util.*;

/**
 * @author GuoBin201314@gmail.com on 2018/11/17 17:27
 */
public class SelfSet {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("jack", "tom", "tom", "mary");
        List<String> resList = removeDuplicate(list);
        System.out.println(resList);
    }

    /**
     * 去重复，排序
     * @param list list
     * @return list
     */
    private static List<String> removeDuplicate(List<String> list) {
        Set<String> set = new TreeSet<>(list);
        return new ArrayList<>(set);
    }
}
