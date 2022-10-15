//
package com.vti.backend.bussinesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.entity.User;

/**
 * This class is .
 * 
 * @Description: .
 * @author: HoanNV
 * @create_date: Oct 14, 2022
 * @version: 1.0
 * @modifer: HoanNV
 * @modifer_date: Oct 14, 2022
 */
public interface IUserService {
	List<User> getListUser() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException;

	User getUser(int id) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException;

	void deleteUser(int id) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException;

	public boolean login(String email, String password)
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException;

	public boolean isValidEmailAddress(String email);

	public boolean isNameValid(String name);
}
