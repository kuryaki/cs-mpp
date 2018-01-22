package prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {
	
	private String name;
	private List<Apartment> apartmentList;
	private float maintenanceCost;
	
	public Building(){
		this.name = "";
		this.apartmentList = new ArrayList<>();
		this.maintenanceCost = 0;
	}
	
	public Building(String name,List<Apartment> aptList,float mtnCost){
		this.name = name;
		this.apartmentList = aptList;
		this.maintenanceCost = mtnCost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Apartment> getApartmentList() {
		return apartmentList;
	}

	public void setApartmentList(List<Apartment> apartmentList) {
		this.apartmentList = apartmentList;
	}

	public float getMaintenanceCost() {
		return maintenanceCost;
	}

	public void setMaintenanceCost(float maintenanceCost) {
		this.maintenanceCost = maintenanceCost;
	}
	
	public float getMonthlyProfit(){
		float profit = 0;
		for(int i=0;i<apartmentList.size();i++){
			Apartment apt = apartmentList.get(i);
			profit += apt.getRentalFee();
		}
		profit -= maintenanceCost;
		return profit;
	}
	
	@Override
	public String toString(){
		return "["+this.name +" monthly profit is: "+ getMonthlyProfit()+"]";
	}
}
