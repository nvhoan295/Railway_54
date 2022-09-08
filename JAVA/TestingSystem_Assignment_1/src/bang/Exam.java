package bang;

import java.time.LocalDate;

public class Exam {
	private int id;
	private String code;
	private String title;
	private CategoryQuestion categoryQuestion;
	private int Duration;
	private Account creator;
	private LocalDate createDate;

	public Exam(int id, String code, String title, CategoryQuestion categoryQuestion, int duration, Account creator,
			LocalDate createDate) {
		super();
		this.id = id;
		this.code = code;
		this.title = title;
		this.categoryQuestion = categoryQuestion;
		Duration = duration;
		this.creator = creator;
		this.createDate = createDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public CategoryQuestion getCategoryQuestion() {
		return categoryQuestion;
	}

	public void setCategoryQuestion(CategoryQuestion categoryQuestion) {
		this.categoryQuestion = categoryQuestion;
	}

	public int getDuration() {
		return Duration;
	}

	public void setDuration(int duration) {
		Duration = duration;
	}

	public Account getCreator() {
		return creator;
	}

	public void setCreator(Account creator) {
		this.creator = creator;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Exam [id=" + id + ", code=" + code + ", title=" + title + ", categoryQuestion=" + categoryQuestion
				+ ", Duration=" + Duration + ", creator=" + creator + ", createDate=" + createDate + "]";
	}

}
