package prob1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import prob2.Student;

public class Main {

	public static void main(String[] args) {
		Integer[] integers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		int[] odds = myFunction(integers);
		
		for(int i: odds) {
			System.out.println(i);
		}
		
		List<Integer> ids = new ArrayList<Integer>();
		
		ids.addAll(Arrays.asList(integers));
		
		ids.forEach(System.out::println);
		
		Integer[] array = ids.toArray(new Integer[ids.size()]);
//		
//		HashMap<Integer, Student> studentMap = new HashMap<Integer, Student>();
//		List<Integer> result = myFunction2(studentMap, ids);
//		List<Student> students = new ArrayList<Student>();
//		Map<Integer, Student> myRes = myFunction6(students, ids);
		
	}
	
	
	private static HashMap<Integer, Student> myFunction6(List<Student> students, List<Integer> ids) {
		return new HashMap<Integer, Student>(students.stream()
				.filter(student -> ids.contains(student.getId()))
				.collect(Collectors.toMap(Student::getId, Function.identity())));
	}


	private static List<Integer> myFunction2(HashMap<Integer, Student> studentMap, List<Integer> ids) {
		return studentMap
				.values()
				.stream()
				.filter(student -> ids.contains(student.getId()))
				.map(student -> student.getId())
				.collect(Collectors.toList());
	}
	
	

	static int[] myFunction(Integer[] integers) {
		
		return Stream
				.of(integers)
				.filter(I -> I%2 == 0)
				.mapToInt(Integer::intValue)
				.toArray();
	}

}
