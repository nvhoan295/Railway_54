package com.vti.frontend;

import java.util.List;

import com.vti.Utils.ScannerUtils;
import com.vti.backend.presentationlayer.UserController;
import com.vti.entity.User;

public class Program {
	private static UserController controller = new UserController();
	private static String userName;

	public static void main(String[] args) {
		login();
	}

	public static void Menu() {
		while (true) {
			System.out.println("Xin chào, " + userName);
			System.out.println("===========");
			System.out.println("---- MENU -----");
			System.out.println("1. GetListUser");
			System.out.println("2. Get List User By ID");
			System.out.println("3. Delete User By ID");
			System.out.println("4. CreateUser");
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
				createUser();
				break;
			case 5:
				System.out.println("Thoát");
				return;
			default:
				System.out.println("Nhập lại.");
				break;
			}
		}
	}

	public static void getListUser() {
		try {
			List<User> users = controller.getListUser();
			for (User user : users) {
				infor(user);

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}

	public static void getUserById() {
		try {
			System.out.println("Nhập id: ");
			int id = ScannerUtils.inputId();
			User user = controller.getUser(id);
			infor(user);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void deleteUserById() {

		System.out.println("Nhập id muốn xoá: ");
		int id = ScannerUtils.inputId();
		try {
			controller.deleteUser(id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void infor(User user) {
		System.out.println("ID: " + user.getId());
		System.out.println("FullName: " + user.getFullName());
		System.out.println("Email: " + user.getEmail());
		System.out.println("UserType: " + user.getUserType());
		System.out.println("ProSkill: " + user.getProSkill());
		System.out.println("ExpInYear: " + user.getExpInYear());
		System.out.println("----------");
	}

	public static void login() {
		System.out.println("Vui lòng đăng nhập: ");
		System.out.println("Nhập email: ");
		String email = ScannerUtils.inputEmail();
		System.out.println("Nhập password: ");
		String password = ScannerUtils.inputString();

		try {
			User user = controller.login(email, password);
			if (user == null) {
				System.out.println("Sai email hoặc password");
				login();
			} else {
				userName = user.getFullName();
				Menu();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			login();
		}

	}

	public static void createUser() {
		System.out.println("Thêm mới User");
		System.out.println("Nhập Email mới: ");
		String email = ScannerUtils.inputEmail();
		System.out.println("Nhập FullName mới: ");
		String fullName = ScannerUtils.inputFullName();
		System.out.println("Nhập ProSkill: ");
		String proSkill = ScannerUtils.inputString();

		UserController controller = new UserController();

		try {
			boolean isUser = controller.createUser(fullName, email, proSkill);
			if (isUser) {
				System.out.println("Tạo User thành công");
				getListUser();
			} else {
				System.out.println("Sai rồi. Thử lại");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
