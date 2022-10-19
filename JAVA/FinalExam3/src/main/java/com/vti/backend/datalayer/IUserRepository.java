//
package com.vti.backend.datalayer;

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
 * @create_date: Oct 19, 2022
 * @version: 1.0
 * @modifer: HoanNV
 * @modifer_date: Oct 19, 2022
 */
public interface IUserRepository {

	public List<User> getListUsers() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException;

	public User getUser(int id) throws SQLException, ClassNotFoundException, FileNotFoundException, IOException;

	public boolean deleteUserById(int id) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException;

	public User login(String email, String password) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException;

	public void createUser(String fullName, String email, String proSkill) throws SQLException, ClassNotFoundException, FileNotFoundException, IOException;

}
