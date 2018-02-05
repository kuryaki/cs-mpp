package prob4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {


	private static Collection<? extends Number> nums;

	public static void main(String[] args) {
		
		// A. 
		List<Integer> ints = new ArrayList<>();
		ints.add(1);
		ints.add(2);
		List<? extends Number> nums = ints;
		double dbl = sum(nums);
//		nums.add(3.14); // Error cannot add double to list of ints
		
		// B.
		List<Object> objs = new ArrayList<>();
		objs.add(1);
		objs.add("two");
		List<? super Integer> ints2 = objs;
		ints.add(3);
//		double dbl2 = sum(ints2); // Error sum cannot receive subtype

	}

	public static double sum(Collection<? extends Number> nums) {
		Main.nums = nums;
		double s = 0.0;
		for(Number num : nums) s += num.doubleValue();
		return s;
	}

}
