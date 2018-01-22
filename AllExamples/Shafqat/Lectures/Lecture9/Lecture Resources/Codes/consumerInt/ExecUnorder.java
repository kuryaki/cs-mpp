package lesson9.lecture.consumerInt;

import java.util.stream.Stream;

public class ExecUnorder {

	public static void main(String[] args) 
	{
		/*As you might have guessed both map and filter are called five times for every string in the
		 *  underlying collection whereas forEach is only called once.
		 */
		
		Stream.of("d2", "a2", "b1", "b3", "c")
	    .map(s -> {
	        System.out.println("map: " + s);
	        return s.toUpperCase();
	    })
	    .filter(s -> {
	        System.out.println("filter: " + s);
	        return s.startsWith("A");
	    })
	    .forEach(s -> System.out.println("forEach: " + s));

	}

}
