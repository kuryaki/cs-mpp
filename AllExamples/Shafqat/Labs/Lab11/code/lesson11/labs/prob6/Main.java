package lesson11.labs.prob6;
import java.util.*;
import java.util.function.*;
public class Main {
	public static boolean contains1(List<String> list, String s) {
		//could return list.contains(s), but this does not generalize
		for(String x: list) {
			if(x == null && s == null) return true;
			if(s == null || x == null) return false;
			if(x.equals(s)) return true;
		}
		return false;
		
	}
	
	public static void test1() {
		List<String> list = Arrays.asList("Bob", "Joe", "Tom");
		boolean result = Main.contains1(list, "Tom");
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		test1();
	}	
		
		
	
}
