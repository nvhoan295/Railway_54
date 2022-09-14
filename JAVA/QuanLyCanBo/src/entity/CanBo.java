package entity;

import java.util.Scanner;

public class CanBo {
	private String hoTen;
	private int tuoi;
	private GioiTinh gioiTinh;
	private String diaChi;
	
	public enum GioiTinh {
		Nam, Nữ
	}

	public CanBo() {
	
	}

	public void nhapLieu() {
		Scanner scanner = new Scanner(System.in);
		hoTen = scanner.next();
		
	}

}
