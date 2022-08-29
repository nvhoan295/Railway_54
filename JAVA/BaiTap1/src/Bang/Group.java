package Bang;

import java.time.LocalDate;

public class Group extends coBan{
	public Long creatorID;
	public LocalDate createDate;
	public Account[] accounts;

	public Group(Long id, String name, Long creatorID, LocalDate createDate) {
		super(id, name);
		this.creatorID = creatorID;
		this.createDate = createDate;
	}
}
