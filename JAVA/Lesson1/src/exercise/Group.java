package exercise;

import java.time.LocalDate;

public class Group {
	public int id;
	public String name;
	public Account creator;
	public LocalDate createDate;
	public Account[] accounts;

	public Group(int id, String name, Account creator, LocalDate createDate, Account[] accounts) {
		super();
		this.id = id;
		this.name = name;
		this.creator = creator;
		this.createDate = createDate;
		this.accounts = accounts;
	}

}

//thêm thuộc tính Account[] để lưu tất cả các Account có trong group