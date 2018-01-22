package prob4;

public final class Person {
	private final String name;
	private final BirthInfo birthInfo;
	
	Person(String name, BirthInfo birthInfo) {
		this.name = name;
		this.birthInfo =  birthInfo;
	}
	
	public String getName() {
		return name;
	}
	
	public BirthInfo getBirthInfo() {
		return birthInfo;
	}
	
}
