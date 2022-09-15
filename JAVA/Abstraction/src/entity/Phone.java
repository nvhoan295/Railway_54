package entity;

public abstract class Phone {
	private String[] contracts;
	private int number;
	private String name;
	
	public abstract void insertContact(String name, String phone);
	public abstract void removeContact(String name);
	public abstract void updateContact(String name, String phone);
	public abstract void searchContract(String name);
	public String[] getContracts() {
		return contracts;
	}
	public int getNumber() {
		return number;
	}
	public String getName() {
		return name;
	}
	public void setContracts(String[] contracts) {
		this.contracts = contracts;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
}
