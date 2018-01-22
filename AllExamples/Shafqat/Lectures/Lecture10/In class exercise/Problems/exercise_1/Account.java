package lesson10.exercise_1;

public class Account {
	
	private String id;
	private Customer customer;
	Account(double newBalance, Customer c) {
		balance = newBalance;
		customer = c;
		id = "" + (currentAcctNumber);
		currentAcctNumber += 2;
		if(currentAcctNumber == 108) currentAcctNumber = 105;
	}
	private double balance = 0.0;
	
	public void updateBalance(double amount) {
		balance += amount;
	}
	public double getBalance() {
		return balance;
	}
	
	public String getId() {
		return id;
	}
	public Customer getCustomer(){
		return customer;
	}
	
	
	@Override
	public String toString() {
		return id;
	}
	
	
	public static int currentAcctNumber = 100;
}
