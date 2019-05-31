/*
 * a_design_create.single_ton SingleTonHolder
 * @author GuoBin211 on 2019-05-31 20:42
 */
package a_design_create.single_ton;

class SingleTonHolder {
    /**
     * 内部类holder的方式速度快
     */
    private static class SingleTonInner {
        private static SingleTonHolder singleTonHolder = new SingleTonHolder();
    }

    private SingleTonHolder() {
        System.out.println("SingleTonHolder created...");
    }

    static SingleTonHolder getInstance() {
        System.out.println("SingleTonHolder get...");
        return SingleTonInner.singleTonHolder;
    }
}

