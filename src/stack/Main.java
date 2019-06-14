package stack;

/*
 * Main
 * @Author guobin201314@gmail.com on 2019-06-12 21:02
 */
public class Main {
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
    }
}
