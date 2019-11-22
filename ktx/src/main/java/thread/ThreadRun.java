package thread;

/**
 * thread
 *
 * @author guobin211
 * @version 0.0.1
 * @date 2019/11/21 at 2:57 下午
 */
public class ThreadRun {
    public static void main(String[] args) {
        System.out.println("测试Java多线程");
        System.out.println(Thread.currentThread().getName() + "() run...");
        // 值传递
        DataVm dataVm = new DataVm();
        new SubThread(dataVm).start();
        new SubThread(dataVm).start();
        new SubRunnable().run();
    }
}

class DataVm {
    private int age = 10;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class SubThread extends Thread {
    private DataVm dataVm;
    SubThread(DataVm dataVm) {
        this.dataVm = dataVm;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "() run...");
        System.out.println(this.dataVm.getAge());
        this.dataVm.setAge(this.dataVm.getAge() + 1);;
    }
}

class SubRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("SubRunnable()...");
    }
}
