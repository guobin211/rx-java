/*
 * a_design_create.factory_method McStore
 * @author GuoBin211 on 2019-05-31 22:35
 */
package a.design.create.factory_method;

public class McStore implements IStore {
    McStore() {
    }

    @Override
    public IChips getChips() {
        return new McChips();
    }
}

