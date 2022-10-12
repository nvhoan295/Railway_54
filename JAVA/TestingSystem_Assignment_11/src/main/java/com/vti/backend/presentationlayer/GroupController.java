package com.vti.backend.presentationlayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.businesslayer.GroupService;
import com.vti.entity.Group;

public class GroupController {
	private GroupService service;
	
	public GroupController() throws FileNotFoundException, IOException {
		service = new GroupService();
	}
	
	public List<Group> getListGroups() throws ClassNotFoundException, SQLException {
		return service.getListGroups();
	}

}
