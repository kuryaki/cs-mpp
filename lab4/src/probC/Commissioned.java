package probC;

import java.util.List;

public class Commissioned extends Employee {
	
	double commission;
	double baseSalary;
	List<Order> orderList;

	
	@Override
	double calcGrossPay(int month, int year) {
		double compensation = baseSalary;
		
		for(Order order : orderList) {
			compensation += order.orderAmount * (1 - commission);
		}

		return this.calcCompensation(month, year).getNetPay(compensation);
	}

}
