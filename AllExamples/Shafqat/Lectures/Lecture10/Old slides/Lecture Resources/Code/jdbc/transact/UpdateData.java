package lesson10.lecture.jdbc.transact;

/** Special immutable data structure that 
 *  stores update data for Customer table 
 */
public class UpdateData {
	private final String name;
	
	private final String city;
	public UpdateData(String n, String c) {
		name = n;
		city = c;
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
}
