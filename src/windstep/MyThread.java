package windstep;

/**
 * 多线程
 * @author GuoBin201314@gmail.com on 2018/11/18 13:07
 */
public class MyThread {
    public static void main(String[] args) {
        System.out.println("main start...");
        //  线程实例 h
        HelloThread h = new HelloThread("jack");
        //  线程启动
        h.start();
        System.out.println(h.getCount());
        h.add(5);
        System.out.println(h.getCount());
        h.dec(2);
        System.out.println(h.getCount());
        System.out.println("main end...");
    }

}

/**
 * 子线程类继承自Thread
 * 子线程覆写了run()
 */
class HelloThread extends Thread {
    int count = 0;
    String name;
    public HelloThread(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 0; i < 3 ; i++) {
            System.out.println("Hello" + name + "!");
        }
    }
    public int getCount() {
        return count;
    }

    /**
     * sync 异步操作变量
     * @param a int
     */
    public synchronized void add(int a) {
        count += a;
    }
    public synchronized void dec(int d) {
        count -= d;
    }
}