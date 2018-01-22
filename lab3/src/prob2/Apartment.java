package prob2;

public class Apartment {
	private String name;
	private float rentalFee;
	
	public Apartment(){
		this.rentalFee = 0;
		this.name = "";
	}
	
	public Apartment(float rentalFee,String name){
		this.rentalFee = rentalFee;
		this.name = name;
	}

	public float getRentalFee() {
		return rentalFee;
	}

	public void setRentalFee(float rentalFee) {
		this.rentalFee = rentalFee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
