package lesson1.lecture.objectdemo;

public class Main {

	public static void main(String[] args) {
		Customer cust = new Customer("Bob");
		cust.createNewAccount();
		cust.makeDeposit(5000);
		cust.makeWithDrawal(1250);
		String id = cust.readCheckingAccountId();
		double bal = cust.checkBalance();
		System.out.println(cust.getName() + "'s ID: " + id +
				"\n"+cust.getName() + "'s balance: " + bal);

	}

}
