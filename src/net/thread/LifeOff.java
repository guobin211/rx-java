package net.thread;

/*
 * LifeOff
 * @Author guobin201314@gmail.com on 2019-06-07 11:58
 */
public class LifeOff implements Runnable {

    protected int countDown = 10;
    private static int taskCOUNT = 0;
    private final int id = taskCOUNT++;

    LifeOff() {}

    LifeOff(int countDown) {
        this.countDown = countDown;
    }

    public String status() {
        return "#id" + id + "=" + (countDown > 0 ? countDown : "off!");
    }

    @Override
    public void run() {
        while (countDown-- > 0) {
            System.out.println(status());
            // 线程让步
            Thread.yield();
        }
    }
}
