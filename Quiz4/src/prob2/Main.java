package prob2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(2, new Person("David", "SSN1", 18)));
		students.add(new Student(4, new Person("Bakhodir", "SSN2", 15)));
		students.add(new Student(6, new Person("Behailu", "SSN3", 21)));
		
		List<Integer> ids = new ArrayList<Integer>();
		ids.add(2);
		ids.add(0);
		ids.add(6);
		ids.add(5);
		
		List<Student> filtered = myFunction1(students, ids);
		
		System.out.println(filtered);
		System.out.println(myFunction2(students));
		System.out.println(myFunction3(students));
		
		List<Person> underAge = myFunction4(students);
		
		System.out.println(underAge);
	}

	private static List<Person> myFunction4(List<Student> students) {
		return students
				.stream()
				.filter(student -> student.age >= 18)
				.map(student -> student.person)
				.collect(Collectors.toList());
	}

	private static List<Student> myFunction1(List<Student> students, List<Integer> ids) {
		return students
			.stream()
			.filter(student -> ids.contains(student.id))
			.collect(Collectors.toList());
	}
	
	private static String myFunction2(List<Student> students) {
		return students.stream()
				.filter(student -> student.id < 10)
				.map(student -> student.name)
				.collect(Collectors.joining(","));
	}
	
	private static Student myFunction3(List<Student> students) {
		return students.stream()
				.reduce(null, (before, after) -> before == null ? after : (after.id > before.id ? after : before));
	}
	
}
