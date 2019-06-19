/*
 * a_design_structure.strategy AskPerson
 * @author GuoBin211 on 2019-06-01 10:33
 */
package a.design.structure.strategy;

class AskPerson {
    private IStrategy strategy;
    AskPerson(IStrategy strategy) {
        this.strategy = strategy;
    }
    void askPeople() {
        // 问问题获得回答
        System.out.println("AskPerson 问策略");
        strategy.getStrategy();
    }
}

