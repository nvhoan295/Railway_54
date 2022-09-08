package bang;
import java.time.LocalDate;

public class Question {
	private int id;
	private String content;
	private CategoryQuestion categoryQuestion;
	private TypeQuestion typeQuestion;
	private Account creator;
	private LocalDate createDate;

	public Question(int id, String content, CategoryQuestion categoryQuestion, TypeQuestion typeQuestion,
			Account creator, LocalDate createDate) {
		super();
		this.id = id;
		this.content = content;
		this.categoryQuestion = categoryQuestion;
		this.typeQuestion = typeQuestion;
		this.creator = creator;
		this.createDate = createDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public CategoryQuestion getCategoryQuestion() {
		return categoryQuestion;
	}

	public void setCategoryQuestion(CategoryQuestion categoryQuestion) {
		this.categoryQuestion = categoryQuestion;
	}

	public TypeQuestion getTypeQuestion() {
		return typeQuestion;
	}

	public void setTypeQuestion(TypeQuestion typeQuestion) {
		this.typeQuestion = typeQuestion;
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
		return "Question [id=" + id + ", content=" + content + ", categoryQuestion=" + categoryQuestion
				+ ", typeQuestion=" + typeQuestion + ", creator=" + creator + ", createDate=" + createDate + "]";
	}

	
}
