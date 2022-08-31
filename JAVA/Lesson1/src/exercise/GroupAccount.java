package exercise;

import java.time.LocalDate;

public class GroupAccount {
	public Group id;
	public Account accountId;
	public LocalDate joinDate;

	public GroupAccount(Group id, Account accountId, LocalDate joinDate) {
		super();
		this.id = id;
		this.accountId = accountId;
		this.joinDate = joinDate;
	}

}
