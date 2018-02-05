package prob2;

public class Person {
	
	String name;
	String SSN;
	int age;

	public Person(String name, String SSN, int age) {
		this.name = name;
		this.SSN = SSN;
		this.age = age;
	}
	
	public String toString() {
		return name;
	}

}
