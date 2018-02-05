package part1.prob1;

import java.util.function.Function;

public class Pair<S, T, V> {

	private Function<S, T> first;
	private Function<S, V> second;
	
	public Pair(Function<S, T> first, Function<S, V> second){
		this.first = first;
		this.second = second;
	}

	public Function<S, T> getFirst() {
		return first;
	}

	public Function<S, V> getSecond() {
		return second;
	}

}
