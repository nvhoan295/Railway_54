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

/**
 * This class is .
 * 
 * @Description: .
 * @author: HoanNV
 * @create_date: Oct 19, 2022
 * @version: 1.0
 * @modifer: HoanNV
 * @modifer_date: Oct 19, 2022
 */
public class UserRepository implements IUserRepository {
	private Connection connection;
	private List<User> users;

	/**
	 * Constructor for class UserRepository.
	 * 
	 * @Description: .
	 * @author: HoanNV
	 * @create_date: Oct 19, 2022
	 * @version: 1.0
	 * @modifer: HoanNV
	 * @modifer_date: Oct 19, 2022
	 */
	public UserRepository() {
		users = new ArrayList<User>();
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
			int id = resultSet.getInt("id");
			String fullName = resultSet.getString("full_name");
			String email = resultSet.getString("email");
			String password = resultSet.getString("password");
			String position = resultSet.getString("position");
			String proSkill = resultSet.getString("pro_skill");
			int expInYear = resultSet.getInt("exp_in_year");
			User user = new User(id, fullName, email, password, position, proSkill, expInYear);
			users.add(user);
		}
		return users;
	}

	/*
	 * @see com.vti.backend.datalayer.IUserRepository#getUser()
	 */
	public User getUser(int id) throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {
		User user = null;
		connection = JDBCUtils.getConnection();
		String sql = "Select * from `user` where id = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			String fullName = resultSet.getString("full_name");
			String email = resultSet.getString("email");
			String password = resultSet.getString("password");
			String position = resultSet.getString("position");
			String proSkill = resultSet.getString("pro_skill");
			int expInYear = resultSet.getInt("exp_in_year");
			user = new User(id, fullName, email, password, position, proSkill, expInYear);
		}
		return user;
	}

	/*
	 * @see com.vti.backend.datalayer.IUserRepository#deleteUserById(int)
	 */
	public boolean deleteUserById(int id)
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		connection = JDBCUtils.getConnection();
		String sql = "Delete from `user` where id = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		int check = preparedStatement.executeUpdate();
		if (check > 0) {
			return true;
		}
		return false;
	}

	/*
	 * @see com.vti.backend.datalayer.IUserRepository#login()
	 */
	public User login(String email, String password)
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		User user = null;
		connection = JDBCUtils.getConnection();
		String sql = "Select * from `user` where`email` = ? and `password` = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, email);
		preparedStatement.setString(2, password);
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			String position = resultSet.getString("position");
			String emailUser = resultSet.getString("email");
			String passwordUser = resultSet.getString("password");
			
			user = new User(emailUser, passwordUser, position);
			user.setFullName(resultSet.getString("full_name"));
		}
		return user;
	}

	/*
	 * @see com.vti.backend.datalayer.IUserRepository#createUser()
	 */
	public void createUser(String fullName, String email, String proSkill)
			throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {
		connection = JDBCUtils.getConnection();
		String sql = "Insert into `user` (full_name, `email`, `password`, `position`, pro_skill) values (?, ?, ?, ?, ?)";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, fullName);
		statement.setString(2, email);
		statement.setString(3, "123456");
		statement.setString(4, "EMPLOYEE");
		statement.setString(5, proSkill);
		int check = statement.executeUpdate();
		if (check > 0) {
			System.out.println("Tạo User Thành công");
		} else {
			System.out.println("Tạo User Thất bại");
		}

	}

}
