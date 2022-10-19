//
package com.vti.backend.bussinesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.IUserRepository;
import com.vti.backend.datalayer.UserRepository;
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
public class UserService implements IUserService {
	private IUserRepository repository;

	/**
	 * Constructor for class UserService.
	 * 
	 * @Description: .
	 * @author: HoanNV
	 * @create_date: Oct 14, 2022
	 * @version: 1.0
	 * @modifer: HoanNV
	 * @modifer_date: Oct 14, 2022
	 * @param repository
	 */
	public UserService() {
		repository = new UserRepository();
	}

	/*
	 * @see com.vti.backend.bussinesslayer.IUserService#getListUser()
	 */
	public List<User> getListUser() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		return repository.getListUser();
	}

	/*
	 * @see com.vti.backend.bussinesslayer.IUserService#getUser(int)
	 */
	public User getUser(int id) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		return repository.getUser(id);
	}

	/*
	 * @see com.vti.backend.bussinesslayer.IUserService#deleteUser(int)
	 */
	public void deleteUser(int id) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		repository.deleteUser(id);
	}

	/*
	 * @see
	 * com.vti.backend.bussinesslayer.IUserService#isValidEmailAddress(java.lang.
	 * String)
	 */
	public boolean isValidEmailAddress(String email) {
		return repository.isValidEmailAddress(email);
	}

	/*
	 * @see
	 * com.vti.backend.bussinesslayer.IUserService#isNameValid(java.lang.String)
	 */
	public boolean isNameValid(String name) {
		return repository.isNameValid(name);
	}

	/*
	 * @see com.vti.backend.bussinesslayer.IUserService#login(java.lang.String,
	 * java.lang.String)
	 */
	public User login(String email, String password)
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		return repository.login(email, password);
	}

	/*
	 * @see com.vti.backend.bussinesslayer.IUserService#updateUser(int,
	 * java.lang.String, java.lang.String, java.lang.String, java.lang.String,
	 * java.lang.String, java.lang.String)
	 */
	public boolean updateUser(int id, String fullName, String email, String password, String position, String proSkill,
			String expInYear) throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {
		return repository.updateUser(id, fullName, email, password, position, proSkill, expInYear);
	}

	/*
	 * @see com.vti.backend.bussinesslayer.IUserService#createUser(java.lang.String,
	 * java.lang.String, java.lang.String, java.lang.String, java.lang.String,
	 * java.lang.String)
	 */
	public boolean createUser(String fullName, String email, String proSkill)
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		String position = "EMPLOYEE";
		String password = "123456";

		return repository.createUser(fullName, email, password, position, proSkill);
	}

}
