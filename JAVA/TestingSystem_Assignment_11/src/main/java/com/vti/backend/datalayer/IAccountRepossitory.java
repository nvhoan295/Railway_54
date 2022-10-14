package com.vti.backend.datalayer;

import java.sql.SQLException;
import java.util.List;

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
public interface IAccountRepossitory {
	

	List<Account> getListAccounts() throws ClassNotFoundException, SQLException;

	Account getAccountByID(int id) throws Exception;

	boolean isAccountExists(String username) throws ClassNotFoundException, SQLException;

	void createAccount(String email, String username, String fullName) throws ClassNotFoundException, SQLException;
	
	boolean isAccountExists(int id) throws ClassNotFoundException, SQLException;

	void updateAccountByID(int id, String newFullName) throws ClassNotFoundException, SQLException;

	void deleteAccount(int id) throws ClassNotFoundException, SQLException;

}
