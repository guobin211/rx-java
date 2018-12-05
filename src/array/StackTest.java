package array;

/**
 * 栈 测试
 *
 * @author guobin
 */
public class StackTest {
    public static void main(String[] arg) {
        StackApp stacks = new StackApp(10);
        stacks.push(10);
        stacks.push(20);
        stacks.push(30);
        while (!stacks.isEmpty()) {
            long value = stacks.pop();
            System.out.print(value + "");
        }
        System.out.print(stacks.isFull());
        System.out.print(stacks.peek());
    }
}
