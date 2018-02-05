package prob5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Hola");
		list.add("Mundo");
		list.add("!!");
		
		Object result = secondSmallest(list);
		System.out.println(result);
	}

	public static <T> T secondSmallest(List<T> elements) {
		return elements.stream().sorted().collect(Collectors.toList()).get(1);
	}
}
