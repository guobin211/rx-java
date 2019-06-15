package stack;

import java.util.Random;

/*
 * MainQueue
 * @Author guobin201314@gmail.com on 2019-06-12 21:02
 */
public class MainStack {
    
    private static double testStack(IEventStack<Integer> stack, int count) {
        long start = System.nanoTime();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            stack.push(random.nextInt(Integer.MAX_VALUE));
        }
        for (int i = 0; i < count; i++) {
            stack.pop();
        }
        long end = System.nanoTime();
        return (end - start) / 1000000000.0;
    }
    
    public static void main(String[] args) {
        System.out.println("栈");
        ArrayStack<Integer> arrayStack = new ArrayStack<>();

        for (int i = 0; i < 5; i++) {
            arrayStack.push(i);
        }
        System.out.println(arrayStack);
        Integer res = arrayStack.pop();
        System.out.println(res);
        System.out.println(arrayStack);
        int count = 1000000;
        LinkedStack<Integer> linkedStack = new LinkedStack<>();
        double time1 = testStack(linkedStack, count);
        System.out.println(time1);
        // arrayStack 速度要快，不需要 new Node() 操作
        ArrayStack<Integer> arrayStack1 = new ArrayStack<>();
        double time2 = testStack(arrayStack1, count);
        System.out.println(time2);
    }
}
