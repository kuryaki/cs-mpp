package lesson9.lecture.constructorref;

import java.util.*;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GenericArray {
	public static void main(String[] args) {
		List<String> strings 
		  = Arrays.asList("Eleven", "strikes", "the", "clock");
		String[] stringArr 
		  = strings.stream().toArray(String[]::new);
		System.out.println(Arrays.toString(stringArr));	
		//can accomplish same thing less efficiently like this
		stringArr = myToArray(strings.stream(), String[]::new);
		System.out.println(Arrays.toString(stringArr));
	}
	
	//This could be improved -- but how?
	public static String[] myToArray(Stream<String> stream, IntFunction<String[]> f) {
		Object[] obArr = stream.toArray();
		String[] retVal =  f.apply(obArr.length);
		System.arraycopy(obArr, 0, retVal, 0, obArr.length);
		return retVal;
	}
}
