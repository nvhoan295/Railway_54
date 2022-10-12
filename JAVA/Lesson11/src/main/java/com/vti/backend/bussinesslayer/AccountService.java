package com.vti.backend.bussinesslayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.AccountRepository;
import com.vti.entity.Account;

public class AccountService {
	private AccountRepository repository;
	private List<Account> accounts;

	public AccountService() {
		repository = new AccountRepository();
		
	}

	public List<Account> getListAccounts() throws ClassNotFoundException, SQLException{
		accounts = repository.getListAccounts();
		return accounts;
	}
}
