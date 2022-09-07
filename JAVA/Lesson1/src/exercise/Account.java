package exercise;

import java.time.LocalDate;

import javax.swing.GroupLayout.Group;

public class Account {
	public int id;
	public String email;
	public String userName;
	public String fullName;
	public Department departmentID;
	public Position positionID;
	public LocalDate createDate;
	public float luong;
	public exercise.Group[] groups;
	
	

	public Account() {
		super();
	}



	public Account(int id, String email, String userName, String fullName, Department departmentID, Position positionID,
			LocalDate createDate) {
		super();
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
		this.departmentID = departmentID;
		this.positionID = positionID;
		this.createDate = createDate;
	}

}
