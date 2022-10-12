package com.vti.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.vti.Utils.JdbcUtils;
import com.vti.entity.Group;

public class GroupRepository {
	private JdbcUtils jdbcUtils;
	

	public GroupRepository() throws FileNotFoundException, IOException {
		jdbcUtils = new JdbcUtils();
	}

	public List<Group> getListGroups() throws ClassNotFoundException, SQLException {
		// Get connection
		List<Group> groups = new ArrayList<Group>();
		Connection connection = jdbcUtils.connect();
		// Register a stament object
		String sql = "Select * from `Group`";
		Statement statement = connection.createStatement();
		// Execute Sql Query
		ResultSet resultSet = statement.executeQuery(sql);
		// Hangling Result set
		while (resultSet.next()) {
			Group group = new Group(resultSet.getInt("GroupID"), resultSet.getString("GroupName"));
			groups.add(group);

		}
		jdbcUtils.disconnect();

		return groups;

	}

}
