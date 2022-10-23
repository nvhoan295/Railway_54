//
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
	private List<User> users;

	/**
	 * Constructor for class UserRepository.
	 * 
	 * @Description: .
	 * @author: HoanNV
	 * @create_date: Oct 21, 2022
	 * @version: 1.0
	 * @modifer: HoanNV
	 * @modifer_date: Oct 21, 2022
	 * @param connection
	 * @param users
	 */
	public UserRepository() {

		users = new ArrayList<User>();
	}

	/*
	 * @see com.vti.backend.datalayer.IUserRepository#getUser(int) 
	 *
	 */
	public User getUser(int projectId) throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {
		User user = null;
		connection = JDBCUtils.getConnection();
		String sql = "Select * from `user` where projectId = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, projectId);
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			int iduser = resultSet.getInt("id");
			String fullName = resultSet.getString("full_name");
			String email = resultSet.getString("email");
			String password = resultSet.getString("password");
			String role = resultSet.getString("role");
			int expInYear = resultSet.getInt("exp_in_year");
			String proSkill = resultSet.getString("pro_skill");
			user = new User(iduser, fullName, email, password, role, expInYear, proSkill, projectId);
		}
		JDBCUtils.disconnect();
		return user;
	}

	/*
	 * @see com.vti.backend.datalayer.IUserRepository#getListUsers()
	 */
	public List<User> getListUsers() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		connection = JDBCUtils.getConnection();
		String sql = "Select * from `user`";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		while (resultSet.next()) {
			int iduser = resultSet.getInt("id");
			String fullName = resultSet.getString("full_name");
			String email = resultSet.getString("email");
			String password = resultSet.getString("password");
			String role = resultSet.getString("role");
			int expInYear = resultSet.getInt("exp_in_year");
			String proSkill = resultSet.getString("pro_skill");
			int projectId = resultSet.getInt("projectId");
			User user = new User(iduser, fullName, email, password, role, expInYear, proSkill, projectId);
			users.add(user);
		}
		JDBCUtils.disconnect();
		return users;
	}

	/*
	 * @see com.vti.backend.datalayer.IUserRepository#login(java.lang.String,
	 * java.lang.String)
	 */
	public User login(String email, String password)
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		User user = null;
		connection = JDBCUtils.getConnection();
		String sql = "Select * from `user` where`email` = ? and `password` = ? and `role` = ? ";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, email);
		preparedStatement.setString(2, password);
		preparedStatement.setString(3, "MANAGER");
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			String emailUser = resultSet.getString("email");
			String passwordUser = resultSet.getString("password");

			user = new User(emailUser, passwordUser);
			// Lấy thêm biến FullName để dùng vào chức năng login trong Program
			user.setFullName(resultSet.getString("full_name"));
		}
		JDBCUtils.disconnect();
		return user;
	}
	
	public List<User> getListUsersByProjectID(int projectId) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		connection = JDBCUtils.getConnection();
		String sql = "Select * from `user` where projectId = ?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, projectId);
		
		ResultSet resultSet = statement.executeQuery();
		while (resultSet.next()) {
			int iduser = resultSet.getInt("id");
			String fullName = resultSet.getString("full_name");
			String email = resultSet.getString("email");
			String password = resultSet.getString("password");
			String role = resultSet.getString("role");
			int expInYear = resultSet.getInt("exp_in_year");
			String proSkill = resultSet.getString("pro_skill");
			int project = resultSet.getInt("projectId");
			User user = new User(iduser, fullName, email, password, role, expInYear, proSkill, project);
			users.add(user);
		}
		JDBCUtils.disconnect();
		return users;
	}

}
