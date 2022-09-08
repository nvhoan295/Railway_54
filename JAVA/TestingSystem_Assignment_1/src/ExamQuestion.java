
public class ExamQuestion {
	private Exam exam;
	private Question question;

	public ExamQuestion(Exam exam, Question question) {
		super();
		this.exam = exam;
		this.question = question;
	}

	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "ExamQuestion [exam=" + exam + ", question=" + question + "]";
	}

	
}
