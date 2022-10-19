//
package com.vti.backend.businesslayer;

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
 * @create_date: Oct 19, 2022
 * @version: 1.0
 * @modifer: HoanNV
 * @modifer_date: Oct 19, 2022
 */
public class UserService implements IUserService{
	private IUserRepository repository;

	public UserService() {
		repository = new UserRepository();
	}

	/* 
	* @see com.vti.backend.businesslayer.IUserService#getListUsers()
	*/
	public List<User> getListUsers() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		return repository.getListUsers();
	}

	/* 
	* @see com.vti.backend.businesslayer.IUserService#getUser(int)
	*/
	public User getUser(int id) throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {
		return repository.getUser(id);
	}

	/* 
	* @see com.vti.backend.businesslayer.IUserService#deleteUserById(int)
	*/
	public boolean deleteUserById(int id)
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		return repository.deleteUserById(id);
	}

	/* 
	* @see com.vti.backend.businesslayer.IUserService#login(java.lang.String, java.lang.String)
	*/
	public User login(String email, String password)
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		return repository.login(email, password);
	}

	/* 
	* @see com.vti.backend.businesslayer.IUserService#createUser(java.lang.String, java.lang.String, java.lang.String)
	*/
	public void createUser(String fullName, String email, String proSkill)
			throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {
		repository.createUser(fullName, email, proSkill);
	}

}
