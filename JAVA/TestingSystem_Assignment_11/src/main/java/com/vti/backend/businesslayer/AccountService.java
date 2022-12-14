package com.vti.backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.AccountRepository;
import com.vti.backend.datalayer.IAccountRepossitory;
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
public class AccountService implements IAccountService {
	private IAccountRepossitory repository;

	public AccountService() throws FileNotFoundException, IOException {
		repository = new AccountRepository();
	}

	public List<Account> getListAccounts() throws ClassNotFoundException, SQLException {
		return repository.getListAccounts();
	}

	public Account getAccountByID(int id) throws Exception {
		return repository.getAccountByID(id);
	}

	public boolean isAccountExists(String username) throws ClassNotFoundException, SQLException {
		return repository.isAccountExists(username);
	}

	public void createAccount(String email, String username, String fullName)
			throws ClassNotFoundException, SQLException {
		repository.createAccount(email, username, fullName);

	}

	public boolean isAccountExists(int id) throws ClassNotFoundException, SQLException {
		return repository.isAccountExists(id);
	}

	public void updateAccountByID(int id, String newFullName) throws ClassNotFoundException, SQLException {
		repository.updateAccountByID(id, newFullName);

	}

	public void deleteAccount(int id) throws ClassNotFoundException, SQLException {
		repository.deleteAccount(id);
	}

}
