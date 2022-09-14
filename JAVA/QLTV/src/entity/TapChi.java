package entity;

import java.util.Scanner;

public class TapChi extends TaiLieu {
	private int soPhatHanh;
	private int thangPhatHanh;

	public TapChi() {
	}

	public TapChi(String id, String tenNXB, int soLuong, int soPhatHanh, int thangPhatHanh) {
		super(id, tenNXB, soLuong);
		this.soPhatHanh = soPhatHanh;
		this.thangPhatHanh = thangPhatHanh;
	}

	public int getSoPhatHanh() {
		return soPhatHanh;
	}

	public int getThangPhatHanh() {
		return thangPhatHanh;
	}

	public void setSoPhatHanh(int soPhatHanh) {
		this.soPhatHanh = soPhatHanh;
	}

	public void setThangPhatHanh(int thangPhatHanh) {
		this.thangPhatHanh = thangPhatHanh;
	}

	@Override
	public void input() {
		super.input();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số phát hành: ");
		soPhatHanh = scanner.nextInt();
		System.out.println("Nhập tháng phát hành: ");
		thangPhatHanh = scanner.nextInt();
	}

	@Override
	public String toString() {
		return "TapChi [soPhatHanh=" + soPhatHanh + ", thangPhatHanh=" + thangPhatHanh + ", getId()=" + getId()
				+ ", getTenNXB()=" + getTenNXB() + ", getSoLuong()=" + getSoLuong() + "]";
	}

}
