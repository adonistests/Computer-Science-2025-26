
public class CheckingAccount extends BankAccount {
	public final static double FEE = 0.15;
	
	
	public CheckingAccount(String name, double initialAmount) {
		super(name, initialAmount);
		setAccountNumber(getAccountNumber() + "-10");
	}
	
	@Override
	public boolean withdraw(double amount) {
		double totalAmount = amount + FEE;
		return super.withdraw(totalAmount);
	}
	
	
}
