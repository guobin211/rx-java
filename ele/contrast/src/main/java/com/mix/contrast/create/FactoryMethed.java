package com.mix.contrast.create;

interface Language {
    /**
     * run hello world
     */
    void run();
}

class Rust implements Language {

    @Override
    public void run() {
        System.out.println("Hello Rust");
    }
}

class Java implements Language {

    @Override
    public void run() {
        System.out.println("Hello " + this.getClass().getName());
    }
}

/**
 * @author guobin211
 * @version 0.0.1
 * @date 2019-11-11  14:37
 */
public class FactoryMethed {

    public static Java getJava() {
        return new Java();
    }

    public static Rust getRust() {
        return new Rust();
    }

    public static void main(String[] args) {
        getJava().run();
        getRust().run();
    }
}
