//
package com.vti.backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.IUserRepository;
import com.vti.backend.datalayer.UserRepository;
import com.vti.entity.User;

public class UserService implements IUserService{
	private IUserRepository repository;
	
	
	

	/**
	 * Constructor for class UserService.
	 * 
	 * @Description: .
	 * @author: HoanNV
	 * @create_date: Oct 21, 2022
	 * @version: 1.0
	 * @modifer: HoanNV
	 * @modifer_date: Oct 21, 2022
	 * @param repository
	 */
	public UserService() {
		repository = new UserRepository();
	}

	/* 
	* @see com.vti.backend.businesslayer.IUserService#getUser(int)
	*/
	public User getUser(int projectId) throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {
		return repository.getUser(projectId);
	}

	/* 
	* @see com.vti.backend.businesslayer.IUserService#getListUsers()
	*/
	public List<User> getListUsers() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		return repository.getListUsers();
	}

	/* 
	* @see com.vti.backend.businesslayer.IUserService#login(java.lang.String, java.lang.String)
	*/
	public User login(String email, String password)
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		return repository.login(email, password);
	}

}
