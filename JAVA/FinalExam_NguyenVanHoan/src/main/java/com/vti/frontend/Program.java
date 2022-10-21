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
			System.out.println("1. Get User By ProjectId");
			System.out.println("2. Get List User Manager");
			System.out.println("3. Thoát");
			System.out.print("Mời nhập: ");
			int choose = ScannerUtils.inputInt();
			switch (choose) {
			case 1:
				getUserByProjectId();

				break;
			case 2:
				getListUserManager();
				break;
			case 3:
				System.out.println("Thoát. Tạm biệt");
				return;
			default:
				System.out.println("Nhập lại:");
				break;
			}

		}
	}

	/**
	 * This method is .
	 * 
	 * @Description: .
	 * @author: HoanNV
	 * @create_date: Oct 21, 2022
	 * @version: 1.0
	 * @modifer: HoanNV
	 * @modifer_date: Oct 21, 2022
	 */

//	2. Viết function để user nhập vào id project, sau đó in ra tất cả các employee
//	trong project đó (in ra dạng table)
	public static void getUserByProjectId() {
		try {
			System.out.println("Nhập ProjectId: ");
			int projectId = ScannerUtils.inputInt();
			User user = controller.getUser(projectId);
			infor(user);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

//	3. Viết function để user có thể lấy ra tất cả Manager của các project (in ra dạng table)

	public static void getListUserManager() {
		try {
			users = controller.getListUsers();
			for (User user : users) {
				if (user.getRole().equals("MANAGER")) {
					infor(user);
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void infor(User user) {
		System.out.println("ID: " + user.getId());
		System.out.println("FullName: " + user.getFullName());
		System.out.println("Email: " + user.getEmail());
		System.out.println("Role: " + user.getRole());
		System.out.println("ProSkill: " + user.getProSkill());
		System.out.println("ExpInYear: " + user.getExpInYear());
		System.out.println("ProjectId: " + user.getProjectId());
		System.out.println("-------");
	}

	public static void login() {
		// Chức năng này chỉ MANAGER đăng nhập được. EMPLOYEE không đăng nhập được.
		try {
			System.out.println(" --- Đăng nhập --- ");
			System.out.println("Chỉ MANAGER mới đăng nhập được");
			System.out.println("Nhập Email: ");
			// Xử lý Email trong Scanner
			String email = ScannerUtils.inputEmail();
			// Xử lý tính hợp lệ password trong Scannar
			System.out.println("Nhập password: ");
			String password = ScannerUtils.inputPassword();

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

}
