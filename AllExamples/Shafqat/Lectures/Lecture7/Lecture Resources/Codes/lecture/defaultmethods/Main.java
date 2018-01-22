package lesson7.lecture.defaultmethods;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		MinimalPerson person1 = new MinimalPerson("Joe", "Stevens", "101 Adams",
				"Fairfield", "IA");
		PersonInDetail person2 = new PersonInDetail("Jim", "Thomas", "Radcliffe",
				new Address("17 Jones Pl.", "Apt. 2E", "New York", "NY", "01215"));
		
		List<NameAddress> directory = new ArrayList<>();
		directory.add(person1);
		directory.add(person2);
		print(directory);
	}
	private static void print(List<NameAddress> list) {
		for(NameAddress na : list) {
			System.out.println(na.formattedOutput() + "\n" + "===============");
		}
	}
	
}
