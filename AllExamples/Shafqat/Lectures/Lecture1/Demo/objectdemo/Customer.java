package lesson1.lecture.objectdemo;

public class Customer {
	private String name;
	private Account checkingAccount;
	
	public Customer(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void createNewAccount() {
		checkingAccount = new Account();
	}
	
	public void makeDeposit(double amount) {
		checkingAccount.updateBalance(amount);
	}
	public void makeWithDrawal(double amount) {
		checkingAccount.updateBalance(-amount);
	}
	public double checkBalance() {
		return checkingAccount.getBalance();
	}
	
	public String readCheckingAccountId() {
		return checkingAccount.getId();
	}
}
