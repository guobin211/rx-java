package bank;

public class NewBankApp {
    public static void main(String[] args) {
        System.out.print("new bank app start");
        BankAccount bankAccount = new BankAccount(111.22);
        bankAccount.display();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
