package com.vti.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtils {
	private Connection connection;

	public JdbcUtils() {
	}

	public void connectForTesting() throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/TestingSystem";
		String username = "root";
		String password = "supperuser";

		// Step 1: Register the driver class with DriverManager
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Step 2: get a Database connection
		connection = DriverManager.getConnection(url, username, password);
		System.out.println("Connect Succsess");

	}

	public Connection connect() throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/TestingSystem";
		String username = "root";
		String password = "supperuser";
		// Step 1: Register the driver class with DriverManager
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Step 2: get a Database connection
		connection = DriverManager.getConnection(url, username, password);
		return connection;
	}
	
	public void disconnect() throws SQLException {
		connection.close();
	}
	
}
