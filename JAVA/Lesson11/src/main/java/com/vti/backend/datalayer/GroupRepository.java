package com.vti.backend.datalayer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.vti.Utils.JdbcUtils;
import com.vti.entity.Group;

public class GroupRepository {
	private JdbcUtils jdbcUtils;

	private Connection connection;

	public GroupRepository() {

		jdbcUtils = new JdbcUtils();

	}

	public List<Group> getGroupsList() throws ClassNotFoundException, SQLException {
		List<Group> groups = new ArrayList<Group>();
		connection = jdbcUtils.connect();
		String sql = "Select * from `Group`";
		Statement statement = connection.createStatement();
		//
		ResultSet resultSet = statement.executeQuery(sql);
		while (resultSet.next()) {
			Group group = new Group(resultSet.getInt("GroupID"), resultSet.getString("GroupName"));
			groups.add(group);
		}
		jdbcUtils.disconnect();
		return groups;

	}

}
