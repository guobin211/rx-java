package com.mix.contrast.create;

/**
 * @author guobin211
 * @version 0.0.1
 * @date 2019-11-09  16:42
 */
class SingleTon {
    /**
     * 私有静态常量
     */
    private final static int MAX = 1000;

    /**
     * 私有静态变量 SingleTon
     */
    private static SingleTon singleTon = null;

    /**
     * 私有变量
     */
    private int age;

    /**
     * 静态方法 getInstance
     *
     * @return SingleTon
     */
    static synchronized SingleTon getInstance() {
        if (singleTon == null) {
            singleTon = new SingleTon();
        }
        return singleTon;
    }

    /**
     * 构造函数 SingleTon
     */
    private SingleTon() {
        System.out.println("SingleTon private 构造函数...");
        this.age = 0;
    }

    /**
     * 公开方法 getAge
     *
     * @return age
     */
    int getAge() {
        System.out.println("call getAge()");
        return age;
    }

    /**
     * 公开方法 addAge
     */
    void addAge() {
        System.out.println("call addAge()");
        if (age < MAX) {
            this.age = this.age + 1;
        } else {
            this.age = 0;
        }
    }
}
