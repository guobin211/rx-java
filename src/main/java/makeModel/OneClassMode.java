package makeModel;

/**
 * MakeModel   OneClassMode
 * 单例模式 一个类有且只有一个实例, 类必须自行创建
 * 提供全局唯一的数据访问  如软件配置
 * @author guobin201314@gmail.com on 2019-01-19
 * @version 1.0.0 by JDK 1.8
 */
public class OneClassMode {
    public static void main(String[] args) {
        System.out.println("OneClassMode");
        // 一个类对象同一个内存地址
        System.out.println("SingleTonA" + SingleTonA.getInstance());
        System.out.println("SingleTonA" + SingleTonA.getInstance());
        System.out.println("SingleTonB" + SingleTonB.getInstance());
        // 使用内部类 解决多线程问题
        System.out.println("SingleTon" + SingleTonHolder.getInstance());
    }
}

/**
 * 饿汉式单列模式
 * 线程安全
 */
class SingleTonA{
    private static SingleTonA singleTonA = new SingleTonA();
    private SingleTonA() {}
    public static SingleTonA getInstance() {
        return singleTonA;
    }
}

/**
 * lazy 单例模式
 * 需要时被创建
 */
class SingleTonB{
    private static SingleTonB singleTonB = null;
    private SingleTonB() {}
    public static SingleTonB getInstance() {
        if (singleTonB == null) {
            singleTonB = new SingleTonB();
        }
        return singleTonB;
    }
}

/**
 * 使用内部内解决多重创建与性能的问题
 */
class SingleTonHolder {
    private static class SingleTonInnerHolder{
        private static SingleTonHolder instance = new SingleTonHolder();
    }

    private SingleTonHolder() {}

    public static SingleTonHolder getInstance() {
        System.out.println("SingleTonHolder  getInstance");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return SingleTonInnerHolder.instance;
    }
}