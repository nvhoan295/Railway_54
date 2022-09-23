package com.vti.backend;

import java.util.ArrayList;
import java.util.List;

import com.vti.Utils.FileManager;
import com.vti.Utils.IOManager;
import com.vti.entity.*;

public class TaiKhoan {
	public static void main(String[] args) {
		TaiKhoan.ThongTinTaiKhoan();
	}

	public static void arrUser() {
		List<User> users = new ArrayList<>();
		// Tạo User
		User user = new User();
		System.out.println("------- Tạo Tài Khoản -------- ");
		user.input();
		users.add(user);
		// Ghi object User vào file

		try {
			IOManager.writeObject(users, "/Users/nguyenhoan/Desktop/Railway_54/JAVA/AppXoSo/src/com/vti/File/User.ser");
		} catch (Exception e) {
			e.getMessage();
		}

	}

	public static void ThongTinTaiKhoan() {
		// Đọc file object
				try {
					IOManager.readObject("/Users/nguyenhoan/Desktop/Railway_54/JAVA/AppXoSo/src/com/vti/File/User.ser");
				} catch (Exception e) {
					e.getMessage();
				}
	}
}
