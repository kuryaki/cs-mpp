package lesson3.lecture.inheritance4;

public class ClassA extends ClassB{
	public void setName(String name) {
		if(name == null || name.trim().equals("")) {
			throw new IllegalArgumentException("Illegal name input");
		}
		super.setName(name);
	}
}
