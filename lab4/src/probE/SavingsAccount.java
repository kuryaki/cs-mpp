package probE;

public class SavingsAccount extends Account {
	private String acctId;
	private double interestRate;
	private double balance;
	
	public SavingsAccount(String accountId, double interestRate, double balance) {
		this.acctId = accountId;
		this.interestRate = interestRate;
		this.balance = balance;
	}
	
	@Override
	public String getAcctID() {
		return acctId;
	}

	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public double computeUpdatedBalance() {
		return balance + (interestRate * balance);
	}

	
}
