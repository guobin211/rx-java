package array;

import java.util.Stack;

/*
 * StackClient
 * @Author guobin201314@gmail.com on 2019-06-05 14:17
 */
public class StackClient {
    public static void main(String[] args) {
        Stack<Integer> integers = new Stack<Integer>();
        integers.push(1);
        integers.push(2);
        integers.push(3);
        integers.push(4);

        System.out.println(integers.pop());
        integers.pop();
        System.out.println(integers.peek());

        if (integers.isEmpty()) {
            System.out.println("stack is empty");
        }
    }
}
