package net_work.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * MainThread
 * @Author guobin201314@gmail.com on 2019-06-07 12:03
 */
public class MainThread {
    public static void main(String[] args) {
        LifeOff lifeOff = new LifeOff();
        lifeOff.run();
        // 线程
        Thread thread = new Thread(new LifeOff());
        thread.start();
        System.out.println("主线程启动");
        // 带缓冲的线程池
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            executorService.execute(new LifeOff());
        }
        // 关闭
        executorService.shutdown();
        // 单一的线程
        System.out.println("单一线程迟开始");
        executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            executorService.execute(new LifeOff());
        }
        // 关闭
        executorService.shutdown();
    }
}
