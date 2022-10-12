package com.vti.entity;

public class Group {
	private int GroupID;
	private String GroupName;

	public Group(int groupID, String groupName) {
		GroupID = groupID;
		GroupName = groupName;
	}

	public int getGroupID() {
		return GroupID;
	}

	public String getGroupName() {
		return GroupName;
	}

	public void setGroupID(int groupID) {
		GroupID = groupID;
	}

	public void setGroupName(String groupName) {
		GroupName = groupName;
	}

	@Override
	public String toString() {
		return "Group [GroupID=" + GroupID + ", GroupName=" + GroupName + "]";
	}
	
	

}
