package prob7.mystream_lab;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class TestFlatMap {

	public static void main(String[] args) {
		System.out.println("Flattening a stream of character streams");
		List<String> list = Arrays.asList("Joe", "Tom", "Abe");
		MyStream<Character> result 
		    = MyStream.of(list).flatMap(s -> characterStream(s));
		System.out.println(result.asList());
		
	}
	
	public static MyStream<Character> characterStream(String s) {
		List<Character> result = new ArrayList<>();
		for (char c : s.toCharArray()) result.add(c);
		return MyStream.of(result);
	}
	
	

}
