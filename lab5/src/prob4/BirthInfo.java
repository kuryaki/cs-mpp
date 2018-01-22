package prob4;

import java.time.LocalDate;

public final class BirthInfo {
	private final LocalDate dateOfBirth;	
	
	BirthInfo(LocalDate dob) {
		dateOfBirth = dob;
	}
	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
}
