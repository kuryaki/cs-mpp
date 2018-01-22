package lesson7.lecture.defaultmethods;

public class PersonInDetail implements NameAddress {
	private String firstName, middleName, lastName;
	private Address address;
	PersonInDetail(String fn, String mn, String ln, Address add) {
		this.firstName = fn;
		this.middleName = mn;
		this.lastName = ln;
		this.address= add;
	}
	
	public String getStreet() {
		return address.getStreet1();
	}
	public String getCity() {
		return address.getCity();
	}
	public String getState() {
		return address.getState();
	}
	public String getFullName() {
		return firstName + " " + middleName + " " + lastName;
	}
	public String getFullAddress() {
		return address.toString();
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
