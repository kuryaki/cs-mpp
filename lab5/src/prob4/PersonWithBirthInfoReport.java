package prob4;

import java.time.LocalDate;

public class PersonWithBirthInfoReport {
	
	private PersonWithBirthInfoReport() {}
	
	public static PersonWithBirthInfo createPersonWithBirthInfo(String name, LocalDate dob) {
		BirthInfo bi = new BirthInfo(dob);
		return new PersonWithBirthInfoImpl(new Person(name, bi), bi);
	}

}
