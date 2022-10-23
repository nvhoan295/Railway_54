//
package com.vti.backend.presentationlayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.businesslayer.IUserService;
import com.vti.backend.businesslayer.UserService;
import com.vti.entity.User;

/**
 * This class is .
 * 
 * @Description: .
 * @author: HoanNV
 * @create_date: Oct 21, 2022
 * @version: 1.0
 * @modifer: HoanNV
 * @modifer_date: Oct 21, 2022
 */
public class UserController {
	private IUserService service;

	/**
	 * Constructor for class UserController.
	 * 
	 * @Description: .
	 * @author: HoanNV
	 * @create_date: Oct 21, 2022
	 * @version: 1.0
	 * @modifer: HoanNV
	 * @modifer_date: Oct 21, 2022
	 */
	public UserController() {
		service = new UserService();
	}

	public User getUser(int projectId) throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {
		return service.getUser(projectId);
	}

	public List<User> getListUsers() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		return service.getListUsers();
	}

	public User login(String email, String password)
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		return service.login(email, password);
	}

	public List<User> getListUsersByProjectID(int projectId)
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		return service.getListUsersByProjectID(projectId);
	}

}
