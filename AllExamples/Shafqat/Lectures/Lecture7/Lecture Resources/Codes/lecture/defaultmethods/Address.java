package lesson7.lecture.defaultmethods;

public class Address {
	private String street1, street2, city, state, zip;
	public Address(String s1, String s2, String c, String state, String z) {
		this.street1 = s1;
		this.street2 = s2;
		this.city = c;
		this.state = state;
		this.zip = z;
	}
	public String toString() {
		String st2 = (street2 == null || street2.trim().equals("")) ?
				"" : "\n"+street2;
		return street1 + st2 + "\n"+ city + ", " + state + " " + zip;
				
	}
	public String getStreet1() {
		return street1;
	}

	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	public String getStreet2() {
		return street2;
	}

	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
}
