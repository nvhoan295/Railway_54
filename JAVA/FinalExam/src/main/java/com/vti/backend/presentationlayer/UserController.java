//
package com.vti.backend.presentationlayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.vti.backend.bussinesslayer.IUserService;
import com.vti.backend.bussinesslayer.UserService;
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
public class UserController {
	private IUserService service;

	/**
	 * Constructor for class UserController.
	 * 
	 * @Description: .
	 * @author: HoanNV
	 * @create_date: Oct 14, 2022
	 * @version: 1.0
	 * @modifer: HoanNV
	 * @modifer_date: Oct 14, 2022
	 * @param service
	 */
	public UserController() {
		service = new UserService();
	}

	public List<User> getListUser() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		return service.getListUser();
	}

	public User getUser(int id) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		return service.getUser(id);
	}

	public void deleteUser(int id) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		service.deleteUser(id);
	}

	public boolean login(String email, String password)
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {

		try {
			String regex = "[A-Z]";
			Pattern pattern = Pattern.compile(regex);

			Matcher matcher = pattern.matcher(regex);

			if (password == null || password.length() <= 6 || password.length() >= 12 || matcher.matches()) {
				throw new Exception("Password must have between 6-12 characters and at least 1 uppercase letter");
			}
			if (!isValidEmailAddress(email)) {
				throw new Exception("Invalid email format!");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return service.login(email, password);

	}

	public boolean isValidEmailAddress(String email) {
		return service.isValidEmailAddress(email);
	}

	public boolean isNameValid(String name) {
		return service.isNameValid(name);
	}
}
