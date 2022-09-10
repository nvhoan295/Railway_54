package bang;

import java.util.Arrays;
import java.util.Date;

public class GroupAccount {
	private Group id;
	protected Account[] account;
	private Date joinDate;

	public GroupAccount(Group id, Account[] account, Date joinDate) {
		super();
		this.id = id;
		this.account = account;
		this.joinDate = joinDate;
	}

	public Group getId() {
		return id;
	}

	public void setId(Group id) {
		this.id = id;
	}

	public Account[] getAccount() {
		return account;
	}

	public void setAccount(Account[] account) {
		this.account = account;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	@Override
	public String toString() {
		return "GroupAccount [id=" + id + ", account=" + Arrays.toString(account) + ", joinDate=" + joinDate + "]";
	}

}
