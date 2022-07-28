package Bang;

public class Position {
	private int PositionID;
	private PositionEnum PositionName;
	public Position(int positionID, PositionEnum positionName) {
		super();
		PositionID = positionID;
		PositionName = positionName;
	}
	public int getPositionID() {
		return PositionID;
	}
	public void setPositionID(int positionID) {
		PositionID = positionID;
	}
	public PositionEnum getPositionName() {
		return PositionName;
	}
	public void setPositionName(PositionEnum positionName) {
		PositionName = positionName;
	}
	
	
	
}
