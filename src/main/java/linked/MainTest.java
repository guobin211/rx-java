package linked;

import java.util.Random;

import stack.ArrayStack;
import stack.Stack;

/**
 * File MainTest.java
 *
 * @author guobin201314@gmail.com on 2018/12/9 10:22
 * @version jdk 1.8.0
 */
public class MainTest {

    public static void main(String[] args) {
        LinkedList <Integer> linkedList = new LinkedList <>();

        for (int i = 0; i < 4; i++) {
            linkedList.addFirst(i);
        }

        linkedList.insert(2, 555);

        System.out.println(linkedList);

        System.out.println(linkedList.contains(1));

        Integer res = linkedList.remove(1);
        System.out.println(res);

        System.out.println(linkedList);

        test();

    }

    /**
     * 测试 arrayStack 和 linkedStack 的耗时
     * jdk 1.8 mac 64 位 : 链表栈比array慢
     */
    private static void test() {
        int opCount = 1000000;
        ArrayStack<Integer> arrayStack = new ArrayStack <>();
        double time1 = testStack(arrayStack, opCount);
        System.out.println(time1);

        LinkedStack<Integer> linkedList = new LinkedStack <>();
        double time2 = testStack(linkedList, opCount);
        System.out.println(time2);

    }



    private static double testStack(Stack<Integer> stack, int opCount) {
        long startTime = System.nanoTime();

        Random random = new Random();
        // 入队测试
        for (int i = 0; i < opCount; i++) {
            stack.push(random.nextInt(Integer.MAX_VALUE));
        }
        // 出队测试
        for (int i = 0; i <opCount ; i++) {
            stack.pop();
        }

        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000000.0;
    }
}
