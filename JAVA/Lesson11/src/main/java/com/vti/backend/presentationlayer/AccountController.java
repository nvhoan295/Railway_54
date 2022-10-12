package com.vti.backend.presentationlayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.backend.bussinesslayer.AccountService;
import com.vti.entity.Account;

public class AccountController {
	private AccountService service;
	private List<Account> accounts;

	public AccountController() {
		service = new AccountService();
	}
	
	public List<Account> getListAccounts() throws ClassNotFoundException, SQLException{
		accounts = service.getListAccounts();
		return accounts;
	}

}
