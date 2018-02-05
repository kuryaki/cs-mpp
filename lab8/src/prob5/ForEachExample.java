package prob5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;


public class ForEachExample {
	
	
	private static Consumer<? super String> myConsumer = new Consumer<String>() {

		@Override
		public void accept(String t) {
			System.out.println(t.toUpperCase());
		}
	};

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		
		list.forEach(myConsumer);
		list.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t.toUpperCase());
			}
		});
		list.forEach(t -> System.out.println(t.toUpperCase()));
		list.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);
		
	}
	
	
}