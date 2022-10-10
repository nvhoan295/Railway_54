package com.vti.backend;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.vti.Utils.JdbcUtils;
import com.vti.entity.Department;

public class DepartmentDao {
	private JdbcUtils jdbcUtils;

	public DepartmentDao() {
		jdbcUtils = new JdbcUtils();
	}

	public List<Department> getDepartments() throws ClassNotFoundException, SQLException {
		List<Department> departments = new ArrayList<Department>();
		// Step 2: get connection
		Connection connection = jdbcUtils.connect();
		// Step 3: Create statement a object
		Statement statement = connection.createStatement();

		// Step 4: execute Query
		String sql = "Select * from Department";
		ResultSet resultSet = statement.executeQuery(sql);
		// Step 5: Handling result set
		while (resultSet.next()) {
			Department department = new Department();
			department.setId(resultSet.getInt("DepartmentID"));
			department.setName(resultSet.getString("DepartmentName"));
			departments.add(department);
		}

		// Step 6: Disconnect
		connection.close();
		return departments;

	}

	public Department getDepartmentById(int id) throws Exception {
		Connection connection = jdbcUtils.connect();
		// Step 3: Create a statement object
		String sql = "Select * from Department where DepartmentID = ?";
		PreparedStatement pStatement = connection.prepareStatement(sql);
		// set parameter
		pStatement.setInt(1, id);
		// Step 4: execute query

		ResultSet resultSet = pStatement.executeQuery();
		// Step 5: handling result set
		if (resultSet.next()) {
			Department department = new Department();
			department.setId(resultSet.getInt("DepartmentID"));
			department.setName(resultSet.getString("DepartmentName"));
			jdbcUtils.disconnect();
			return department;
		} else {
			jdbcUtils.disconnect();
			throw new Exception("Cannot find Department by ID: " + id);
		}

	}

	public boolean isDepartmentNameExists(String name) throws ClassNotFoundException, SQLException {
		// get connection

		Connection connection = jdbcUtils.connect();

		// Create a statement object
		String sql = "Select * from Department where DepartmentName = ?";
		PreparedStatement pStatement = connection.prepareStatement(sql);
		// set Parameter
		pStatement.setString(1, name);

		// Step 4: execute update
		ResultSet resultSet = pStatement.executeQuery();
		// Step 5: handling result set
		if (resultSet.next()) {
			jdbcUtils.disconnect();
			return true;
		} else {
			jdbcUtils.disconnect();
			return false;
		}

	}
	
	public void createDepartment(String name) throws Exception {
		if (isDepartmentNameExists(name)) {
			throw new Exception("Department Name exists");
		}
		
		// get connection
		Connection connection = jdbcUtils.connect();
		// if not exists 
		// Create a statement object
		String sql = "Insert into Department ( DepartmentName) value (?)";
		PreparedStatement pStatement = connection.prepareStatement(sql);
		// Set parameter
		
		pStatement.setString(1, name);
		// Step 4: execute query
		pStatement.executeUpdate();
		// Step 5 : disconnect
		connection.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
