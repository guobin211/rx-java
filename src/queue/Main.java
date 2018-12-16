package queue;

import java.util.Random;

/**
 * File Main.java
 *
 * @author guobin201314@gmail.com on 2018/12/8 21:42
 * @version jdk 1.8.0
 */
public class Main {


    private static double testQueue(Queue<Integer> q, int opCount) {
        long startTime = System.nanoTime();

        Random random = new Random();
        // 入队测试
        for (int i = 0; i < opCount; i++) {
            q.enqueue(random.nextInt(Integer.MAX_VALUE));
        }
        // 出队测试
        for (int i = 0; i <opCount ; i++) {
            q.dequeue();
        }

        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000000.0;
    }

    public static void main(String[] args) {
        int opCount = 110000;
        // 分别测试数组和循环队列的时间消耗
        ArrayQueue<Integer> arrayQueue = new ArrayQueue <>();
        double time1 = testQueue(arrayQueue, opCount);

        LoopQueue<Integer> loopQueue = new LoopQueue <>();
        double time2 = testQueue(loopQueue, opCount);

        System.out.println( "ArrayQueue Time: " + time1 + "s," + "LoopQueue time: " + time2 + "s");

    }

}
