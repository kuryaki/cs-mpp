package prob1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> ints = new ArrayList<>();
		ints.add(1);
		ints.add(2);
		
		// A.
		List<Number> nums = ints; // Cannot convert List<Integer> to List<Number>
		nums.add(3.14);
		
		// B.
		List<? extends Number> nums2 = ints;
		nums2.add(3.14); // List<Integer> cannot add double

	}

}
