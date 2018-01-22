package lesson9.lecture.consumerInt;

import java.util.stream.Stream;

public class StreamBasic {
	public static void main(String[] args)
	{
	 Stream.of("d2", "a2", "b1", "b3", "c")
     .filter(s -> {
    	 			System.out.println("filter: " + s);
    	 			return true;
      			  }).forEach(s -> System.out.println("forEach: " + s));
	}
	
}
