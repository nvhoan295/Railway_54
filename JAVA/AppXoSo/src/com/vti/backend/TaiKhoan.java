package com.vti.backend;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.vti.Utils.FileManager;
import com.vti.Utils.IOManager;
import com.vti.entity.User;

public class TaiKhoan {
	public static void main(String[] args) throws Exception {
		arrUser();
//		ThongTinTaiKhoan();
		docFile();
	}

	public static void arrUser() throws Exception {

		User user = new User();
		System.out.println("------- Tạo Tài Khoản -------- ");
		user.input();

		// Ghi dữ liệu vào file
		try {
			FileManager.createNewFile("/Users/nguyenhoan/Desktop/Railway_54/JAVA/AppXoSo/src/com/vti/File/taikhoan.txt");
		} catch (Exception e) {
			
		}

		IOManager.writeFile("/Users/nguyenhoan/Desktop/Railway_54/JAVA/AppXoSo/src/com/vti/File/taikhoan.txt","UserName: " + user.getUserName()+ "\n", true);
		IOManager.writeFile("/Users/nguyenhoan/Desktop/Railway_54/JAVA/AppXoSo/src/com/vti/File/taikhoan.txt","PassWord: " + user.getPassword("abc")+ "\n" , true);
		
		
		
		
		
		
		
		
		
	}

	public static void ThongTinTaiKhoanobj() throws Exception {
		// Đọc file object

		FileInputStream fileInputStream = new FileInputStream(
				"/Users/nguyenhoan/Desktop/Railway_54/JAVA/AppXoSo/src/com/vti/File/User.ser");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Object object = objectInputStream.readObject();
		User user = (User) object;
		System.out.println(user.getUserName());
		System.out.println(user.getPassword("acb"));

	}
	public static void docFile() throws Exception {
		IOManager.readFile("/Users/nguyenhoan/Desktop/Railway_54/JAVA/AppXoSo/src/com/vti/File/taikhoan.txt");
	}

}
