package com.vti.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtils {
	private Connection connection;
	private Properties properties;

	public JdbcUtils() throws FileNotFoundException, IOException {
		properties = new Properties();
		properties.load(new FileInputStream("src/main/resource/database.properties"));
	}
	

	public void isConnectedForTesting() throws ClassNotFoundException, SQLException {
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");

		// Step 1: Register the driver class with Department
		Class.forName(properties.getProperty("driver"));
		// Step 2: get a Database Connection
		connection = DriverManager.getConnection(url, username, password);
		System.out.println("Connect Seccuss");
	}

	public Connection connect() throws ClassNotFoundException, SQLException {
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");

		// Step 1: Register the driver class with Department
		Class.forName(properties.getProperty("driver"));
		// Step 2: get a Database Connection
		connection = DriverManager.getConnection(url, username, password);
		System.out.println("Connect Seccuss");
		return connection;
	}

	public void disconnect() throws SQLException {
		connection.close();
	}

}
