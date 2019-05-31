/*
 * a_design_create.simple_factory Meat
 * @author GuoBin211 on 2019-05-31 22:16
 */
package a_design_create.simple_factory;

public class Meat implements IFood {
    Meat() {
    }
    @Override
    public void eat() {
        System.out.println("eat Meat...");
    }
}

