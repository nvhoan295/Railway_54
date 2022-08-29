package Bang;

public class Exam {
	public Long id;
	public String code;
	public String title;
	public String CategoryID;
	public int Duration;
	public Account CreatorID;
	public String CreateDate;

	public Exam(Long id, String code, String title, String categoryID, int duration, Account creatorID,
			String createDate) {
		super();
		this.id = id;
		this.code = code;
		this.title = title;
		CategoryID = categoryID;
		Duration = duration;
		CreatorID = creatorID;
		CreateDate = createDate;
	}

}
