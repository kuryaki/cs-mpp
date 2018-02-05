package prob2;

public class Student {
	
	int id;
	int age;
	String name;
	Person person;

	public Student(int id, Person person) {
		this.id = id;
		this.name = person.name;
		this.age = person.age;
		this.person = person;
	}
	
	public String toString() {
		return "->"+id;
	}

	public int getId() {
		return id;
	}

}
