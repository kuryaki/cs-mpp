package prob4;

public class Admin {
	public static double computeTotalRent(Rentable[] properties) {
		double totalRent = 0;
		
		for (Rentable property : properties) {
			totalRent += property.computeRent();
		}
		
		return totalRent;
	}
}
