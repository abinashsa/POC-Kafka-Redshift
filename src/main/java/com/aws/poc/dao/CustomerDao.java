package com.aws.poc.dao;

import java.sql.Connection;

public interface CustomerDao {

	public Connection getConnection();

	public void queryCustomerById(Customer customer);
}
