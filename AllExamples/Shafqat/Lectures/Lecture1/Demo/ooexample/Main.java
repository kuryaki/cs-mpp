package lesson1.lecture.ooexample;
import java.util.Scanner;

import lesson1.lecture.ooexample.employeeinfo.*;

public class Main {

	Employee[] emps;
	
	public static void main(String[] args) {
		new Main();
	}
	Main(){
		emps = new Employee[3];
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2,13);
		
		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);
		
		String n = System.getProperty("line.separator");
		String choices ="  A. See a report of all accounts." + n +
						"  B. Make a deposit." + n +
						"  C. Make a withdrawal." + n +
						"Make a selection (A/B/C): ";
		Scanner sc = new Scanner(System.in);
		System.out.print(choices);
		String ch = sc.next();
		System.out.println();
		if(ch.equals("A")){
			handleReports();
		}
		else if(ch.equals("B")) { //"B"
			handleDeposits();
		}
		else { //"C"
			handleWithdrawals();
		}
	}
	void handleReports() {
		System.out.println(getAllAccounts());
	}
	
	void handleDeposits() {
		String n = System.getProperty("line.separator");
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < emps.length; ++i){
			System.out.println(""+i+". "+emps[i].getName());
		}
		System.out.print("Select an employee: (type a number)");
		int empChoice = sc.nextInt();
		System.out.println();
		Employee e = emps[empChoice];
		MyStringList list = e.getNamesOfAccounts();
		for(int i = 0; i < list.size(); ++i){
			String name = list.get(i);
			System.out.println(""+i+". "+name);
		}
		System.out.print("Select an account: (type a number)");
		
		int accountIndex = sc.nextInt();
		System.out.println();
		String name = list.get(accountIndex);
		
		System.out.print("Deposit amount: ");
		
		double amount = sc.nextDouble();
		System.out.println();
		e.deposit(accountIndex, amount);
		System.out.println();
		System.out.println("$"+amount+
				" has been deposited in the "+n+name+" account of "+ emps[empChoice].getName());
		
		
	}
	void handleWithdrawals() {
		String n = System.getProperty("line.separator");
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < emps.length; ++i){
			System.out.println(""+i+". "+emps[i].getName());
		}
		System.out.print("Select an employee: (type a number)");
		
		int empChoice = sc.nextInt();
		System.out.println();
		
		Employee e = emps[empChoice];
		MyStringList list = e.getNamesOfAccounts();
		for(int i = 0; i < list.size(); ++i){
			String name = list.get(i);
			System.out.println(""+i+". "+name);
		}
		System.out.print("Select an account: (type a number)");
		
		int accountIndex = sc.nextInt();
		System.out.println();
		String name = list.get(accountIndex);
		
		System.out.print("Withdrawal amount: ");
		
		double amount = sc.nextDouble();
		System.out.println();
		boolean ok=e.withdraw(accountIndex, amount);
		System.out.println();
		if(ok){
			System.out.println("$"+amount+
				" has been withdrawn from the "+n+name+" account of "+ emps[empChoice].getName());
		}
		else {
			System.out.println("Amount $"+amount+" exceeds the current balance of the "+n+name+
					" account of "+emps[empChoice].getName());
		}
		
		
	}	
	

	String getAllAccounts(){
		String retVal = "";
		String n = System.getProperty("line.separator");
		for(Employee emp : emps){
			retVal += emp.getFormattedAccountInfo();
			retVal += n;
		}
		return retVal;
	}

}
