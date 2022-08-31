package exercise;

import java.time.LocalDate;

public class Question {
	public int id;
	public String content;
	public CategoryQuestion categoryId;
	public TypeQuestion typeId;
	public Account creatorId;
	public LocalDate createDate;

	public Question(int id, String content, CategoryQuestion categoryId, TypeQuestion typeId, Account creatorId,
			LocalDate createDate) {
		super();
		this.id = id;
		this.content = content;
		this.categoryId = categoryId;
		this.typeId = typeId;
		this.creatorId = creatorId;
		this.createDate = createDate;
	}

}
