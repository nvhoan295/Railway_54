package bang;

public class TypeQuestion {
	private int id;
	private TypeName name;

	public enum TypeName {
		ESSAY, MULTIPLE_CHOICE
	}

	public TypeQuestion(int id, TypeName name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public TypeName getName() {
		return name;
	}

	public void setName(TypeName name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "TypeQuestion [id=" + id + ", name=" + name + "]";
	}

}
