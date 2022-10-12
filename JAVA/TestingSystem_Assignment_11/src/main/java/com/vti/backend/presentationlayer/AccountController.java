package com.vti.backend.presentationlayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.businesslayer.AccountService;
import com.vti.backend.businesslayer.IAccountService;
import com.vti.entity.Account;

public class AccountController {
	private List<Account> accounts;
	private IAccountService service;

	public AccountController() throws FileNotFoundException, IOException {
		service = new AccountService();
	}
	
	public List<Account> getListAccounts() throws ClassNotFoundException, SQLException{
		return accounts = service.getListAccounts();
	}

	public Account getAccountByID(int id) throws Exception {
		
		return service.getAccountByID(id);
	}

	public boolean isAccountExists(String username) throws ClassNotFoundException, SQLException {
		return service.isAccountExists(username);
	}

	public void createAccount(String email, String username, String fullName) throws ClassNotFoundException, SQLException {
		service.createAccount(email, username, fullName);
		
	}

	public boolean isAccountExists(int id) throws ClassNotFoundException, SQLException {
		return service.isAccountExists(id);
	}

	public void updateAccountByID(int id, String newFullName) throws ClassNotFoundException, SQLException {
		service.updateAccountByID(id, newFullName);
		
	}

	public void deleteAccount(int id) throws ClassNotFoundException, SQLException {
		service.deleteAccount(id);
	}
	

}
