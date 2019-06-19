/*
 * a_design_create.factory_method KfcStore
 * @author GuoBin211 on 2019-05-31 22:36
 */
package a.design.create.factory_method;

public class KfcStore implements IStore {
    KfcStore() {
    }
    @Override
    public IChips getChips() {
        // 简单工厂
        return new KfcChips();
    }
}

