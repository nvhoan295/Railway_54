package Bang;

import java.time.LocalDate;

public class Question {
	public Long id;
	public String content;
	public CategoryQuestion categoryQuestionID;
	public TypeQuestion typeQuestionID;
	public Account CreatorID;
	public LocalDate createDate;

	public Question(Long id, String content, CategoryQuestion categoryQuestionID, TypeQuestion typeQuestionID,
			Account creatorID, LocalDate createDate) {
		this.id = id;
		this.content = content;
		this.categoryQuestionID = categoryQuestionID;
		this.typeQuestionID = typeQuestionID;
		CreatorID = creatorID;
		this.createDate = createDate;
	}

}
