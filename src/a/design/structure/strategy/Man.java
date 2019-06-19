/*
 * a_design_structure.strategy Man
 * @author GuoBin211 on 2019-06-01 10:30
 */
package a.design.structure.strategy;

class Man implements IStrategy {
    Man() {
    }

    @Override
    public void getStrategy() {
        System.out.println("Man回答的策略是：摩托车");
    }
}

