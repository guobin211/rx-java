/*
 * a_design_create.factory_method KfcChips
 * @author GuoBin211 on 2019-05-31 22:33
 */
package a_design_create.factory_method;

public class KfcChips implements IChips {
    KfcChips() {
    }

    @Override
    public void eat() {
        System.out.println("eat KfcChips...");
    }
}

