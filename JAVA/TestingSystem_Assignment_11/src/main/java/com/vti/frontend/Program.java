package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.presentationlayer.GroupController;
import com.vti.entity.Group;

public class Program {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		GroupController controller = new GroupController();
		List<Group> groups = controller.getListGroups();
		for (Group group : groups) {
			System.out.println(group);
		}
	}
}
