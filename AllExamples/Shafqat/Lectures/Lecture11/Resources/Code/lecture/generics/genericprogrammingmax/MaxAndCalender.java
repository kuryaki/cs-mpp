package lesson11.lecture.generics.genericprogrammingmax;

import java.time.LocalDate;
import java.util.*;

public class MaxAndCalender {
	public static <T extends Comparable<T>> T max(List<T> list) {
		T max = list.get(0);
		for(T i : list) {  
			if(i.compareTo(max) > 0) {
				max = i;
			}
		}
		return max;
	}
	

	//error because LocalDate does not implement Comparable<LocalDate>
	//
	public static void main(String[] args) {
		List<LocalDate> dates = new ArrayList<>();
		dates.add(LocalDate.of(2011, 1, 1));
		dates.add(LocalDate.of(2014, 2, 5));
		//LocalDate mostRecent = max(dates); //compiler error
		LocalDate mostRecent = max2(dates); 
		System.out.println(mostRecent);
	}
	
	//fix by expanding the range of type arguments for Comparable, like this:
	public static <T extends Comparable<? super T>> T max2(List<T> list) {
		T max = list.get(0);
		for(T i : list) {  
			if(i.compareTo(max) > 0) {
				max = i;
			}
		}
		return max;
	}
}
