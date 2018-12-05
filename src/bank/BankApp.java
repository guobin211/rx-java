package bank;

/**
 * bank app
 *
 * @author guobin
 */
public class BankApp {
    /**
     * main
     *
     * @param args string[]
     */
    public static void main(String[] args) {
        BankAccount bal = new BankAccount(100.00);
        System.out.print("START==========");
        bal.display();
        bal.deposit(30.1);
        bal.display();
        bal.withdraw(20);
        bal.display();
    }
}
