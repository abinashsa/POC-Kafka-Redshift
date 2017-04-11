package com.aws.poc.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerDaoImpl implements CustomerDao {

	Connection conn = null;

	public CustomerDaoImpl() {
	}

	@Override
	public Connection getConnection() {
		Connection connFromFactory = null;
		try {
			connFromFactory = ConnectionFactory.getConnectionFactoryInstance().getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return connFromFactory;
	}

	@Override
	public void queryCustomerById(Customer customer) {
		Statement stmt = null;
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			String sql = String.format("SELECT DISTINCT * FROM CUSTOMER WHERE C_CUSTKEY = '%s';",
					customer.getC_custkey());
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {

				customer.setC_name(rs.getString("c_name"));
				customer.setC_address(rs.getString("c_address"));
				customer.setC_city(rs.getString("c_city"));
				customer.setC_nation(rs.getString("c_nation"));
				customer.setC_region(rs.getString("c_region"));
				customer.setC_phone(rs.getString("c_phone"));
				customer.setC_mktsegment(rs.getString("c_mktsegment"));
			}

			rs.close();
			stmt.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// Finally block to close resources.
			try {
				if (stmt != null)
					stmt.close();
			} catch (Exception ex) {
			} // nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

	}

}
