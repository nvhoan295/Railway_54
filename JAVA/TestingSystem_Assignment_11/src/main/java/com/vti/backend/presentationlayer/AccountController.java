package com.vti.backend.presentationlayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.businesslayer.AccountService;
import com.vti.backend.businesslayer.IAccountService;
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
public class AccountController {

	private IAccountService service;

	/**
	 * Constructor for class AccountController.
	 * 
	 * @Description: .
	 * @author: HoanNV
	 * @create_date: Oct 13, 2022
	 * @version: 1.0
	 * @modifer: HoanNV
	 * @modifer_date: Oct 13, 2022
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public AccountController() throws FileNotFoundException, IOException {
		service = new AccountService();
	}

	/**
	 * This method is .
	 * 
	 * @Description: .
	 * @author: HoanNV
	 * @create_date: Oct 13, 2022
	 * @version: 1.0
	 * @modifer: HoanNV
	 * @modifer_date: Oct 13, 2022
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public List<Account> getListAccounts() throws ClassNotFoundException, SQLException {
		return service.getListAccounts();
	}

	/**
	 * This method is .
	 * 
	 * @Description: .
	 * @author: HoanNV
	 * @create_date: Oct 13, 2022
	 * @version: 1.0
	 * @modifer: HoanNV
	 * @modifer_date: Oct 13, 2022
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Account getAccountByID(int id) throws Exception {

		return service.getAccountByID(id);
	}

	/**
	 * This method is .
	 * 
	 * @Description: .
	 * @author: HoanNV
	 * @create_date: Oct 13, 2022
	 * @version: 1.0
	 * @modifer: HoanNV
	 * @modifer_date: Oct 13, 2022
	 * @param username
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public boolean isAccountExists(String username) throws ClassNotFoundException, SQLException {
		return service.isAccountExists(username);
	}

	/**
	 * This method is .
	 * 
	 * @Description: .
	 * @author: HoanNV
	 * @create_date: Oct 13, 2022
	 * @version: 1.0
	 * @modifer: HoanNV
	 * @modifer_date: Oct 13, 2022
	 * @param email
	 * @param username
	 * @param fullName
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void createAccount(String email, String username, String fullName)
			throws ClassNotFoundException, SQLException {
		service.createAccount(email, username, fullName);

	}

	/**
	 * This method is .
	 * 
	 * @Description: .
	 * @author: HoanNV
	 * @create_date: Oct 13, 2022
	 * @version: 1.0
	 * @modifer: HoanNV
	 * @modifer_date: Oct 13, 2022
	 * @param id
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public boolean isAccountExists(int id) throws ClassNotFoundException, SQLException {
		return service.isAccountExists(id);
	}

	/**
	 * This method is .
	 * 
	 * @Description: .
	 * @author: HoanNV
	 * @create_date: Oct 13, 2022
	 * @version: 1.0
	 * @modifer: HoanNV
	 * @modifer_date: Oct 13, 2022
	 * @param id
	 * @param newFullName
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void updateAccountByID(int id, String newFullName) throws ClassNotFoundException, SQLException {
		service.updateAccountByID(id, newFullName);

	}

	/**
	 * This method is .
	 * 
	 * @Description: .
	 * @author: HoanNV
	 * @create_date: Oct 13, 2022
	 * @version: 1.0
	 * @modifer: HoanNV
	 * @modifer_date: Oct 13, 2022
	 * @param id
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void deleteAccount(int id) throws ClassNotFoundException, SQLException {
		service.deleteAccount(id);
	}

}
