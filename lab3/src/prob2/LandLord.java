package prob2;

import java.util.ArrayList;
import java.util.List;

public class LandLord {

	public static void main(String[] args){
		List<Building> buildingList = new ArrayList<>();
		
		Building building1 = new Building("Building1", new ArrayList<Apartment>(){
			{
				add(new Apartment(150, "Apartment1"));
				add(new Apartment(100, "Apartment2"));
				add(new Apartment(200, "Apartment3"));
			}
		}, 150);
		
		Building building2 = new Building("Building2", new ArrayList<Apartment>(){
			{
				add(new Apartment(200, "Apartment1"));
				add(new Apartment(400, "Apartment2"));
			}
		}, 150);
		
		buildingList.add(building1);
		buildingList.add(building2);
		
		for(Building building : buildingList){
			System.out.println(building);
		}
	}
}
