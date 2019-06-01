/*
 * a_design_structure.strategy Women
 * @author GuoBin211 on 2019-06-01 10:29
 */
package a_design_structure.strategy;

class Women implements IStrategy {
    Women() {
    }

    @Override
    public void getStrategy() {
        System.out.println("Women回答的策略是: 自行车");
    }
}

