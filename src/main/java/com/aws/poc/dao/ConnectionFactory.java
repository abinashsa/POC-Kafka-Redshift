package com.aws.poc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
	private String driverClassName = "com.amazon.redshift.jdbc42.Driver";
	private String connectionUrl = "jdbc:redshift://poc.chsavwrbqn4t.us-east-1.redshift.amazonaws.com:5439/dev";
	private String dbUser = "pocredshift";
	private String dbPwd = "zQmP123!";

	private static ConnectionFactory connectionFactory = null;

	private ConnectionFactory() {
		try {
			Class.forName(driverClassName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() throws SQLException {
		Connection conn = null;
		Properties properties = new Properties();

		properties.setProperty("user", dbUser);
		properties.setProperty("password", dbPwd);

		conn = DriverManager.getConnection(connectionUrl, properties);
		return conn;
	}

	public static ConnectionFactory getConnectionFactoryInstance() {
		if (connectionFactory == null) {
			connectionFactory = new ConnectionFactory();
		}
		return connectionFactory;
	}
}
