//
package com.vti.backend.businesslayer;

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
 * @create_date: Oct 21, 2022
 * @version: 1.0
 * @modifer: HoanNV
 * @modifer_date: Oct 21, 2022
 */
public interface IUserService {

	public User getUser(int projectId) throws SQLException, ClassNotFoundException, FileNotFoundException, IOException;

	public List<User> getListUsers() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException;

	public User login(String email, String password)
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException;
}
