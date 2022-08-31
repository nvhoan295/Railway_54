package exercise;

public class Position {
	public int id;
	public PositionName name;

	public enum PositionName {
		DEV, TEST, SCRUM_MASTER, PM
	}

	public Position(int id, PositionName name) {
		super();
		this.id = id;
		this.name = name;
	}

}
