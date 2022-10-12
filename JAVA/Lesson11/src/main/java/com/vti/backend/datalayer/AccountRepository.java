package com.vti.backend.datalayer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.vti.Utils.JdbcUtils;
import com.vti.entity.Account;

public class AccountRepository {
	private JdbcUtils jdbcUtils;
	private Connection connection;

	public AccountRepository() {
		jdbcUtils = new JdbcUtils();
	}

	public List<Account> getListAccounts() throws ClassNotFoundException, SQLException {
		List<Account> accounts = new ArrayList<Account>();
		connection = jdbcUtils.connect();

		Statement statement = connection.createStatement();
		String sql = "Select * from `Account`";
		ResultSet resultSet = statement.executeQuery(sql);
		while (resultSet.next()) {
			Account account = new Account(resultSet.getInt("AccountID"), resultSet.getString("Email"),
					resultSet.getString("Username"), resultSet.getString("FullName"));
			accounts.add(account);
		}
		jdbcUtils.disconnect();
		return accounts;

	}

}
