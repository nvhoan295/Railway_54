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

	public User login(String email, String password) throws Exception {

		if (password.length() < 6 || password.length() > 12) {
			throw new Exception("Vui lòng nhập password từ 6 đến 12 ký tự");
		}

		return service.login(email, password);

	}

	public boolean isValidEmailAddress(String email) {
		return service.isValidEmailAddress(email);
	}

	public boolean isNameValid(String name) {
		return service.isNameValid(name);
	}

	public boolean createUser(String fullName, String email, String proSkill) throws Exception {
		return service.createUser(fullName, email, proSkill);

	}

	public static boolean checkFullName(String name) {

		String regexPattern = "^[a-zA-Z\\s]*$";
		Pattern pattern = Pattern.compile(regexPattern);
		Matcher matcher = pattern.matcher(name);

		return matcher.matches();
	}
}
