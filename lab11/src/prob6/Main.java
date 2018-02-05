package prob6;

import java.util.*;
import java.util.function.*;

public class Main {
	
	public static boolean contains1(List<String> list, String s) {
		// could return list.contains(s), but this does not generalize
		for (String x : list) {
			if (x == null && s == null)
				return true;
			if (s == null || x == null)
				return false;
			if (x.equals(s))
				return true;
		}
		return false;

	}
	
	public static <T> boolean contains2(List<? extends T> list, T e, BiPredicate<? super T, ? super T> pred2) {
		
		for(T emp: list) {
			if(emp == null & e == null) return true;
			if(emp == null || e == null) return false;
			if(pred2.test(emp, e)) return true;
		}
		return false;
	};

	public static void test1() {
		List<String> list = Arrays.asList("Bob", "Joe", "Tom");
		boolean result = Main.contains1(list, "Tom");
		System.out.println(result);
	}
	
	public static void test2() {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1003, "Tom", 60000));
		list.add(new Employee(1002, "Harry", 70000));
		list.add(new Employee(1001, "Joe", 50000));
		
		Employee e = new Employee(1001, "Joe", 5000);
		
		boolean foundIt = Main.contains2(list, e, (Employee e1, Employee e2) -> e1.getId() == e2.getId());
		System.out.print(foundIt);
	}
	
	public static void test3() {
		List<Manager> list = new ArrayList<>();
		list.add(new Manager(1003, "Tom", 60000, 700));
		list.add(new Manager(1002, "Harry", 70000, 400));
		list.add(new Manager(1001, "Joe", 50000, 500));
		
		Manager e = new Manager(1001, "Joe", 5000, 500);
		
		boolean foundIt = Main.contains2(list, e, (Employee e1, Employee e2) -> e1.getId() == e2.getId());
		System.out.print(foundIt);
	}
	
	public static void test4() {
		List<Manager> list = new ArrayList<>();
		list.add(new Manager(1003, "Tom", 60000, 700));
		list.add(new Manager(1002, "Harry", 70000, 400));
		list.add(new Manager(1001, "Joe", 50000, 500));
		
		Manager m = new Manager(1001, "Joe", 5000, 500);
		
		boolean foundIt = Main.contains2(list, m, (Employee e, Person p) -> e.getName().equals(p.getName()));
		System.out.print(foundIt);
	}
	
	public static void test5() {
		List<CheckingAccount> list = new ArrayList<>();
		list.add(new CheckingAccount(1003, 25.00));
		list.add(new CheckingAccount(1002, 35.00));
		list.add(new CheckingAccount(1001, 125.00));
		
		Account e = new CheckingAccount(1002, 35.00);
		
		boolean foundIt = Main.contains2(list, e, (Account e1, Account e2) -> e1.getAcctId() == e2.getAcctId());
		System.out.print(foundIt);
	}
	
	

	public static void main(String[] args) {
		test1();
		test2();
	}

}
