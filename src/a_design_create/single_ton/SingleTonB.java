/*
 * a_design_create.single_ton SingleTonB
 * @author GuoBin211 on 2019-05-31 20:21
 */
package a_design_create.single_ton;

public class SingleTonB {
    public String name = "SingleTonB";
    // volatile 关键字
    private volatile static SingleTonB singleTonB = null;

    private SingleTonB() {
        System.out.println(this.getClass().getSimpleName() + "created");
    }

    // synchronized 同步关键字 效率低
//    static synchronized SingleTonB getSingleTon() {
//        if (singleTonB == null) {
//            try {
//                // 异步
//                Thread.sleep(3000L);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            singleTonB = new SingleTonB();
//        }
//        return singleTonB;
//    }

    // 锁 双重检测机制 效率较低
    static SingleTonB getSingleTon() {
        // 两个线程可以同时进入 if
        if (singleTonB == null) {
            System.out.println("线程进入...");
            // 加锁, 两个线程不能同时进入
            synchronized (SingleTonB.class) {
                System.out.println("进入锁内...");
                if (singleTonB == null) {
                    try {
                        // 异步
                        Thread.sleep(3000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    singleTonB = new SingleTonB();
                }
            }
        }
        return singleTonB;
    }
}

