package com.vti.backend.bussinesslayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.GroupRepository;
import com.vti.entity.Group;

public class GroupService {
	private GroupRepository repository;
	private List<Group> groups;

	public GroupService() {
		repository = new GroupRepository();
	}

	public List<Group> getGroupsList() throws ClassNotFoundException, SQLException {
		groups = repository.getGroupsList();
		return groups;
	}

}
