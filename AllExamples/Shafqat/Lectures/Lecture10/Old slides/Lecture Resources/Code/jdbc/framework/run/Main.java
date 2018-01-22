package lesson10.lecture.jdbc.framework.run;

import lesson10.lecture.jdbc.framework.business.Customer;
import lesson10.lecture.jdbc.framework.business.CustomerDao;
import lesson10.lecture.jdbc.framework.dataaccess.intface.DataAccessFactory;
import dataaccess.DatabaseException;

public class Main {

	public static void main(String[] args) {
		CustomerDao rc = new CustomerDao();
		
		//prepare test data
		Object[] updateInfo = prepareUpdateInfo();
		Customer cust = (Customer)updateInfo[0];
		UpdateData ud = (UpdateData)updateInfo[1];
		
		try {
			int newCustId = rc.customerUpdates(cust,  ud);
			System.out.println("Updates successful. New customer id for " +
			   cust.getName() + " is " + newCustId);
		} catch(DatabaseException e) {
			System.out.println("* " + e.getMessage());
			
		}

	}
	private static Object[] prepareUpdateInfo() {
		//will insert this new customer
		Customer cust = new Customer("Brian","11 Channing Ave","Palo Alto", "94301");
		
		//will update customer info with this data
		UpdateData upData = new UpdateData("Brian", "Mountain View");
		
		Object[] retval = {cust,upData};
		return retval;
	}
}
