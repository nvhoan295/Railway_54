package Bang;

public class Answer {
	public Long id;
	public String content;
	public Question questionID;
	public boolean isCorrect;

	public Answer(Long id, String content, Question questionID, boolean isCorrect) {
		super();
		this.id = id;
		this.content = content;
		this.questionID = questionID;
		this.isCorrect = isCorrect;
	}

}
