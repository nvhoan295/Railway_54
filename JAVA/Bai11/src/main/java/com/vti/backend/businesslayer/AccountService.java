//
package com.vti.backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.AccountRepository;
import com.vti.backend.datalayer.IAccountRepository;
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
	private IAccountRepository repository;

	/**
	 * Constructor for class AccountService.
	 * 
	 * @Description: .
	 * @author: HoanNV
	 * @create_date: Oct 13, 2022
	 * @version: 1.0
	 * @modifer: HoanNV
	 * @modifer_date: Oct 13, 2022
	 * @param repository
	 */
	public AccountService() {

		repository = new AccountRepository();
	}

	/*
	 * @see com.vti.backend.businesslayer.IAccountService#getListAccounts()
	 */
	public List<Account> getListAccounts()
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		return repository.getListAccounts();

	}

	/*
	 * @see com.vti.backend.businesslayer.IAccountService#getAccountByID(int)
	 */
	public Account getAccountByID(int id)
			throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {
		return repository.getAccountByID(id);
	}

	/*
	 * @see com.vti.backend.businesslayer.IAccountService#isAccountExists(java.lang.
	 * String)
	 */
	public boolean isAccountExists(String username)
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		return repository.isAccountExists(username);

	}

	/*
	 * @see
	 * com.vti.backend.businesslayer.IAccountService#createAccount(java.lang.String,
	 * java.lang.String, java.lang.String, int)
	 */
	public void createAccount(String email, String username, String fullName, int departmentId)
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		repository.createAccount(email, username, fullName, departmentId);

	}

	/*
	 * @see com.vti.backend.businesslayer.IAccountService#isAccountExists(int)
	 */
	public boolean isAccountExists(int id)
			throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {
		return repository.isAccountExists(id);
	}

	/*
	 * @see com.vti.backend.businesslayer.IAccountService#updateAccountByID(int,
	 * java.lang.String)
	 */
	public void updateAccountByID(int id, String newName)
			throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {
		repository.updateAccountByID(id, newName);

	}

	/*
	 * @see com.vti.backend.businesslayer.IAccountService#deleteAccount(int)
	 */
	public void deleteAccount(int id) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		repository.deleteAccount(id);
	}

}
