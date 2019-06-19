/*
 * a_design_create.abstract_factory Potato
 * @author GuoBin211 on 2019-05-31 22:49
 */
package a.design.create.abstract_factory;

public class Potato implements IFood {
    @Override
    public void eat() {
        System.out.println("eat Potato...");
    }
}

