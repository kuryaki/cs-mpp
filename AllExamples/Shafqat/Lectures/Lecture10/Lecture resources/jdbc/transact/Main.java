package lesson10.lecture.jdbc.transact;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		UpdateCustomer rc = new UpdateCustomer();
		Object[] updateInfo = prepareUpdateInfo();
		Customer cust = (Customer)updateInfo[0];
		UpdateData ud = (UpdateData)updateInfo[1];
		
		try {
			int newCustId = rc.customerUpdates(cust,  ud);
			System.out.println("Updates successful. New customer id for " +
			   cust.getName() + " is " + newCustId);
		} catch(SQLException e) {
			for(Throwable t : e) {
				System.out.println("* " + t.getMessage());
			}
		}

	}
	private static Object[] prepareUpdateInfo() {
		UpdateData upData = new UpdateData("Billy Bob", "Mountain View");
		Customer cust = new Customer("Billy Bob","111 Channing Ave","Palo Alto", "94301");
		Object[] retval = {cust,upData};
		return retval;
	}
}
