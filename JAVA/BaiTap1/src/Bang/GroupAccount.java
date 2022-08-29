package Bang;

import java.time.LocalDate;

public class GroupAccount {
	public Long id;
	public Account accountID;
	public LocalDate joinDate;

	public GroupAccount(Long id, Account accountID, LocalDate joinDate) {
		this.id = id;
		this.accountID = accountID;
		this.joinDate = joinDate;
	}

}
