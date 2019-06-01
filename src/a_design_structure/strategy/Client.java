/*
 * a_design_structure.strategy Client
 * @author GuoBin211 on 2019-06-01 10:27
 */
package a_design_structure.strategy;

public class Client {
    public static void main(String[] args) {
        System.out.println("策略模式");
        IStrategy someMan = new Women();
        AskPerson askPerson = new AskPerson(someMan);
        askPerson.askPeople();
        // 轻松替换
        someMan = new Man();
        askPerson = new AskPerson(someMan);
        askPerson.askPeople();
    }
}

