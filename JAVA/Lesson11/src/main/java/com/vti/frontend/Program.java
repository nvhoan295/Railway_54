package com.vti.frontend;

import java.sql.SQLException;
import java.util.List;

import com.vti.backend.presentationlayer.GroupController;
import com.vti.entity.Group;

public class Program {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		List<Group> groups = new GroupController().getGroupsList();
		for (Group group : groups) {
			System.out.println(group);
		}

	}
}
