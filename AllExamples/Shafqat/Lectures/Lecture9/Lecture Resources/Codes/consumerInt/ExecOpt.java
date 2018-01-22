package lesson9.lecture.consumerInt;

import java.util.stream.Stream;

public class ExecOpt {

	public static void main(String[] args) {
		/*Sorting is a special kind of intermediate operation. It's a so called stateful operation 
		 * since in order to sort a collection of elements you have to maintain state during ordering.
		 */
		Stream.of("d2", "a2", "b1", "b3", "c")
	    .sorted((s1, s2) -> {
	        System.out.printf("sort: %s; %s\n", s1, s2);
	        return s1.compareTo(s2);
	    })
	    .filter(s -> {
	        System.out.println("filter: " + s);
	        return s.startsWith("a");
	    })
	    .map(s -> {
	        System.out.println("map: " + s);
	        return s.toUpperCase();
	    })
	    .forEach(s -> System.out.println("forEach: " + s));
	}

}
