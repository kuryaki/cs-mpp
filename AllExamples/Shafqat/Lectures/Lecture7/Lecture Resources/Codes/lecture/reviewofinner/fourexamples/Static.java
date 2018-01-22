package lesson7.lecture.reviewofinner.fourexamples;

public class Static {
	private String name = "Joe";
	private Pair p = new Pair();
	
	{
		p.first = 4;
		p.second = 5;
		System.out.println(p);
		
	}	
	private  void printHello() {
		System.out.println("Hello" + name);
	}
	static class Pair {
		static int first;
		int second;
		Pair() {
			//no access
			//printHello();
		}
		public String toString() {
			return "(" + first + ", " + second+ ")";
		}		
	}
	public static void main(String[] args) {
		(new Static()).printHello();
		Pair.first = 1;
	}
}
