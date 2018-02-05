package prob7.mystream_lab;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MyStream<T> {
	
	private List<T> elements;
	
	public static <T> MyStream<T> of(List<T> aList) {
		MyStream<T> stream = new MyStream<T>(aList);
		return stream;
	}
	private MyStream(List<T> aList) {
		this.elements = aList;
	}
	
	public static <S> MyStream<S> concat(MyStream<S> s1, MyStream<S> s2) {
		MyStream<S> stream = new MyStream<>(s1.elements);
		
		stream.elements.addAll(s2.elements);
		return stream;
	}
	
	public <R> MyStream<R> flatMap(Function<T, MyStream<R>> mapper) {
		List<R> myList = new ArrayList<>();
		
		for(T e: this.elements) {
			MyStream<R> applied = mapper.apply(e);
			
			for(R f: applied.elements) {
				myList.add(f);
			}
			
		}
		
		return new MyStream<R>(myList);
	}
	
	public List<T> asList() {
		return this.elements;
	}
	
	public <R> MyStream<R> map(Function<T,R> mapper) {
		List<R> myList = new ArrayList<>();
		
		for(T e: this.elements) {
			R applied = mapper.apply(e);
			myList.add(applied);
		}
		
		return new MyStream<R>(myList);
	}
	
	public MyStream<T> filter(Predicate<T> predicate) {
		List<T> myList = new ArrayList<>();
		
		for(T e: this.elements) {
			if(predicate.test(e)) {
				myList.add(e);
			}
		}
		
		return new MyStream<T>(myList);
	}
}
