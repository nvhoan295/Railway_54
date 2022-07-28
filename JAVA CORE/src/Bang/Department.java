package Bang;

public class Department {
	private int DepartmentID;
	private String DepartmentName;
	
	public Department(int departmentID, String departmentName) {
		super();
		DepartmentID = departmentID;
		DepartmentName = departmentName;
	}

	public int getDepartmentID() {
		return DepartmentID;
	}

	public void setDepartmentID(int departmentID) {
		DepartmentID = departmentID;
	}

	public String getDepartmentName() {
		return DepartmentName;
	}

	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}
	
	
}
