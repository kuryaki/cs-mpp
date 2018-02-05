package part1.prob1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;

public class EmployeeInfoSolution {
	
	
	static Function<Employee, String> byName = e -> e.getName();
	static Function<Employee, Integer> bySalary = e -> -e.getSalary();


	public void sort(List<Employee> emps, Pair methods) {
		Collections.sort(emps, Comparator.comparing(methods.getFirst()).thenComparing(methods.getSecond()));
	}
	
	
	
	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Rick", 50000));
		emps.add(new Employee("Andy", 60000));
		emps.add(new Employee("Tim", 10000));
		EmployeeInfoSolution ei = new EmployeeInfoSolution();
		ei.sort(emps, new Pair<>(byName, bySalary));
		System.out.println(emps);
		//same instance
		ei.sort(emps, new Pair<>(bySalary, byName));
//		ei.sort(emps, EmployeeInfoSolution.SortMethod.BYSALARY);
		System.out.println(emps);
	}
}
