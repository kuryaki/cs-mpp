package probC;

public class Salaried extends Employee {

	double salary;
	
	@Override
	double calcGrossPay(int month, int year) {
		return this.calcCompensation(month, year).getNetPay(salary);
	}

}
