package queue;

import java.util.Random;

/*

 * MainQueue
 * @Author guobin201314@gmail.com on 2019-06-12 21:45
 */
public class MainQueue {

    private static double testQueue(IEventQueue q, int opCount) {
        long startTime = System.nanoTime();
        Random random = new Random();
        for (int i = 0; i < opCount; i++) {
            q.enqueue(random.nextInt(Integer.MAX_VALUE));
        }
        for (int i = 0; i < opCount; i++) {
            q.dequeue();
        }
        long endTine = System.nanoTime();
        return (endTine - startTime) / 1000000000.0;
    }

    public static void main(String[] args) {
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();

        for (int i = 0; i < 10; i++) {
            arrayQueue.enqueue(i);
            if (i % 3 == 0) {
                int res = arrayQueue.dequeue();
                System.out.println(res);
            }
            System.out.println(arrayQueue);
        }

        int opCount = 50000;
        // array-queue 改变data o(n^2) 很慢
        ArrayQueue<Integer> arrayQueue1 = new ArrayQueue<>();
        double time1 = testQueue(arrayQueue1, opCount);
        System.out.println("ArrayQueue time:" + time1 + " s");

        // loop-queue 不改变data只改变索引 o(n)
        LoopQueue<Integer> loopQueue = new LoopQueue<>();
        double time2 = testQueue(loopQueue, opCount);
        System.out.println("LoopQueue time" + time2 + " s");

        // linked-queue 不改变data只改变索引 o(n)
        LinkedQueue<Integer> linkedQueue = new LinkedQueue<>();
        double time3 = testQueue(linkedQueue, opCount);
        System.out.println("LinkedQueue time" + time3 + " s");
    }
}
