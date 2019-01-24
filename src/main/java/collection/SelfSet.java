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


        // hashSet 继承 自 set , 内部无重复元素, 无索引, 存取顺序不一致

        HashSet<String> hashSet = new HashSet<String>(Arrays.asList("jack", "tom", "tom", "mary"));
        System.out.println(hashSet);

        hashSet.add("hock");
        System.out.println(hashSet);
        // for 遍历
        for (String hs: hashSet) {
            System.out.println(hs);
        }

        // 针对自定义object 需要重写equals, hashCode
        HashSet<SelfPerson> selfPersonHashSet = new HashSet<>();
        SelfPerson selfPerson = new SelfPerson("张飞", 22);
        selfPersonHashSet.add(selfPerson);
        selfPersonHashSet.add(new SelfPerson("张飞", 18));
        selfPersonHashSet.add(new SelfPerson("张飞", 18));
        selfPersonHashSet.add(new SelfPerson("赵云", 18));
        selfPersonHashSet.add(new SelfPerson("赵云", 18));

        for (SelfPerson person: selfPersonHashSet) {
            System.out.println(person.toString());
        }

        System.out.println(selfPersonHashSet);

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
