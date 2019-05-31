/*
 * a_design_create.simple_factory Fish
 * @author GuoBin211 on 2019-05-31 22:14
 */
package a_design_create.simple_factory;

public class Fish implements IFood {
    Fish() {
    }

    @Override
    public void eat() {
        System.out.println("eat Fish...");
    }
}

