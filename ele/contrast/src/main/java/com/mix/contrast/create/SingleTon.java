package com.mix.contrast.create;

/**
 * @author guobin211
 * @version 0.0.1
 * @date 2019-11-07  22:46
 */
public class SingleTon {

    private int singleData = 0;

    private static SingleTon mySibgle = new SingleTon();

    public static SingleTon getInstance() {
        return mySibgle;
    }

    public SingleTon() {
        System.out.println("SingleTon constractor...");
    }

    public void addData(int singleData) {
        this.singleData += singleData;
    }

    public int getData() {
        return this.singleData;
    }
}
