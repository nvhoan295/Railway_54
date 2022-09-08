import java.time.LocalDate;
import java.util.Arrays;

public class GroupAccount {
	private Group id;
	protected Account[] account;
	private LocalDate joinDate;

	public GroupAccount(Group id, Account[] account, LocalDate joinDate) {
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

	public LocalDate getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}

	@Override
	public String toString() {
		return "GroupAccount [id=" + id + ", account=" + Arrays.toString(account) + ", joinDate=" + joinDate + "]";
	}

	
}
