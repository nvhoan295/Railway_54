package com.vti.backend.presentationlayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.backend.bussinesslayer.GroupService;
import com.vti.entity.Group;

public class GroupController {
	private GroupService service;
	private List<Group> groups;

	public GroupController() {
		this.service = new GroupService();
		
	}

	public List<Group> getGroupsList() throws ClassNotFoundException, SQLException {
		
		groups = service.getGroupsList();
		return groups;
	}
}
