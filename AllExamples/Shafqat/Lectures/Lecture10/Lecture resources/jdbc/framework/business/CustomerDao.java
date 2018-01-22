package lesson10.lecture.jdbc.framework.business;

import java.sql.ResultSet;
import java.util.logging.Logger;

import lesson10.lecture.jdbc.framework.dataaccess.intface.DataAccessFactory;
import lesson10.lecture.jdbc.framework.run.UpdateData;
import dataaccess.Dao;
import dataaccess.DataAccess;
import dataaccess.DatabaseException;

public class CustomerDao implements Dao {
	private String insert = "INSERT INTO CUSTOMER (name, street, city, zip) "
			+"VALUES (" +
			"'" +"%s" + "'," +
			"'" +"%s" + "'," +
			"'" +"%s" + "'," +
			"'" +"%s" + "')";
	private String update = "UPDATE CUSTOMER SET city = "+ "'" + "%s" + "'" + " WHERE " +
			"name = " + "'" + "%s" + "'";
	private static final Logger LOG = Logger.getLogger(CustomerDao.class.getName());
	private final static String UPDATE = "update";
	private final static String INSERT = "insert";
	private String queryType;
	private String query;
	private DataAccess da = DataAccessFactory.getDataAccess();
	private Customer cust;
	private UpdateData updateData;
	
	private int insertCustData(Customer cust) throws DatabaseException {
		queryType = INSERT;	
		return da.save();
		
	}
	private void updateCustData(UpdateData update) throws DatabaseException {
		queryType = UPDATE;
		da.save();
	}
	
	
	public int customerUpdates(Customer cust, UpdateData updateData) throws DatabaseException {
		this.cust = cust;
		this.updateData = updateData;
		da.createConnection(this);
		da.startTransaction();
		try {
        	int result = insertCustData(cust);
        	updateCustData(updateData);
        	da.commit();
        	return result;
        } catch(DatabaseException e) {
        	LOG.warning("Attempting to rollback...");
        	da.rollback();
        	throw (e);
        }  finally {
        	da.releaseConnection();
        }
	}

	
	@Override
	public void buildQuery() throws DatabaseException {
		if(queryType.equals(UPDATE)) {
			query = String.format(update, updateData.getCity(), updateData.getName());
		} else if(queryType.equals(INSERT)) {
			query = String.format(insert, cust.getName(), cust.getStreet(), 
					cust.getCity(), cust.getZip());
		}
		
	}
	@Override
	public String getQuery() {
		return query;
	}
	@Override
	public void populateEntity(ResultSet arg0) throws DatabaseException {
		//nothing to do
		
	}
}
