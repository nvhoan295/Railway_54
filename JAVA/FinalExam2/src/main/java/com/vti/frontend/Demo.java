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

		
	}

	public static void getListUser() {
		try {
			List<User> users = new UserController().getListUser();
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
			User user = new UserController().getUser(id);
			infor(user);
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
	public static void infor(User user) {
		System.out.println("ID: " + user.getId());
		System.out.println("FullName: " + user.getFullName());
		System.out.println("Email: " + user.getEmail());
		System.out.println("UserType: " + user.getUserType());
		System.out.println("ProSkill: " + user.getProSkill());
		System.out.println("ExpInYear: " + user.getExpInYear());
		System.out.println("----------");
	}
}
