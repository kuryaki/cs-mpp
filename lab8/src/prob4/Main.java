package prob4;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<String> words = new ArrayList<String>() {{
			add("hola");
			add("chao");
			add("helo");
			add("halo");
			add("hmmm");
			add("ahmm");
			add("okok");
		}};
		
		char c = 'l';
		char d = 'd';
		int len = 4;
		
		long count = countWords(words, c, d, len);
		
		System.out.println(count);
	}
	
	private static int countWords(List<String> words, char c, char d, int len) {
		return (int) words
				.stream()
				.filter(w -> w.indexOf(c) > 0)
				.filter(w -> w.indexOf(d) < 0)
				.filter(w -> w.length() == len)
				.count();
	}

}
