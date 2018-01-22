package lesson9.lecture.consumerInt;

import java.util.stream.Stream;

public class ExecOrder {
	public static void main(String[] args) 
	{
		/*Now, map is only called once so the operation pipeline performs much faster for
		 *  larger numbers of input elements. Keep that in mind when composing complex method chains.
		 */
		Stream.of("d2", "a2", "b1", "b3", "c")
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
