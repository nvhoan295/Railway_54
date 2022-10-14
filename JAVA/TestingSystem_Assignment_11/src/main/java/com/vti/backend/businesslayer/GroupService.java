package com.vti.backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.GroupRepository;
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
public class GroupService {
	private GroupRepository repository;
	
	
	public GroupService() throws FileNotFoundException, IOException {
		repository = new GroupRepository();
	}
	
	
	public List<Group> getListGroups() throws ClassNotFoundException, SQLException {
		return repository.getListGroups();
	}
}
