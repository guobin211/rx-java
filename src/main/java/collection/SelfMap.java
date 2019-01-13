package collection;

import java.util.*;

/**
 * @author GuoBin201314@gmail.com on 2018/11/17 17:28
 */
public class SelfMap {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(new Person("tom", 23),
                new Person("mary", 19),
                new Person("jack", 22),
                new Person("jack", 22));
        //  list转HashMap
        Map<String, Person> map = new HashMap<>(10);
        for (Person p: list) {
            System.out.println(p.name);
            System.out.println(p.getName());
            map.put(p.name, p);
        }
        //  map中没有重复的对象
        for (String key: map.keySet()) {
            System.out.println(key + "-->" + map.get(key));
        }
    }
}
