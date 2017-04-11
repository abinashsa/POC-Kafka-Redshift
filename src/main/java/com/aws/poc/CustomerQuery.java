package com.aws.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Component;

import com.aws.poc.dao.*;

@Component
public class CustomerQuery {

	public static void main(String[] args) {
		//SpringApplication.run(CustomerQuery.class, args);
		showDatabaseConnectionExample();
	}
	
	
	private static void showDatabaseConnectionExample() {
		CustomerDao customerDoa = new CustomerDaoImpl();
		// valid customer
		Customer customer = new Customer(String.valueOf(49));
		customerDoa.queryCustomerById(customer);
		customer.printCustomerInfo();

		// non-existent customer
		Customer customer2 = new Customer(String.valueOf(5634345));
		customerDoa.queryCustomerById(customer2);
		customer2.printCustomerInfo();
	}

}
