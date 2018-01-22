package prob4;

public class House extends Property implements Rentable {
	
	private int lotSize;

	public House(Landlord landlord, Address address) {
		super(landlord, address);
	}

	public House(int lotSize) {
		this.lotSize = lotSize;
	}

	@Override
	public double computeRent() {
		return 0.1 * lotSize;
	}

}
