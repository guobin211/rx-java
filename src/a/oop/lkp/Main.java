/*
 * a_oop.lkp Main 迪米特法则
 * @author GuoBin211 on 2019-05-31 19:46
 */
package a.oop.lkp;

public class Main {
    public static void main(String[] args) {
        Jack jack = new Jack();
        Jeo jeo = new Jeo();
        // 层层依赖,class之间的细节关联精密
        jack.eat(new Hamburger(new Beef(), new Bread()));
        jeo.eat(new Hamburger(new Beef(), new Bread()));

        // 优化,使用一个food类提供需要的数据
        FoodFactory foodFactory = new FoodFactory();
        jack.eat(foodFactory.sell());
    }
}

