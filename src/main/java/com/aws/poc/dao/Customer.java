package com.aws.poc.dao;

public class Customer {

	private String c_custkey;
	private String c_name;
	private String c_address;
	private String c_city;
	private String c_nation;
	private String c_region;
	private String c_phone;
	private String c_mktsegment;

	public Customer(String c_custkey) {
		setC_custkey(c_custkey);
	}

	public Customer(String c_name, String c_address, String c_city, String c_nation, String c_region, String c_phone,
			String c_mktsegment) {
		setC_name(c_name);
		setC_address(c_address);
		setC_city(c_city);
		setC_nation(c_nation);
		setC_region(c_region);
		setC_phone(c_phone);
		setC_mktsegment(c_mktsegment);
	}

	public void printCustomerInfo() {
		if (getC_custkey() != null && getC_name() != null) {
			System.out.println(String.format("|%-30s|%-30s|%-30s|%-30s|%-30s|%-30s|%-30s|", "c_name", "c_address",
					"c_city", "c_nation", "c_region", "c_phone", "c_mktsegment"));
			System.out.println(String.format("|%-30s|%-30s|%-30s|%-30s|%-30s|%-30s|%-30s|", getC_name(), getC_address(),
					getC_city(), getC_nation(), getC_region(), getC_phone(), getC_mktsegment()));
		} else {
			System.out.println(String.format("Customer ID: %s does not exist!", getC_custkey()));
		}
	}

	public String getC_custkey() {
		return c_custkey;
	}

	public void setC_custkey(String c_custkey) {
		this.c_custkey = c_custkey;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String getC_address() {
		return c_address;
	}

	public void setC_address(String c_address) {
		this.c_address = c_address;
	}

	public String getC_city() {
		return c_city;
	}

	public void setC_city(String c_city) {
		this.c_city = c_city;
	}

	public String getC_nation() {
		return c_nation;
	}

	public void setC_nation(String c_nation) {
		this.c_nation = c_nation;
	}

	public String getC_region() {
		return c_region;
	}

	public void setC_region(String c_region) {
		this.c_region = c_region;
	}

	public String getC_phone() {
		return c_phone;
	}

	public void setC_phone(String c_phone) {
		this.c_phone = c_phone;
	}

	public String getC_mktsegment() {
		return c_mktsegment;
	}

	public void setC_mktsegment(String c_mktsegment) {
		this.c_mktsegment = c_mktsegment;
	}

}
