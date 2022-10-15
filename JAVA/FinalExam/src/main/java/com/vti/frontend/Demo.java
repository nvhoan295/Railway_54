//
package com.vti.frontend;

import java.util.List;

import com.vti.Utils.ScannerUtils;
import com.vti.backend.datalayer.UserRepository;
import com.vti.backend.presentationlayer.UserController;
import com.vti.entity.User;

/**
 * This class is .
 * 
 * @Description: .
 * @author: HoanNV
 * @create_date: Oct 15, 2022
 * @version: 1.0
 * @modifer: HoanNV
 * @modifer_date: Oct 15, 2022
 */
public class Demo {
	public static void main(String[] args) {

		while (true) {
			System.out.println("Nhập Email: ");
			String email = ScannerUtils.inputEmail();
			System.out.println("Nhập password: ");
			String password = ScannerUtils.inputString();
			boolean isLogin = new UserRepository().login(email, password);
			if (!isLogin) {
				System.out.println("Nhập sai. Nhập lại...");
			}
			while (isLogin) {
				System.out.println("===========");
				System.out.println("----- MENU -----");
				System.out.println("1. GetListUser");
				System.out.println("2. Get List User By ID");
				System.out.println("3. Delete User By ID");
				System.out.println("4. Thoát");
				System.out.print("Mời bạn nhập: ");
				int choose = ScannerUtils.inputInt();
				switch (choose) {
				case 1:
					getListUser();
					break;
				case 2:
					getUserById();
					break;
				case 3:
					deleteUserById();
					break;
				case 4:
					System.out.println("Thoát");
					return;
				default:
					System.out.println("Nhập lại.");
					break;
				}
			}
		}
	}

	public static void getListUser() {
		try {
			List<User> users = new UserController().getListUser();
			for (User user : users) {
				System.out.println("ID: " + user.getId());
				System.out.println("FullName: " + user.getFullName());
				System.out.println("Email: " + user.getEmail());
				System.out.println("UserType: " + user.getUserType());
				System.out.println("ProSkill: " + user.getProSkill());
				System.out.println("ExpInYear: " + user.getExpInYear());
				System.out.println("----------");

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}

	public static void getUserById() {
		try {
			System.out.println("Nhập id: ");
			int id = ScannerUtils.inputId();
			User user = new UserController().getUser(id);
			System.out.println("ID: " + user.getId());
			System.out.println("FullName: " + user.getFullName());
			System.out.println("Email: " + user.getEmail());
			System.out.println("UserType: " + user.getUserType());
			System.out.println("ProSkill: " + user.getProSkill());
			System.out.println("ExpInYear: " + user.getExpInYear());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void deleteUserById() {

		System.out.println("Nhập id muốn xoá: ");
		int id = ScannerUtils.inputId();
		try {
			new UserController().deleteUser(id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
