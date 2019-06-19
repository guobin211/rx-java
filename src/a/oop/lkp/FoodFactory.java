/*
 * a_oop.lkp FoodFactory
 * @author GuoBin211 on 2019-05-31 19:48
 */
package a.oop.lkp;

class FoodFactory {
    FoodFactory() {
    }
    public Hamburger sell() {
        return new Hamburger(new Beef(), new Bread());
    }
}

