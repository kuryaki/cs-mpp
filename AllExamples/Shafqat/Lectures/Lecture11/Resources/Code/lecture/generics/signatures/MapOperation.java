package lesson11.lecture.generics.signatures;
import java.util.*;
import java.util.stream.Collectors;

//Stream<R> map(Function<? super T,? extends R> mapper)

public class MapOperation {
	public static void main(String[] args) {
		List<Double> someDoubles = Arrays.asList(2.3, 3.5, 6.8);
		List<String> words = Arrays.asList("dog", "elephant", "peacock");
		List<Manager> mans = Arrays.asList(
				new Manager("John", 100000, 2000, 10, 15),
				new Manager("Steve", 120000, 1998, 2, 17));
		List<Number> numbers =
				//here, type R is Number and word.length() is of type Integer
				words.stream().map(word -> word.length())
				              .collect(Collectors.toList());
		numbers.addAll(someDoubles);
		        //here, type T is Manager, and Employee is supertype
		numbers.addAll(mans.stream().map((Employee e) -> e.getSalary())
				           .collect(Collectors.toList()));
		System.out.println(numbers);
	}
}
