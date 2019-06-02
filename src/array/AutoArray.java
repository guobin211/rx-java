/*
 * array AutoArray
 * @author GuoBin211 on 2019-06-02 17:06
 */
package array;

import java.util.*;

public class AutoArray {
    /**
     * 泛型class
     * @param <T>
     */
    public static class AutoList<T> {
        private T list;
        AutoList(T list) {
            this.list = list;
        }

        private T getList() {
            return this.list;
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }

    public static void main(String[] args) {
        // 泛型方法
        AutoArray autoArray = new AutoArray();
        autoArray.func("jack");
        autoArray.func(3);
        autoArray.func(new ArrayList<>());

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        AutoList<List<Integer>> autoList = new AutoList<>(list);
        System.out.println(autoList.getList());

        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1, "jack");
        hashMap.put(2,"tom");
        hashMap.put(3, "jury");
        hashMap.put(hashMap.size()+1, "jones");
        System.out.println(hashMap);
        System.out.println(hashMap.get(2));

        Collection stringList = hashMap.values();
        System.out.println(stringList);

        CoffeeGenerator coffeeGenerator = new CoffeeGenerator();
        for (int i = 0; i < 3; i++) {
            System.out.println(coffeeGenerator.next());
        }
        System.out.println("迭代器：");
        for (Coffee c: new CoffeeGenerator(3)) {
            System.out.println(c);
        }
    }

    /**
     * 泛形方法
     * @param obj
     * @param <T>
     */
    private <T> void func(T obj) {
        System.out.println(obj.getClass().getName());
    }
}

