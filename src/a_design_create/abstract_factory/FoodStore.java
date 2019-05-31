/*
 * a_design_create.abstract_factory FoodStore
 * @author GuoBin211 on 2019-05-31 22:51
 */
package a_design_create.abstract_factory;

public class FoodStore implements IStore {
    FoodStore() {
        System.out.println("FoodStore created...");
    }

    @Override
    public Beef getBeef() {
        System.out.println("FoodStore build Beef");
        return new Beef();
    }

    @Override
    public Potato getPotato() {
        System.out.println("FoodStore build getPotato");
        return new Potato();
    }
}

