//
package com.vti.backend.presentationlayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.businesslayer.IUserService;
import com.vti.backend.businesslayer.UserService;
import com.vti.entity.User;

public class UserController {
	private IUserService service;

	public UserController() {
		service = new UserService();
	}

	
	public List<User> getListUsers() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		return service.getListUsers();
	}

	/*
	 * @see com.vti.backend.businesslayer.IUserService#getUser(int)
	 */
	public User getUser(int id) throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {
		return service.getUser(id);
	}

	/*
	 * @see com.vti.backend.businesslayer.IUserService#deleteUserById(int)
	 */
	public boolean deleteUserById(int id)
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		return service.deleteUserById(id);
	}

	/*
	 * @see com.vti.backend.businesslayer.IUserService#login(java.lang.String,
	 * java.lang.String)
	 */
	public User login(String email, String password)
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		return service.login(email, password);
	}

	/*
	 * @see com.vti.backend.businesslayer.IUserService#createUser(java.lang.String,
	 * java.lang.String, java.lang.String)
	 */
	public void createUser(String fullName, String email, String proSkill)
			throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {
		service.createUser(fullName, email, proSkill);
	}

}
