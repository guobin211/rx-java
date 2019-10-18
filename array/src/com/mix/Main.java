package com.mix;

import java.util.ArrayList;

/**
 * @author guobin
 */
public class Main {

    private static final int COUNT = 5;

    /**
     * 时间复杂度分析 O(n)
     * 实际时间 T = c1 * n + c2
     * 数组开辟的空间容量越大,操作速度越慢,resize()方法负责容量调整 O(n)
     */
    private static void jdkArrayList() {
        int[] arr = new int[20];
        for (int i = 0; i < COUNT; i++) {
            arr[i] = i;
        }
        System.out.println(arr[1]);
        int[] scores = new int[]{70, 80, 90};
        for (int el : scores) {
            System.out.println(el);
        }
    }

    private static void jsonArray() {
        ArrayList<Person> people = new ArrayList<Person>();
        for (int i = 0; i < COUNT; i++) {
            people.add(new Person("jack", i));
        }
        for (Person el : people) {
            System.out.println(el.getAge());
            if (el.getAge() == 3) {
                System.out.println(el);
            }
        }
        System.out.println(people);
    }

    public static void main(String[] args) {
        jdkArrayList();
        jsonArray();
    }
}
