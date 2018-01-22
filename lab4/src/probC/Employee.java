package probC;

public abstract class Employee {
	
	int empId;
	
	void print() {
		
	}
	
	Paycheck calcCompensation(int month, int year) {
		return new Paycheck();
	}
	
	abstract double calcGrossPay(int month, int year);

}
