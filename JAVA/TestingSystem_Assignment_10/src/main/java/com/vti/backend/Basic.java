package com.vti.backend;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Basic {
	private Properties properties;
	private Connection connection;

	public Basic() throws FileNotFoundException, IOException {
		properties = new Properties();

		properties.load(new FileInputStream("src/main/resource/database.properties"));
		properties.load(new FileInputStream("src/main/resource/message.properties"));
	}

//	Question 1: (Sử dụng Database Testing System đã xây dựng ở SQL)
//	Tạo connection tới database Testing System
//	In ra "Connect success!" khi kết nối thành công.
	public void connect() throws ClassNotFoundException, SQLException {
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		// Register the drive class with DriveManagar

		Class.forName(properties.getProperty("driver"));
		connection = DriverManager.getConnection(url, username, password);
		System.out.println("Connect Success!");
	}

//	Question 2:
//		Tạo method để in ra các thông tin của position gồm có id, name
	public void question2() throws SQLException {
		// Step 3: Create statement object
		Statement statement = connection.createStatement();
		// Step 4: Execute SQL Query
		String sql = "Select * from Position";
		ResultSet resultSet = statement.executeQuery(sql);

		// Handling resultSet
		while (resultSet.next()) {
			System.out.println(resultSet.getInt("PositionID"));
			System.out.println(resultSet.getString("PositionName"));
		}

	}

//	Question 3:
//		Tạo method để tạo position, user sẽ nhập vào name.
	public void createPosition(String name) throws SQLException {
		// Create statement object
		String sql = "insert into Position (PositionName) values (?)";
		PreparedStatement pStatement = connection.prepareStatement(sql);
		// set parameter
		pStatement.setString(1, name);
		// Execute SQL query with executeUpdate
		int effectedRecordAmount = pStatement.executeUpdate();

		// Handing result set
		if (effectedRecordAmount == 1) {
			System.out.println("position insert complete");
		} else {
			System.out.println("Position insert false");
		}

	}

//	Question 4:
//		Tạo method để update tên của position gồm có id = 5 thành "Dev".
	public void updatePositionName() throws SQLException {
		// Create statement object

		Statement statement = connection.createStatement();

		// Execute SQL query with executeUpdate
		String sql = "UPDATE `Position` SET `PositionName` = 'Dev' WHERE (`PositionID` = '5')";
		int effectedRecordAmount = statement.executeUpdate(sql);
		// Handing result set
		if (effectedRecordAmount == 1) {
			System.out.println("Position update complete");
		} else {
			System.out.println("Position update false");
		}

	}

//	Question 5:
//		Tạo method để delete của position theo id và user sẽ nhập vào id
	public void deletePositionById(int id) throws SQLException {
		// Create a statement object
		String sql = "Delete from Position where PositionID = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		// set parameter
		preparedStatement.setInt(1, id);
		// Execute SQL query with executeUpdate
		int effectedRecordAmount = preparedStatement.executeUpdate();
		// Handing result set
		if (effectedRecordAmount > 0) {
			System.out.println("position delete complete");
		} else {
			System.out.println("Position delete false");
		}

	}
	public void closeConnection() throws SQLException {
		connection.close();
	}

}
