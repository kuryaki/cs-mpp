import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		
		MyNumber myNumber = new MyNumber();
		
		myNumber.setFirst(5);
		myNumber.setSecond(5);
		
		
		String x = "hola";
		
//		System.out.println(x::toLowerCase);
		
		x.toLowerCase();
		
//		Function<MyNumber, Integer> mult = MyNumber::multiply;
//		
//		System.out.println();
		
//		myNumber.sum().a
		
//		System.out.println(myNumber::sum);
		
//		int substractResult = myNumber.substract();
//		int multiplyResult = myNumber.multiply();
//		int divideResult = myNumber.divide();
		
//		System.out.println(myNumber::divide);
//		
//		Function<MyNumber, Integer> compute = new Function<MyNumber, Integer>() {
//
//			@Override
//			public Integer apply(MyNumber t) {
//				return t.sum();
//			}
//		};
//		
//		System.out.println(myNumber::sum);
//		
//		System.out.println(myNumber.getFirst() + " + " +  myNumber.getSecond() + " = "+ sumResult);
//		System.out.println(myNumber.getFirst() + " - " +  myNumber.getSecond() + " = "+ substractResult);
//		System.out.println(myNumber.getFirst() + " * " +  myNumber.getSecond() + " = "+ multiplyResult);
//		System.out.println(myNumber.getFirst() + " / " +  myNumber.getSecond() + " = "+ divideResult);
//		
//		List<Student> students = new ArrayList<Student>();
//		students.add(new Student("David"));
//		students.add(new Student("Bakhodir"));
//		students.add(new Student("Behailu"));
//		students.add(new Student("XiuBao"));
		
//		students.sort(new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				
//				return o1.name.compareTo(o2.name);
//			}
//		});
		
//		students.sort((Student o1, Student o2) -> o1.name.compareTo(o2.name));
//		
//		students.forEach((s) -> System.out.println(s.name.toUpperCase()));
		
//		BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a*b; 
//		System.out.println(multiply.apply(4, 5));
		
//		String a = "hola";
//		a.toUpperCase();

	}

}
