//
package com.vti.frontend;

import java.util.ArrayList;
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
 * @create_date: Oct 19, 2022
 * @version: 1.0
 * @modifer: HoanNV
 * @modifer_date: Oct 19, 2022
 */
public class Program {
	static List<User> users = new ArrayList<User>();
	static UserController controller = new UserController();
	static User user = null;

	public static void main(String[] args) {
		login();

	}

	public static void Menu() {
		while (true) {
			System.out.println("****************");
			System.out.println("--- Xin Chào ----");
			System.out.println("1. GetListUser");
			System.out.println("2. GetUserById");
			System.out.println("3. Create User");
			System.out.println("4. Delete User By Id");
			System.out.println("5. Thoát");
			System.out.print("Mời nhập: ");
			int choose = ScannerUtils.inputInt();
			switch (choose) {
			case 1:
				getListUser();
				break;
			case 2:
				getUserByID();
				break;
			case 3:
				createUser();

				break;
			case 4:
				deleteUserByID();
				break;
			case 5:
				System.out.println("Thoát. Tạm biệt");
				return;
			default:
				System.out.println("Nhập lại:");
				break;
			}

		}
	}

	public static void getListUser() {
		try {
			
			users = controller.getListUsers();
			for (User user : users) {
				infor(user);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void getUserByID() {
		try {
			System.out.println("Nhập Id: ");
			int id = ScannerUtils.inputInt();
			User user = controller.getUser(id);
			infor(user);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void deleteUserByID() {
		try {
			System.out.println("Nhập ID: ");
			int id = ScannerUtils.inputInt();
			boolean check = controller.deleteUserById(id);
			if (check) {
				System.out.println("Delete Compele");
			} else {
				System.out.println("Delete False");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void infor(User user) {
		System.out.println("ID: " + user.getId());
		System.out.println("FullName: " + user.getFullName());
		System.out.println("Email: " + user.getEmail());
		System.out.println("Position: " + user.getPosition());
		System.out.println("ProSkill: " + user.getProSkill());
		System.out.println("ExpInYear: " + user.getExpInYear());
		System.out.println("-------");
	}

	public static void login() {
		try {
			System.out.println(" --- Đăng nhập --- ");
			System.out.println("Nhập Email: ");
			String email = ScannerUtils.inputEmail();
			System.out.println("Nhập password: ");
			String password = ScannerUtils.inputString();

			user = controller.login(email, password);

			if (user == null) {
				System.out.println("Sai email hoặc password. Đăng nhập lại: ");
				login();

			} else {
				System.out.println("Đăng nhập thành công");
				System.out.println("Xin chào, " + user.getFullName());
				Menu();
			}

		} catch (Exception e) {
			System.out.println("Đăng nhập lại");
			login();
		}

	}

	public static void createUser() {
		try {
			if (user.getPosition().equals("ADMIN")) {
				System.out.println("Bạn là Admin");
				System.out.println("Mời tạo User");
				System.out.print("Nhập FullName: ");
				String fullName = ScannerUtils.inputFullName();
				System.out.print("Nhập Email: ");
				String email = ScannerUtils.inputEmail();
				System.out.println("Nhập ProSkill: ");
				String proSkill = ScannerUtils.inputString();
				controller.createUser(fullName, email, proSkill);
				getListUser();
			} else {
				System.out.println("Bạn không phải Admin. Quay lại");
				Menu();
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Menu();
		}

	}

}
