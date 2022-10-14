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

import com.vti.Utils.JDBCUtils;
import com.vti.entity.User;

public class UserRepository implements IUserRepository {
	private Connection connection;

	public UserRepository() {
	}

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
			int expInYear = resultSet.getInt("ExpInYear");
			String proSkill = resultSet.getString("ProSkill");
			User user = new User(id, fullName, email, passWord, userType, proSkill, expInYear);
			users.add(user);
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
			user.setUserType(resultSet.getString("user_type"));
			user.setExpInYear(resultSet.getInt("ExpInYear"));
			user.setProSkill(resultSet.getString("ProSkill"));

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
			System.out.println("Đã xoá user "+ id);
		} else {
			System.out.println("Delete False");
		}
		
	}

}
