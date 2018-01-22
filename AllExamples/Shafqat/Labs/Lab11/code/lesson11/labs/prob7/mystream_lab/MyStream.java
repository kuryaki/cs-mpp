package lesson11.labs.prob7.mystream_lab;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MyStream<T> {
	private List<T> elements;
	public static <T> MyStream<T> of(List<T> aList) {
		//implement
		return null;
	}
	private MyStream(List<T> aList) {
		//implement
	}
	
	public static <S> MyStream<S> concat(MyStream<S> s1, MyStream<S> s2) {
		//implement
		return null;
	}
	
	public <R> MyStream<R> flatMap(Function<T, MyStream<R>> mapper) {
		//implement
		return null;
	}
	
	public List<T> asList() {
		//implement
		return null;
	}
	
	public <R> MyStream<R> map(Function<T,R> mapper) {
		//implement
		return null;
	}
	
	public MyStream<T> filter(Predicate<T> predicate) {
		//implement
		return null;
	}
}
