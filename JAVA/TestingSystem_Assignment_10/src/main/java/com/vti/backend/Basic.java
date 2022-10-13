package com.vti.backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Basic {
	private Connection connection;

	public Basic() {
	}

	public void question1() throws ClassNotFoundException, SQLException {
//		Question 1: (Sử dụng Database Testing System đã xây dựng ở SQL)
//		Tạo connection tới database Testing System
//		In ra "Connect success!" khi kết nối thành công.
		String url = "jdbc:mysql://localhost:3306/TestingSystem";
		String username = "root";
		String password = "supperuser";

		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection(url, username, password);
		System.out.println("Connect Succsuss");

	}

	public void question2() throws ClassNotFoundException, SQLException {
//		Question 2:
//			Tạo method để in ra các thông tin của position gồm có id, name
		String url = "jdbc:mysql://localhost:3306/TestingSystem";
		String username = "root";
		String password = "supperuser";

		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection(url, username, password);
		System.out.println("Connect Succsuss");
		// Create a Statement object
		Statement statement = connection.createStatement();
		// Execute Query
		String sql = "Select * from Position";
		ResultSet resultSet = statement.executeQuery(sql);

		// Handling Resultset
		while (resultSet.next()) {
			System.out.println(resultSet.getInt("PositionID"));
			System.out.println(resultSet.getString("PositionName"));
		}

	}

	public void createPosition(String name) throws ClassNotFoundException, SQLException {
//		Question 3:
//			Tạo method để tạo position, user sẽ nhập vào name.

		String url = "jdbc:mysql://localhost:3306/TestingSystem";
		String username = "root";
		String password = "supperuser";

		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection(url, username, password);
		System.out.println("Connect Succsuss");

		// Tạo đối tượng statement
		String sql = "Insert into Position (PositionName) value (?)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, name);
		// Execute SQL query with executeUpdate
		int effectedRecordAmount = preparedStatement.executeUpdate();
		if (effectedRecordAmount == 1) {
			System.out.println("Position insert complete");
		} else {
			System.out.println("Position insert false");
		}

	}

	public void updatePositon() throws ClassNotFoundException, SQLException {
//		Question 4:
//			Tạo method để update tên của position gồm có id = 5 thành "Dev".

		String url = "jdbc:mysql://localhost:3306/TestingSystem";
		String username = "root";
		String password = "supperuser";

		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection(url, username, password);
		System.out.println("Connect Succsuss");

		Statement statement = connection.createStatement();
		String sql = "UPDATE `Position` SET `PositionName` = 'Dev' WHERE (`PositionID` = '7')";
		int effectedRecordAmount = statement.executeUpdate(sql);
		if (effectedRecordAmount == 1) {
			System.out.println("Update Position Complete");
		} else {
			System.out.println("Update Position False");
		}

	}

	public void deletePositionById(int id) throws ClassNotFoundException, SQLException {
//		Question 5:
//			Tạo method để delete của position theo id và user sẽ nhập vào id
		String url = "jdbc:mysql://localhost:3306/TestingSystem";
		String username = "root";
		String password = "supperuser";

		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection(url, username, password);
		System.out.println("Connect Succsuss");

		String sql = "Delete from Position where PositionID = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		int effectedRecordAmount = preparedStatement.executeUpdate();
		if (effectedRecordAmount == 1) {
			System.out.println("Delete Position Complete");
		} else {
			System.out.println("Delete Position False");
		}

	}
	public void disconnect() throws SQLException {
		connection.close();
	}
}
