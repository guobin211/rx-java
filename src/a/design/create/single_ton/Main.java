/*
 * a_design_create.single_ton Main
 * @author GuoBin211 on 2019-05-31 20:12
 */
package a.design.create.single_ton;

/**
 * 单例模式只能有一个实例对象
 * 推荐使用 内部类 holder模式
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("单例模式, 只有一个对象出来");

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("多线程启动...");
//                System.out.println(SingleTonB.getSingleTon());
                System.out.println(SingleTonHolder.getInstance());
            }
        });
        // start() 启动线程异步,会产生来多个实例
        thread.start();
        // run() 不会产生多个实例
//        thread.run();

        SingleTonHolder singleTonHolder = SingleTonHolder.getInstance();
        System.out.println(singleTonHolder);

        SingleTonA singleTonA = SingleTonA.getSingleTon();
        SingleTonA singleTonA1 = SingleTonA.getSingleTon();
        // 懒汉式单例模式，遇到多线程会有多个对象的问题
//        SingleTonB singleTonB = SingleTonB.getSingleTon();
//        SingleTonB singleTonB1 = SingleTonB.getSingleTon();

//        System.out.println(singleTonA);
//        System.out.println(singleTonA1);
        // true
//        System.out.println(singleTonA.equals(singleTonA1));
//        System.out.println(singleTonB);
//        System.out.println(singleTonB1);
    }
}

