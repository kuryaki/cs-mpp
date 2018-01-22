package prob4;

public class Property {
	
	private Address address;
	private Landlord landlord;
	
	public Property() {
	}
	
	public Property(Landlord landlord, Address address) {
		this.address = address;
		this.landlord = landlord;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Landlord getLandlord() {
		return landlord;
	}

	public void setLandlord(Landlord landlord) {
		this.landlord = landlord;
	}
	
}
