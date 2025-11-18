

public class SavingsAccount extends BankAccount {
    public final static double RATE = 0.025;
    private String accountNumber;
    private int savingsNumber = 0;

    public SavingsAccount(String name, double initialBalance) {
        super(name, initialBalance);
        this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }

    public void postInterest() {
        double interest = getBalance() * (RATE / 12);
        deposit(interest);
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    public SavingsAccount(SavingsAccount original, double initialBalance) {
        super(original, initialBalance);
        this.savingsNumber = original.savingsNumber + 1;
        this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }
}
