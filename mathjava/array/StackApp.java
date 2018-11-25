package array;

/**
 * 栈
 *
 * @author guobin
 */
public class StackApp {
    private long[] stackArray;
    private int top;
    private int maxSize;

    /**
     * 构造函数
     *
     * @param n 最大值
     */
    StackApp(int n) {
        maxSize = n;
        stackArray = new long[n];
        top = 1;
    }

    /**
     * 增加
     *
     * @param j 新数据
     */
    public void push(long j) {
        stackArray[++top] = j;
    }

    /**
     * 删除
     *
     * @return function
     */
    public long pop() {
        return stackArray[top--];
    }

    /**
     * 查看
     *
     * @return function
     */
    public long peek() {
        return stackArray[top];
    }

    /**
     * 判断是否空栈
     *
     * @return boolean
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * 判断是否满栈
     *
     * @return boolean
     */
    public boolean isFull() {
        return top == maxSize;
    }
}
