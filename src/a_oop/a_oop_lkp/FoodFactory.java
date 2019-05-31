/*
 * a_oop.a_oop_lkp FoodFactory
 * @author GuoBin211 on 2019-05-31 19:48
 */
package a_oop.a_oop_lkp;

class FoodFactory {
    FoodFactory() {
    }
    public Hamburger sell() {
        return new Hamburger(new Beef(), new Bread());
    }
}

