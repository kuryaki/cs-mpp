package prob6.launch;

public class SavingsAccount implements Account {
	
	String id;
	double interest;
	double balance;
	
	
	
	public SavingsAccount(String id, double interest, double balance) {
		super();
		this.id = id;
		this.interest = interest;
		this.balance = balance;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getInterest() {
		return interest;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

}
