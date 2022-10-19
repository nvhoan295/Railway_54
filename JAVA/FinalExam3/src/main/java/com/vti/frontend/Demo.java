//
package com.vti.frontend;

import com.vti.Utils.ScannerUtils;

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
public class Demo {
	public static void main(String[] args) {
//		System.out.println("Nhập pass: ");
//		String pass = ScannerUtils.inputPassword();
//		System.out.println("Pass: "+ pass);
		System.out.println("Nhập fullName");
		String fullName = ScannerUtils.inputFullName();
		System.out.println(fullName);
	}
}
