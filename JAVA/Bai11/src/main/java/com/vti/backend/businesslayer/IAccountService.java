//
package com.vti.backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
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
public interface IAccountService {
	List<Account> getListAccounts() throws SQLException, ClassNotFoundException, FileNotFoundException, IOException;

	Account getAccountByID(int id) throws SQLException, ClassNotFoundException, FileNotFoundException, IOException;

	boolean isAccountExists(String username) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException;

	void createAccount(String email, String username, String fullName, int departmentId) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException;

	boolean isAccountExists(int id) throws SQLException, ClassNotFoundException, FileNotFoundException, IOException;

	void updateAccountByID(int id, String newName) throws SQLException, ClassNotFoundException, FileNotFoundException, IOException;

	void deleteAccount(int id) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException;
}
