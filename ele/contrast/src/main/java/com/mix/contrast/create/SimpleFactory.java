package com.mix.contrast.create;

interface Food {
    /**
     * eat
     */
    void eat();
}

/**
 * @author guobin211
 * @version 0.0.1
 * @date 2019-11-09  17:27
 */
public class SimpleFactory {

    static class FoodShop {
        Food getFoodByName(String name) {
            switch (name) {
                case "japan":
                    return new JapanFood();
                case "china":
                    return new ChineseFood();
                default:
                    return null;
            }
        }
    }

    static class JapanFood implements Food {
        @Override
        public void eat() {
            System.out.println("JapanFood eat...");
        }
    }

    static class ChineseFood implements Food {

        @Override
        public void eat() {
            System.out.println("ChineseFood eat...");
        }
    }

    public static void main(String[] args) {
        FoodShop foodShop = new FoodShop();
        String name = "japan";
        Food food = foodShop.getFoodByName(name);
        if (food != null) {
            food.eat();
        }
        System.exit(0);
    }
}
