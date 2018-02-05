package prob6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Union {
	//IMPLEMENT
	public static Set<String> union(List<Set<String>> sets){
		Set<String> acum = new HashSet<String>();
		return sets.stream().reduce(acum, (a, set) -> {
			a.addAll(set);
			return a;
		});
	}

	public static void testUnion() {
		List<Set<String>> mainList = new ArrayList<>();
		Set<String> set = new HashSet<String>();
		set.add("A");
		set.add("B");
		Set<String> set1 = new HashSet<String>();
		set1.add("D");
		Set<String> set2 = new HashSet<String>();
		set.add("1");
		set.add("3");
		set.add("5");
		mainList.add(set);
		mainList.add(set1);
		mainList.add(set2);
		System.out.println(union(mainList));
	}
	public static void main(String[] args) {
		testUnion();
	}
}
