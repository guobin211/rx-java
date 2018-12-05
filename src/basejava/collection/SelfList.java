package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * List<E> 有序链表
 * @author GuoBin201314@gmail.com on 2018/11/17 17:28
 */
public class SelfList {

    public static void main(String[] args) {
        List l = new ArrayList<String>();
        l.add("eee");
        l.add("aaa");
        l.add("mmm");
        l.add("obj");
        l.remove("obj");
        int index = l.indexOf("aaa");
        Object[] a = l.toArray();
        System.out.println(Arrays.toString(a));
        System.out.println(l);
        System.out.println(index);
        System.out.println(l.toArray()[1]);

        String linked;
        linked = Linked.HOME;
        System.out.println(linked);

        List testList = new ArrayList();
        testList.add(666);
        testList.add("aaa");
        //  equals 判断是不是同一个对象
        System.out.print(testList.equals(l));

    }
}