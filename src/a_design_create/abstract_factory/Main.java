/*
 * a_design_create.abstract_factory Main
 * @author GuoBin211 on 2019-05-31 22:42
 */
package a_design_create.abstract_factory;

public class Main {

    public static void main(String[] args) {
        System.out.println("抽象工厂:");
        // 抽象工厂生产数据
        FoodStore foodStore = new FoodStore();
        Beef beef = foodStore.getBeef();
        beef.eat();
        Potato potato = foodStore.getPotato();
        potato.eat();
    }
}

