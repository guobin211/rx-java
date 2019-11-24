package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.Executors.*;

/**
 * ThreadPoolRun
 * ktx
 *
 * @author guobin211
 * @version 0.0.1
 * @date 2019/11/24 at 9:50 下午
 */
public class ThreadPoolRun {

    private final static int MAX_POOL = 3;
    private final static int TEST_POOL = 10;
    private static int num = 0;

    /**
     * 缓存线程池
     * 线程可回收
     */
    private static void testCachedThreadPool() {
        ExecutorService cachedThreadPool = newCachedThreadPool();
        for (int i = 0; i < TEST_POOL; i++) {
            final int index = i;
            try {
                Thread.sleep(2 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cachedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("TAG" + Thread.currentThread().getName() + ": " + index);
                }
            });
        }
        cachedThreadPool.shutdown();
    }

    /**
     * 最大并发线程池
     */
    private static void testFixPool() {
        ExecutorService fixedThreadPool = newFixedThreadPool(MAX_POOL);
        for (int i = 0; i < TEST_POOL; i++) {
            final int index = i;
            fixedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("TAG" + Thread.currentThread().getName() + ": " + index);
                    try {
                        Thread.sleep(2 * 1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        fixedThreadPool.shutdown();
    }

    /**
     * 定时任务
     */
    private static void testScheduled() {
        ScheduledExecutorService scheduledExecutorService = newSingleThreadScheduledExecutor();
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                num++;
                System.out.println("TAG: delay 2 seconds, evert 3 seconds");
                if (num > MAX_POOL) {
                   scheduledExecutorService.shutdown();
                }
            }
        }, 2, 3, TimeUnit.SECONDS);

    }

    public static void main(String[] args) {
//        testCachedThreadPool();
       // testFixPool();
        testScheduled();
    }

}
