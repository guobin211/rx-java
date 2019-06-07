package net_work.thread;

import java.util.ArrayList;
import java.util.concurrent.*;

/*
 * TaskResult Callable 可调用的接口
 * @Author guobin201314@gmail.com on 2019-06-07 12:28
 */
public class TaskResult implements Callable<String> {
    private int _id;

    public TaskResult(int id) {
        this._id = id;
    }
    @Override
    public String call() throws Exception {
        return "TaskResult id " + _id;
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        ArrayList<Future<String>> futures = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            // 接受任务返回值
            futures.add(executorService.submit(new TaskResult(i)));
        }

        for (Future<String> fs: futures) {
            try {
                System.out.println(fs.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        executorService.shutdown();
    }
}
