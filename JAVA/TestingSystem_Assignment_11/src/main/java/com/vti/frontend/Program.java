package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.presentationlayer.GroupController;
import com.vti.entity.Group;

/**
 * This class is . 
 * 
 * @Description: .
 * @author: HoanNV
 * @create_date: Oct 13, 2022
 * @version: 1.0
 * @modifer: HoanNV
 * @modifer_date: Oct 13, 2022
 */
public class Program {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		GroupController controller = new GroupController();
		List<Group> groups = controller.getListGroups();
		for (Group group : groups) {
			System.out.println(group);
		}
	}
}
