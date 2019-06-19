/*
 * a_design_create.simple_factory Main
 * @author GuoBin211 on 2019-05-31 20:07
 */
package a.design.create.simple_factory;

public class Main {
    public static void main(String[] args) {
        System.out.println("简单工厂模式");
        FoodsShop foodsShop = new FoodsShop();

        IFood iFood = foodsShop.getFood("Fish");
        if (iFood != null) {
            iFood.eat();
        }

        iFood = foodsShop.getFood("Meat");
        if (iFood != null) {
            iFood.eat();
        }

        iFood = foodsShop.getFood("Tomato");
        if (iFood != null) {
            iFood.eat();
        }
        try {
            iFood.eat();
        } catch (NullPointerException e) {
            // null
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}

