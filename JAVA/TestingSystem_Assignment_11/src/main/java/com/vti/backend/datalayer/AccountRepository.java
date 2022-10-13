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

import com.vti.Utils.JdbcUtils;
import com.vti.entity.Account;

public class AccountRepository implements IAccountRepossitory {
	private Connection connection;
	private List<Account> accounts;
	private JdbcUtils jdbcUtils;

	public AccountRepository() throws FileNotFoundException, IOException {
		this.accounts = new ArrayList<Account>();
		jdbcUtils = new JdbcUtils();
	}

	public List<Account> getListAccounts() throws ClassNotFoundException, SQLException {
		connection = jdbcUtils.connect();
		String sql = "Select * from `Account`";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		while (resultSet.next()) {
			int id = resultSet.getInt("AccountID");
			String email = resultSet.getString("Email");
			String userName = resultSet.getString("Username");
			String fullName = resultSet.getString("FullName");
			Account account = new Account(id, email, userName, fullName);
			accounts.add(account);
		}
		jdbcUtils.disconnect();
		return accounts;

	}

	public Account getAccountByID(int id) throws Exception {
		connection = jdbcUtils.connect();
		String sql = "Select * from `Account` where AccountID = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		ResultSet resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			Account account = new Account(resultSet.getInt("AccountID"), resultSet.getString("Email"),
					resultSet.getString("Username"), resultSet.getString("FullName"));
			jdbcUtils.disconnect();
			return account;
		} else {
			jdbcUtils.disconnect();
			throw new Exception("Cannot find by Id: " + id);
		}

	}

	public boolean isAccountExists(String username) throws ClassNotFoundException, SQLException {
		jdbcUtils.connect();
		String sql = "Select * from `Account` where Username = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, username);
		ResultSet resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			jdbcUtils.disconnect();
			return true;
		} else {
			jdbcUtils.disconnect();
			return false;
		}
	}

	public boolean isAccountExists(int id) throws ClassNotFoundException, SQLException {
		jdbcUtils.connect();
		String sql = "Select * from `Account` where AccountID = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		ResultSet resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			jdbcUtils.disconnect();
			return true;
		} else {
			jdbcUtils.disconnect();
			return false;
		}
	}

	public void updateAccountByID(int id, String newFullName) throws ClassNotFoundException, SQLException {
		connection = jdbcUtils.connect();
		String sql = "Update `Account` Set FullName = ? where AccountID = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, newFullName);
		preparedStatement.setInt(2, id);
		int effectedRecordAmount = preparedStatement.executeUpdate();
		if (effectedRecordAmount > 0) {
			System.out.println("Update Complete");
		} else {
			System.out.println("Update False");
		}
		jdbcUtils.disconnect();

	}

	public void deleteAccount(int id) throws ClassNotFoundException, SQLException {
		connection = jdbcUtils.connect();
		String sql = "Delete from `Account` where AccountID = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		int effecredRecordAmount = preparedStatement.executeUpdate();
		if (effecredRecordAmount > 0) {
			System.out.println("Delete Complete");
		} else {
			System.out.println("Delete False");
		}

		jdbcUtils.disconnect();

	}

	public void createAccount(String email, String username, String fullName)
			throws ClassNotFoundException, SQLException {
		connection = jdbcUtils.connect();
		String sql = "Insert into `Account`(Email, Username, FullName) values (?, ?, ? )";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, email);
		preparedStatement.setString(2, username);
		preparedStatement.setString(3, fullName);
		int effecredRecordAmount = preparedStatement.executeUpdate();
		if (effecredRecordAmount > 0) {
			System.out.println("Create Complete");
		} else {
			System.out.println("Create False");
		}
		jdbcUtils.disconnect();
	}

	

}
