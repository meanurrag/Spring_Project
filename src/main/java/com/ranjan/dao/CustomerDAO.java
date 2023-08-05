package com.ranjan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.sql.DataSource;
import com.ranjan.bo.CustomerBO;

public class CustomerDAO implements ICustomerDAO {

	private static final String CUSTOMER_INSERT_QUERY ="INSERT INTO REALTIMEDI_HOTEL VALUES (CUST_NO_SEQ.NEXTVAL,?,?,?,?)";
	private DataSource ds;
	
	
	public CustomerDAO(DataSource ds) {
		System.out.println("CustomerDAO : 1 Param Constructor");
		this.ds = ds;
	}


	@Override
	public int insert(CustomerBO bo) throws Exception {
		int count = 0;
		//get pooled connection
		try(Connection con = ds.getConnection();
		PreparedStatement ps = con.prepareStatement(CUSTOMER_INSERT_QUERY)){
			//completing the query
			if(ps!=null) {
				ps.setString(1, bo.getCname());
				ps.setString(2, bo.getCadd());
				ps.setInt(3, bo.getRoomno());
				ps.setDouble(4, bo.getBillamt());
				//executing the query
				count = ps.executeUpdate();
			}
		}catch(SQLException se) {
			se.printStackTrace();
			throw se;
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		
		return count;
	}

}
