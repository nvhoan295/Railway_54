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
import com.vti.entity.Account;

/**
 * This class is .
 * 
 * @Description: .
 * @author: HoanNV
 * @create_date: Oct 13, 2022
 * @version: 1.0
 * @modifer: HoanNV
 * @modifer_date: Oct 13, 2022
 */
public class AccountRepository implements IAccountRepository {
	private Connection connection;
	List<Account> accounts;
	Account account;

	/**
	 * Constructor for class AccountRepository.
	 * 
	 * @Description: .
	 * @author: HoanNV
	 * @create_date: Oct 13, 2022
	 * @version: 1.0
	 * @modifer: HoanNV
	 * @modifer_date: Oct 13, 2022
	 * @param accounts
	 */
	public AccountRepository() {
		accounts = new ArrayList<Account>();
	}

	/*
	 * @see com.vti.backend.datalayer.IAccountRepository#getListAccounts()
	 */
	public List<Account> getListAccounts()
			throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {

		connection = JDBCUtils.getConnection();
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
		// Disconnect
		JDBCUtils.disconnect();

		return accounts;
	}

	/*
	 * @see com.vti.backend.datalayer.IAccountRepository#getAccountByID(int)
	 */
	public Account getAccountByID(int id)
			throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {
		connection = JDBCUtils.getConnection();
		String sql = "Select * from `Account` where AccountID = ? ";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			int accid = resultSet.getInt("AccountID");
			String email = resultSet.getString("Email");
			String userName = resultSet.getString("Username");
			String fullName = resultSet.getString("FullName");
			account = new Account(accid, email, userName, fullName);
		}
		// Disconnect
		JDBCUtils.disconnect();
		return account;

	}

	/*
	 * @see com.vti.backend.datalayer.IAccountRepository#isAccountExists(java.lang.
	 * String)
	 */
	public boolean isAccountExists(String username) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {

		connection = JDBCUtils.getConnection();
		String sql = "Select * from `Account` where Username = ? ";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, username);
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			JDBCUtils.disconnect();
			return true;
		}
		return false;
	}

	/*
	 * @see
	 * com.vti.backend.datalayer.IAccountRepository#createAccount(java.lang.String,
	 * java.lang.String, java.lang.String)
	 */
	public void createAccount(String email, String username, String fullName, int departmentId) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
			connection = JDBCUtils.getConnection();
			String sql = "Insert into `Account` (Email, Username, FullName, DepartmentID) values (?, ?, ?, ?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, username);
			preparedStatement.setString(3, fullName);
			preparedStatement.setInt(4, departmentId);
			int check = preparedStatement.executeUpdate();
			if (check >= 0) {
				System.out.println("Tạo tài khoản thành công");
			} else {
				System.out.println("Tạo tài khoản thất bại");
			}
			JDBCUtils.disconnect();
		

	}

	/*
	 * @see com.vti.backend.datalayer.IAccountRepository#isAccountExists(int)
	 */
	public boolean isAccountExists(int id) throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {
		
			connection = JDBCUtils.getConnection();
			String sql = "Select * from `Account` where Username = ? ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				JDBCUtils.disconnect();
				return true;
			}
			JDBCUtils.disconnect();
		return false;
	}

	/*
	 * @see com.vti.backend.datalayer.IAccountRepository#updateAccountByID(int)
	 */
	public void updateAccountByID(int id, String newName)
			throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {
		connection = JDBCUtils.getConnection();
		String sql = "UPDATE `Account` SET `Username` = ? WHERE (`AccountID` = ?)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, newName);
		preparedStatement.setInt(2, id);

		int check = preparedStatement.executeUpdate();
		if (check >= 0) {
			System.out.println("Update Complete");
		} else {
			System.out.println("Update False");
		}

	}

	/*
	 * @see com.vti.backend.datalayer.IAccountRepository#deleteAccount(int)
	 */
	public void deleteAccount(int id) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		connection = JDBCUtils.getConnection();
		String sql = "Delete from `Account` where AccountID = ? ";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		int check = preparedStatement.executeUpdate();
		if (check >= 0) {
			System.out.println("Delete Complete");
		} else {
			System.out.println("Delete False");
		}

	}

}
