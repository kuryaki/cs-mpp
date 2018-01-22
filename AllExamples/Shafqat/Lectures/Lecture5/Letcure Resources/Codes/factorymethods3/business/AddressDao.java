package lesson5.lecture.factorymethods3.business;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import lesson5.lecture.factorymethods3.dataaccess.Dao;

public class AddressDao implements Dao {
	private Address address;
	private List<Address> allAddresses;
	public List<Address> getAllAddresses() {
		return allAddresses;
	}
	public AddressDao() {}
	public void setAddress(Address address){
		this.address = address;
	}
	@Override
	public String getSql() {
		return "SELECT * from ADDRESS";
	}
	@Override
	public void unpackResultSet(ResultSet rs) throws SQLException {
		allAddresses = new ArrayList<>();
		while(rs.next()) {
			allAddresses.add(new Address(rs.getString("street"), 
					rs.getString("city"),
					rs.getString("state"),
					rs.getString("zip")));
		}		
	}
	@Override
	public List<?> getResults() {
		return allAddresses;
	}
}
