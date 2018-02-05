package experiments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> numbers = Stream.generate(Math::random)
				.map(n->n*10)
				.map(n->n+1)
				.map(Double::intValue)
				.limit(3)
				.collect(Collectors.toList());
//		
//		System.out.println(numbers);
		
		
		
		List<Student> studentList = new ArrayList<Student>();
		
		studentList.add(new Student("David", 3.5));
		studentList.add(new Student("Xiubao", 4.6));
		studentList.add(new Student("Behailu", 3.8));
		studentList.add(new Student("Bakhodir", 4.1));
		
		Function<Student, String> byName = student -> student.getName();
		Function<Student, Double> byGpa = student -> student.getGpa();
		
		List<String> names = studentList.stream()
//			.filter(student -> student.getName().length() > 5)
//			.sorted)
			.map(student -> student.getName())
			.collect(Collectors.toList());

		System.out.println(names);
		
//		List<Integer> ints = Arrays.asList(3,5,2,3,8);
//		List<int[]> intArrs = ints.stream()
//								.map(int[]::new)
//								.collect(Collectors.toList());
//		
//		List<String> strings = intArrs.stream()
//								.map(Arrays::toString)
//								.collect(Collectors.toList());
//		
//		System.out.println(strings);
		
		

	}

}
