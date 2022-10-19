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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.vti.Utils.JDBCUtils;
import com.vti.Utils.ScannerUtils;
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
			String fullName = resultSet.getString("full_name");
			String email = resultSet.getString("email");
			String passWord = resultSet.getString("password");
			String userType = resultSet.getString("position");
			int expInYear = resultSet.getInt("exp_in_year");
			String proSkill = resultSet.getString("pro_skill");
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
			user.setFullName(resultSet.getString("full_name"));
			user.setEmail(resultSet.getString("email"));
			user.setUserType(resultSet.getString("position"));
			user.setExpInYear(resultSet.getInt("exp_in_year"));
			user.setProSkill(resultSet.getString("pro_skill"));

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
			System.out.println("Đã xoá user " + id);
		} else {
			System.out.println("Delete False");
		}

	}

	public User login(String email, String password)
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		User user = null;
		connection = JDBCUtils.getConnection();
		String sql = "SELECT * FROM Assigment11.user where `email` = ? and `password` = ? and `position` = ?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, email);
		statement.setString(2, password);
		statement.setString(3, "ADMIN");
		ResultSet resultSet = statement.executeQuery();
		while (resultSet.next()) {
			int id = resultSet.getInt("id");
			String fullName = resultSet.getString("full_name");
			String position = resultSet.getString("position");
			String proSkill = resultSet.getString("pro_skill");
			int expInYear = resultSet.getInt("exp_in_year");
			user = new User(id, fullName, email, password, position, proSkill, expInYear);

		}
		JDBCUtils.disconnect();
		return user;
	}

	public boolean createUser(String fullName, String email, String password, String position, String proSkill)
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		Connection connection = JDBCUtils.getConnection();
		String sql = "INSERT INTO `user`" 
						+ "(full_name, email, `password`, position, pro_skill)" 
				   + "VALUES"
				   		+ "(?, ?, ?, ?, ?)";

		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, fullName);
		statement.setString(2, email);
		statement.setString(3, password);
		statement.setString(4, position);
		statement.setString(5, proSkill);

		int save = statement.executeUpdate();
		if (save > 0) { // neu la false
			return true;
		}
		return false;
	}

	public boolean updateUser(int id, String fullName, String email, String password, String position, String proSkill,
			String expInYear) throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {
		connection = JDBCUtils.getConnection();

		String sql = "Update `user` set full_name = ?, `email` = ?, `password` = ?, `position` = ?, pro_skill = ?, exp_in_year = ? "
				+ "where id = ?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, fullName);
		statement.setString(2, email);
		statement.setString(3, password);
		statement.setString(4, position);
		statement.setString(5, proSkill);
		statement.setString(6, expInYear);
		statement.setInt(7, id);

		int check = statement.executeUpdate();
		if (check > 0) {
			return true;
		}
		return false;

	}

	public boolean isValidEmailAddress(String email) {
		String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
		Pattern p = Pattern.compile(ePattern);
		Matcher m = p.matcher(email);
		return m.matches();
	}

	public boolean isNameValid(String name) {
		String regex = "^[a-zA-Z]\\w{5,50}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(name);
		return m.matches();
	}
}
