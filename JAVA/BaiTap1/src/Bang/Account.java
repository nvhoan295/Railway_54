package Bang;

import java.time.LocalDate;

public class Account extends coBan {
	public String email;
	public String userName;
	public Department departmentID;
	public Position positionID;
	public LocalDate createDate;
	public Group[] groups;

	public Account(Long id, String name, String email, String userName, Department departmentID, Position positionID,
			LocalDate createDate) {
		super(id, name);
		this.email = email;
		this.userName = userName;
		this.departmentID = departmentID;
		this.positionID = positionID;
		this.createDate = createDate;
	}

}
