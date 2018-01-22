package lesson10.lecture.jdbc.read_trywithres;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

public class ReadCustomer {
	private String query = "SELECT * FROM Customer WHERE name = ?";
	private static final Logger LOG = Logger.getLogger(ReadCustomer.class.getName());
	
	public Customer getCustomer(String name) throws SQLException {	
		Customer returnValue = null;
		//using try-with-resources - will automatically close connection, 
		//and therefore will close statement and result set
		//If an error occurs in opening or closing a connection it is thrown
		try(Connection conn = (new ConnectManager()).getConnection()) {
			PreparedStatement stat = conn.prepareStatement(query);
			stat.setString(1, name);
			//using this try/catch to (partially) handle exceptions
			//involving statements and executing queries -- such
			//exceptions are logged and then re-thrown
			try {
				ResultSet rs = stat.executeQuery();
				returnValue = populateCustomer(rs);
			} catch(SQLException e) {
				//log exception
				StringBuilder sb = new StringBuilder();
				
				//SQLException now implements Iterable, so 
				//it is possible to iterate through chained 
				//exceptions like this
				for(Throwable t : e) {
					sb.append("+ " + t.getMessage()+ "\n");
				}
				LOG.warning("SQLException thrown:\n" + sb.toString());
				throw e;
			}
		}
		return returnValue;
	}
	private Customer populateCustomer(ResultSet rs) throws SQLException {
		String name = null;
		String street = null;
		String city = null;
		String zip = null;
		if(rs.next()) {
			name = rs.getString("name").trim();
			street = rs.getString("street").trim();
			city = rs.getString("city").trim();
			zip = rs.getString("zip").trim();
		}
		return new Customer(name, street, city, zip);
	}
	
	public Customer getCustomerOldWay(String name) {	
		Customer returnValue = null;
		Connection conn = null;
		try {
			ConnectManager cm = new ConnectManager();
			conn = cm.getConnection();
			PreparedStatement stat = conn.prepareStatement(query);
			stat.setString(1, name);		
			ResultSet rs = stat.executeQuery();
			returnValue = populateCustomer(rs);		
		} catch(SQLException e) {
			System.out.println("Database exception: " + e.getMessage());
		} finally { //clean up resources
			try {
				if(conn != null) {
					conn.close();
				} 
			} catch(SQLException e) {
				System.out.println("Couldn't close connection");
			}			
		}
		return returnValue;
		
	}
	
}
