/*
 * a_design_create.abstract_factory Beef
 * @author GuoBin211 on 2019-05-31 22:48
 */
package a_design_create.abstract_factory;

public class Beef implements IFood{
    @Override
    public void eat() {
        System.out.println("eat Beef...");
    }
}

