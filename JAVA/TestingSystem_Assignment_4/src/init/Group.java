package init;
//Question 3:

//Tạo constructor cho Group:
//a) không có parameters
//b) Có các parameter là GroupName, Creator, array Account[]
//accounts, CreateDate
//c) Có các parameter là GroupName, Creator, array String[]
//usernames , CreateDate
//Với mỗi username thì sẽ khởi tạo 1 Account (chỉ có thông tin
//username, các thông tin còn lại = null).
//Khởi tạo 1 Object với mỗi constructor ở trên

import java.util.Date;

public class Group {
	private String name;
	private Account Creator;
	private Account[] accounts;
	private Date createDate;
	protected String[] userName;

// Câu a
	public Group() {
	}

// Câu b

	public Group(String name, Account creator, Account[] accounts, Date createDate) {

		this.name = name;
		Creator = creator;
		this.accounts = accounts;
		this.createDate = createDate;
	}

// Câu c
	public Group(String name, Account creator, Date createDate, String[] userName) {

		this.name = name;
		Creator = creator;
		this.createDate = createDate;
		this.userName = userName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getCreator() {
		return Creator;
	}

	public void setCreator(Account creator) {
		Creator = creator;
	}

	public Account[] getAccounts() {
		return accounts;
	}

	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String[] getUserName() {
		return userName;
	}

	public void setUserName(String[] userName) {
		this.userName = userName;
	}
	

}
