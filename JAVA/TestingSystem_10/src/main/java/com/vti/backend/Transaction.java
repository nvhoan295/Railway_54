package com.vti.backend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transaction {
	private Connection connection;

	public Transaction() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
	}

	public void deleteDepartmentUsingTransaction(int idDepartment) throws ClassNotFoundException, SQLException {
		// Get connection
		String url = "jdbc:mysql://localhost:3306/TestingSystem";
		String username = "root";
		String password = "supperuser";
		// Register the drive class with DriveManagar

		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection(url, username, password);
		System.out.println("Connect Success");
		// turn off auto commit
		connection.setAutoCommit(false);
		// Delete employess
		String sql1 = "Delete from `Account` where DepartmenId = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql1);
		// Set parameter
		preparedStatement.setInt(1, idDepartment);
		// Delete Department
		String sql2 = "Delete from Department where DepartmentID = ?";
		PreparedStatement preparedStatement2 = connection.prepareStatement(sql2);
		// Set Parameter
		preparedStatement2.setInt(1, idDepartment);

		// Execute query
		try {
			preparedStatement.executeUpdate();
			System.out.println("Delete Account success");
			preparedStatement2.executeUpdate();
			System.out.println("Delete Department success");
			// commit transaction
			connection.commit();
			System.out.println("Transaction commit");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			connection.rollback();
			System.out.println("Transaction Rollback");
		}

		// turn on auto commit
		connection.setAutoCommit(true);
		connection.close();

	}

}
