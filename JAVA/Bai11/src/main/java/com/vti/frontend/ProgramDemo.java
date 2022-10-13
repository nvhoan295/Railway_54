//
package com.vti.frontend;

import java.util.List;

import com.vti.Utils.ScannerUtils;
import com.vti.backend.datalayer.AccountRepository;
import com.vti.backend.presentationlayer.AccountController;
import com.vti.entity.Account;

/**
 * This class is .
 * 
 * @Description: .
 * @author: HoanNV
 * @create_date: Oct 13, 2022
 * @version: 1.0
 * @modifer: HoanNV
 * @modifer_date: Oct 13, 2022
 */
public class ProgramDemo {
	static AccountController controller = new AccountController();

	public static void main(String[] args) {
		while (true) {
			Menu();
			int choose = ScannerUtils.inputId();
			switch (choose) {
			case 1:
				getListAccount();
				break;
			case 2:
				getAccount();
				break;
			case 3:
				isAccountExists();
				break;
			case 4:
				createAccount();
				break;
			case 5:
				deleteAccount();
				break;
			case 6:
				checkEmail();
				break;
			case 7:
				System.out.println("Thoát!");
				return;
			default:
				System.out.println("Nhập lại: ");
				break;
			}
		}
	}
	
	/**
	 * This method is . 
	 * 
	 * @Description: .
	 * @author: HoanNV
	 * @create_date: Oct 13, 2022
	 * @version: 1.0
	 * @modifer: HoanNV
	 * @modifer_date: Oct 13, 2022
	 */
	public static void Menu() {
		System.out.println("1. ListAccounts");
		System.out.println("2. Account");
		System.out.println("3. Accounts Exists");
		System.out.println("4. Create Accounts");
		System.out.println("5. Delete Accounts");
		System.out.println("6. Check Email");
		System.out.println("Thoát.");
		System.out.println("Nhập: ");
	}
	
	/**
	 * This method is . 
	 * 
	 * @Description: .
	 * @author: HoanNV
	 * @create_date: Oct 13, 2022
	 * @version: 1.0
	 * @modifer: HoanNV
	 * @modifer_date: Oct 13, 2022
	 */
	public static void getListAccount() {
		try {
			List<Account> accounts = controller.getListAccounts();
			for (Account account : accounts) {
				System.out.println(account);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	/**
	 * This method is . 
	 * 
	 * @Description: .
	 * @author: HoanNV
	 * @create_date: Oct 13, 2022
	 * @version: 1.0
	 * @modifer: HoanNV
	 * @modifer_date: Oct 13, 2022
	 */
	public static void getAccount() {
		try {
			System.out.println("Nhập ID: ");
			int id = ScannerUtils.inputId();
			Account account = controller.getAccountByID(id);
			System.out.println(account);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	/**
	 * This method is . 
	 * 
	 * @Description: .
	 * @author: HoanNV
	 * @create_date: Oct 13, 2022
	 * @version: 1.0
	 * @modifer: HoanNV
	 * @modifer_date: Oct 13, 2022
	 */
	public static void isAccountExists() {
		try {
			System.out.println("Mời bạn nhập Username: ");
			String username = ScannerUtils.inputName();
			boolean check = controller.isAccountExists(username);
			if (check) {
				System.out.println("userName đã tồn tại");
			} else {
				System.out.println("UserName Không tồn tại");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * This method is . 
	 * 
	 * @Description: .
	 * @author: HoanNV
	 * @create_date: Oct 13, 2022
	 * @version: 1.0
	 * @modifer: HoanNV
	 * @modifer_date: Oct 13, 2022
	 */
	public static void createAccount() {
		System.out.println("Nhập email: ");
		String email = ScannerUtils.inputName();
		System.out.println("Nhập Username: ");
		String userName = ScannerUtils.inputName();
		System.out.println("Nhập FullName: ");
		String fullName = ScannerUtils.inputName();
		System.out.println("Nhập DepartmentId: ");
		int dep = ScannerUtils.inputInt();
		try {
			controller.createAccount(email, userName, fullName, dep);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * This method is . 
	 * 
	 * @Description: .
	 * @author: HoanNV
	 * @create_date: Oct 13, 2022
	 * @version: 1.0
	 * @modifer: HoanNV
	 * @modifer_date: Oct 13, 2022
	 */
	public static void deleteAccount() {
		try {
			System.out.println("Nhập Id muốn xoá: ");
			int id = ScannerUtils.inputId();
			controller.deleteAccount(id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * This method is checkEmail
	 * 
	 * @Description: .
	 * @author: HoanNV
	 * @create_date: Oct 13, 2022
	 * @version: 1.0
	 * @modifer: HoanNV
	 * @modifer_date: Oct 13, 2022
	 */
	public static void checkEmail() {
		System.out.println("Nhập Email muốn check: ");
		String email = ScannerUtils.inputString("Nhập kiểu String");
		boolean isEmail = controller.checkEmail(email);
		if (isEmail) {
			System.out.println("Email đúng định dạng !");
		} else {
			System.out.println("Email sai định dạng");
		}
	}
}
