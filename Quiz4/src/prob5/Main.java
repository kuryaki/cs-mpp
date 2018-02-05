package prob5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Integer[] myArr = {1,2,3};
		List<Integer> ints = Arrays.asList(myArr);
		
		
		List<? super Number> elements = new ArrayList<>();
		
//		elements.add(1);
//		elements.add(2.3);
		elements.addAll(ints);
		elements.get(0);
//		
//		List<? extends Number> elements1 = new ArrayList<>();
//		
//		elements1.add(3);
//		elements1.add(4);
//		elements1.add(3.4);
//		elements.addAll(ints);
//		elements.get(0);
//		
//		List<? super Number> elements2 = new ArrayList<>();
//		
//		elements2.add(3);
//		elements2.add(4);
//		elements2.add(3.4);
//		elements.addAll(ints);
//		elements.get(0);
//		
//		
//		boolean found = findElement(elements, 3);
//		
//		boolean found1 = findElement(elements1, 3);
//		
//		boolean found2 = findElement(elements2, 3);
//		
	}


	private static <E extends Number> boolean findElement(List<E> elements, E element) {
		System.out.println(element.intValue());
		return elements.contains(element);
	}

}
