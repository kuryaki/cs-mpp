package probC;

public class Hourly extends Employee {
	
	double hourlyWage;
	int hoursPerWeek;

	@Override
	double calcGrossPay(int month, int year) {
		return this.calcCompensation(month, year).getNetPay(hourlyWage * hoursPerWeek * 4);
	}

}
