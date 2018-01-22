package lesson10.lecture.jdbc.read_trywithres;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		ReadCustomer rc = new ReadCustomer();
		try {
			Customer cust = rc.getCustomer("Bob");
			System.out.println(cust);
		} catch(SQLException e) {
			for(Throwable t : e) {
				System.out.println("* " + t.getMessage());
			}
		}

	}

}
