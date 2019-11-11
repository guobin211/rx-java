package com.mix.contrast.create;

/**
 * 抽象类
 */
abstract class BaseEat {
    /**
     * eat()
     */
    abstract void eat();
}

/**
 * 实现类
 */
abstract class BaseRun {
    /**
     * run()
     */
    abstract void run();
}

class Foods extends BaseEat {
    @Override
    void eat() {
        System.out.println("Foods eat()...");
    }
}

class Car extends BaseRun {
    @Override
    void run() {
        System.out.println("Car run()...");
    }
}



/**
 * @author guobin211
 * @version 0.0.1
 * @date 2019-11-11  14:51
 */
public class AbstractFactory {

    private Foods createFoods() {
        return new Foods();
    }

    private Car createCar() {
        return new Car();
    }

    public static void main(String[] args) {
        // 抽象工厂不关注具体实现
        AbstractFactory abstractFactory = new AbstractFactory();
        BaseEat foods = abstractFactory.createFoods();
        foods.eat();
        BaseRun car = abstractFactory.createCar();
        car.run();
    }
}
