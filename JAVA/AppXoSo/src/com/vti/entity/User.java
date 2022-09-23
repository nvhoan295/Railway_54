package com.vti.entity;

import java.io.Serializable;

import com.vti.Utils.ScannerUtils;

public class User implements Serializable{
	private String userName;
	private String passWord;
	private double soDu;
	
	
	

	public void input() {
		System.out.print("Nhập userName: ");
		userName = ScannerUtils.inputString();
		System.out.print("Nhập PassWord: ");
		passWord = ScannerUtils.inputString();
		soDu = 0;
	}

	public void napTien() {
		System.out.println("Số tiền bạn muốn nạp: ");
		double tienNap = ScannerUtils.inputDouble();

		soDu += tienNap;
		System.out.println("Số dư Tài khoản hiện có: " + soDu);

	}

	public String getUserName() {
		return userName;
	}

	public String getPassword(String pass) {
		if (pass == "abc") {
			return passWord;
		}
		return "";
	}

	public double getSoDu() {
		return soDu;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.passWord = password;
	}

	public void setSoDu(double soDu) {
		this.soDu = soDu;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + "]";
	}
	
	

}
