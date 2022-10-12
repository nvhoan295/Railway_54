package com.vti.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.PerConnectionLRUFactory;
import com.vti.Utils.JDBCUtils;
import com.vti.entity.Admin;
import com.vti.entity.Employee;
import com.vti.entity.User;
import com.vti.entity.User.UserType;

public class UserRepository {
	private Connection connection;

	public UserRepository() {
	}

	@SuppressWarnings("unlikely-arg-type")
	public List<User> getListUser() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		List<User> users = new ArrayList<User>();
		connection = JDBCUtils.getConnection();
		String sql = "Select * from User";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		while (resultSet.next()) {
			int id = resultSet.getInt("id");
			String fullName = resultSet.getString("fullName");
			String email = resultSet.getString("email");
			String passWord = resultSet.getString("password");
			String userType = resultSet.getString("user_type");
			if (userType.equals(UserType.ADMIN)) {
				int expInYear = resultSet.getInt("ExpInYear");
				Admin admin = new Admin(id, fullName, email, passWord, UserType.ADMIN, expInYear);
				users.add(admin);
			} else {
				String proSkill = resultSet.getString("ProSkill");
				Employee employee = new Employee(id, fullName, email, passWord, UserType.EMPLOYESS, proSkill);
				users.add(employee);
			}

		}
		JDBCUtils.disconnect();
		return users;
	}

	public User getUser(int id) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		User user = new User();
		connection = JDBCUtils.getConnection();
		String sql = "Select * from User where id = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			user.setId(resultSet.getInt("id"));
			user.setFullName(resultSet.getString("fullName"));
			user.setEmail(resultSet.getString("email"));

		}

		return user;
	}

	public void deleteUser(int id) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		User user = new User();
		connection = JDBCUtils.getConnection();
		String sql = "DELETE FROM `user` WHERE `id` = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		int check = preparedStatement.executeUpdate();
		if (check > 0) {
			System.out.println("Delete Complete");
		} else {
			System.out.println("Delete False");
		}

	}

}
