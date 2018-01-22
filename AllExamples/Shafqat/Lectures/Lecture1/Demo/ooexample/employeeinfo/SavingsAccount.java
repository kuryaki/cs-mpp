package lesson1.lecture.ooexample.employeeinfo;

public class SavingsAccount extends Account {
	private final double MONTHLY_INTEREST_RATE = 0.25;
	SavingsAccount(Employee e, double startBalance){
		super(e,startBalance);
	}
	SavingsAccount(Employee e){
		super(e);
	}
	
	public double getBalance() {
		double baseBalance = super.getBalance();
		double interest = (MONTHLY_INTEREST_RATE/100)*baseBalance;
		return baseBalance + interest;
	}
	public AccountType getAcctType(){
		return AccountType.SAVINGS;
	}

}
