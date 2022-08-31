package exercise;

public class TypeQuestion {
	public int id;
	public TypeName name;

	public enum TypeName {
		Essay, Multiple_Choice
	}

	public TypeQuestion(int id, TypeName name) {
		super();
		this.id = id;
		this.name = name;
	}

}
