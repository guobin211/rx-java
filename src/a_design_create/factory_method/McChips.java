/*
 * a_design_create.factory_method McChips
 * @author GuoBin211 on 2019-05-31 22:32
 */
package a_design_create.factory_method;

public class McChips implements IChips {
    McChips() {
    }

    @Override
    public void eat() {
        System.out.println("eat in McChips...");
    }
}

