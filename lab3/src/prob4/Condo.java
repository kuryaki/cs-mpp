package prob4;

public class Condo extends Property implements Rentable {
	
	private int numFloors;

	public Condo(Landlord landlord, Address address) {
		super(landlord, address);
	}

	public Condo(int numFloors) {
		this.numFloors = numFloors;
	}

	@Override
	public double computeRent() {
		return 400 * numFloors;
	}

}
