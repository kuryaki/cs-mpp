package probE;

import java.util.*;

public class Employee {
	private String name;
	private List<Account> accounts = new ArrayList<>();
	
	public Employee(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void addAccount(Account acct)  {
		accounts.add(acct);
	}
	
	
	public double computeUpdatedBalanceSum() {
		double sum = 0.0;
		for(Account a : accounts) {
			sum += a.computeUpdatedBalance();
		}
		return sum;
	}
	
}
