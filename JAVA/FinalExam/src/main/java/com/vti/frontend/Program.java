package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.Utils.ScannerUtils;
import com.vti.backend.datalayer.UserRepository;
import com.vti.entity.User;

public class Program {
	public static void main(String[] args) {
		question3();
	}
	public static void question2(){
		try {
			List<User> users = new UserRepository().getListUser();
			for (User user : users) {
				System.out.println("ID: "+ user.getId());
				System.out.println("FullName: "+ user.getFullName());
				System.out.println("Email: "+ user.getEmail());
				System.out.println("----------");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
	}
	
	public static void question3() {
		try {
			System.out.println("Nhập id: ");
			int id = ScannerUtils.inputId();
			User user = new UserRepository().getUser(id);
			System.out.println("ID: "+ user.getId());
			System.out.println("FullName: "+ user.getFullName());
			System.out.println("Email: "+ user.getEmail());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void question4() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		UserRepository repository = new UserRepository();
		System.out.println("Nhập id muốn xoá: ");
		int id = ScannerUtils.inputId();
		repository.deleteUser(id);
	}
}
