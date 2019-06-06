package array;

import java.util.Vector;

/*
 * VectorClient
 * @Author guobin201314@gmail.com on 2019-06-05 14:08
 */
public class VectorClient {
    public static void main(String[] args) {
        // 向量 动态数组
        Vector v = new Vector(3, 2);
        System.out.println(v.size());
        // 容量 = 3
        System.out.println(v.capacity());
        v.add(0, 1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);
        // 扩容 + 2 = 5
        System.out.println(v.capacity());
        System.out.println(v.size());

        System.out.println(v.lastElement());
        System.out.println(v.elements());

        for (int i = 0; i < v.size(); i++) {
            System.out.println("第"+ (i + 1) + "个：" + v.elementAt(i));
        }
    }
}
