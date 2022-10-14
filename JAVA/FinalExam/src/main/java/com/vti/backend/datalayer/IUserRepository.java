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
 * @create_date: Oct 14, 2022
 * @version: 1.0
 * @modifer: HoanNV
 * @modifer_date: Oct 14, 2022
 */
public interface IUserRepository {
	List<User> getListUser() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException;
	User getUser(int id) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException;
	void deleteUser(int id) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException;
}
