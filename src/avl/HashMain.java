package avl;

import java.util.HashSet;

/**
 * HashMain class
 *
 * @author GuoBin guobin201314@gmail.com
 * @date 2019-06-29
 */
public class HashMain {
    public static void main(String[] args) {
        int a = 42;
        Integer a1 = (Integer) a;
        int b = -42;
        Integer a2 = (Integer) b;
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
        String s = "admin";
        System.out.println(s.hashCode());

        Person person = new Person("jack", 22);
        Person person1 = new Person("tom", 22);
        System.out.println(person.hashCode());

        HashSet<Person> hashSet = new HashSet<>();
        hashSet.add(person);
        hashSet.add(person1);
        for (Person p : hashSet) {
            System.out.println(p.toString());
        }
    }
}
