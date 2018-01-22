package lesson1.lecture.ooexample.employeeinfo;

public class CheckingAccount extends Account {
	private final double MONTHLY_SERVICE_CHARGE = 5.00;

	CheckingAccount(Employee e,  double startBalance){
		super(e,startBalance);
	}
	CheckingAccount(Employee e){
		super(e);
	}
	
	public double getBalance() {
		double baseBalance = super.getBalance();
		return baseBalance - MONTHLY_SERVICE_CHARGE;
	}
	public AccountType getAcctType(){
		return AccountType.CHECKING;
	}

}
