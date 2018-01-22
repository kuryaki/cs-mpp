package lesson5.lecture.factorymethods3.business;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import lesson5.lecture.factorymethods3.dataaccess.Dao;

public class PersonDao implements Dao {
	private Person person;
	private List<Person> allPersons;
	public List<Person> getAllPersons() {
		return allPersons;
	}
	public PersonDao(){}
	public void setPerson(Person p) {
		person = p;
	}
	@Override
	public String getSql() {
		return "SELECT * from PERSON";
	}
	@Override
	public void unpackResultSet(ResultSet rs) throws SQLException {
		allPersons = new ArrayList<>();
		while(rs.next()) {
			allPersons.add(new Person(rs.getString("name"), rs.getString("ssn")));
		}		
	}
	@Override
	public List<?> getResults() {
		return allPersons;
	}
}
