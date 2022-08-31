package exercise;

public class Answer {
	public int id;
	public String content;
	public Question questionID;
	public boolean isCorrect;

	public Answer(int id, String content, Question questionID, boolean isCorrect) {
		super();
		this.id = id;
		this.content = content;
		this.questionID = questionID;
		this.isCorrect = isCorrect;
	}

}
