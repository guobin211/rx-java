/*
 * a_design_create.factory_method Main
 * @author GuoBin211 on 2019-05-31 22:31
 */
package a_design_create.factory_method;

public class Main {
    public static void main(String[] args) {
        System.out.println("工厂方法:");
        // 抽象工厂
        IStore store = new McStore();
        // 抽象工厂
        IChips iChips = store.getChips();
        store.getChips().eat();
        // 更改返回的数据，原McStore已经销毁
        store = new KfcStore();
        store.getChips().eat();
    }
}

