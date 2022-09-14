package entity;

public class Person {
	private String ten;
	private int tuoi;
	private String queQuan;

	public Person() {
		super();
	}

	public Person(String ten, int tuoi, String queQuan) {
		super();
		this.ten = ten;
		this.tuoi = tuoi;
		this.queQuan = queQuan;
	}

	public String getTen() {
		return ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public String getQueQuan() {
		return queQuan;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}

	@Override
	public String toString() {
		return "Person [ten=" + ten + ", tuoi=" + tuoi + ", queQuan=" + queQuan + "]";
	}

}
