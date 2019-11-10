package com.mix.contrast.create;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * @author guobin211
 * @version 0.0.1
 * @date 2019-11-07  10:00
 */
public class SingleCase {

    private final static int MAX = 5;

    private static void testMap() {
        System.out.println("SingleCase private static testMap()");
        Object object = new Object();
        System.out.println(object);
        System.out.println(object.getClass().getName());
        Map<String, Object> anyObject = new HashMap<>(10);
        anyObject.put("object", object);
        anyObject.put("name", "Object");
        for (String key : anyObject.keySet()) {
            System.out.println(key);
            System.out.println(anyObject.get(key));
        }
    }

    public static void main(String[] args) {
        int poolSize = 10;
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < poolSize; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        SingleTon singleTon  = SingleTon.getInstance();
                        System.out.println(singleTon.getData());
                        singleTon.addData(1);
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            if (i == poolSize - 1) {
                executorService.shutdown();
            }
        }

        for (int i = 0; i < MAX; i++) {
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    SingleTon singleTon = SingleTon.getInstance();
                    System.out.print("Runnable: ");
                    System.out.println(singleTon.getAge());
                    // 多线程调用单例的同一个方法是同时进行的
                    singleTon.addAge();
                }
            });
        }
        SingleTon singleTon = SingleTon.getInstance();
        System.out.print("SingleTon: ");
        System.out.println(singleTon.getAge());
        pool.shutdown();
    }
}
