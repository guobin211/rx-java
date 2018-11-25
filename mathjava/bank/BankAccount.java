package bank;

/**
 * BankAccount 类
 */
class BankAccount {
    boolean b;
    byte b2;
    char c;
    short s;
    int i;
    long l;
    float f;
    double d;
    private double balance;

    /**
     * 构造函数
     *
     * @param openingBalance 开户
     */
    public BankAccount(double openingBalance) {
        balance = openingBalance;
    }

    /**
     * 存款
     *
     * @param amount 数量
     */
    public void deposit(double amount) {
        balance = balance + amount;
    }

    /**
     * 取款
     *
     * @param amount 数量
     */
    public void withdraw(double amount) {
        balance = balance - amount;
    }

    /**
     * 查看账户信息
     */
    public void display() {
        System.out.println("balance=" + balance);
    }
}
