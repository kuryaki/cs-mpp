package lesson7.lecture.defaultmethods;

public interface NameAddress {
	String getFirstName();
	String getLastName();
	String getStreet();
	String getCity();
	String getState();
	default String getFullName() {
		return getFirstName() + " " + getLastName();
	}
	default String getFullAddress() {
		return getStreet() + "\n" + getCity() + ", " + getState();
	}
	default String formattedOutput() {
		return getFullName() + "\n" + getFullAddress();
	}
	
}
