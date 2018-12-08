package array;

/**
 * FileName Main.java
 *
 * @author guobin201314@gmail.com on 2018/12/8 10:32
 * @version 1.0.0
 */
public class Main {
    public static void main(String[] args) {
        int size = 10;
        // 创造泛形对象数组
        Array<Integer> arr = new Array<>(11);
        for (int i = 0; i < size; i++) {
            arr.addLast(i);
        }
        System.out.println(arr);

        arr.addLast(100);
        System.out.println(arr);

        arr.insert(1, 3);
        System.out.println(arr);
        System.out.println(arr.isEmpty());

        arr.insertFirst(10);
        int l = arr.getLength();
        System.out.println(l);

        arr.set(0, 10);
        System.out.println(arr);

        arr.remove(0);
        System.out.println(arr);

        System.out.println(arr.get(5));

        arr.remove(0);
        arr.remove(0);
        arr.remove(0);
        arr.remove(0);
        arr.remove(0);
        arr.remove(0);
        System.out.println(arr);
    }
}
