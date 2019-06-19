package net.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/*
 * Sleeping
 * @Author guobin201314@gmail.com on 2019-06-07 12:44
 */
public class Sleeping extends LifeOff {
    // 继承 runner able 线程
    @Override
    public void run() {
        try {
            while (countDown-- > 0) {
                System.out.println(status());
                // 当前线程休眠100ms
                // Thread.currentThread().sleep(100);
                // Thread.sleep(100);
                // 睡眠100毫秒
                TimeUnit.MILLISECONDS.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.err.println("线程中断");
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            // 执行器的执行方法
            executorService.execute(new Sleeping());
        }
        // 执行器关闭0
        executorService.shutdown();
    }
}
