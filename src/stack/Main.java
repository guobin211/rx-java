package stack;

/**
 * FileName MainBus.java
 *
 * @author guobin201314@gmail.com on 2018/12/8 18:59
 * @version 1.0.0
 */
public class Main {
    public static void main(String[] args) {
        ArrayStack<Integer> arrayStack = new ArrayStack<>();

        // 继承 Array ===> ArrayStack ===> Object
        System.out.println(arrayStack);

        for (int i = 0; i < 5; i++) {
            arrayStack.push(i);
            System.out.println(arrayStack);
        }

        System.out.println(arrayStack.peek());
    }
}
