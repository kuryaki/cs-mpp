package experiments;

public class Student {
	
	String name;
	double gpa;
	
	public Student(String name) {
		this.name = name;
	}

	public Student(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}
	
	public double getGpa() {
		return gpa;
	}

}
