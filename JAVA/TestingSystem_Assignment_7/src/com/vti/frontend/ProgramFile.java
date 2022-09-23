package com.vti.frontend;

import com.vti.Utils.FileManager;

public class ProgramFile {
	public static void main(String[] args) {
//		FileManager.isFileExists("/Users/nguyenhoan/Desktop/tltn.docx");
		
		
		try {
			FileManager.createNewFile("/Users/nguyenhoan/Desktop/Thao.txt");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
			
//		try {
//			FileManager.deleteFile("/Users/nguyenhoan/Desktop/Thao.txt");
//		} catch (Exception e) {
//			e.getMessage();
//		}
//		try {
//			FileManager.getAllFileName("/Users/nguyenhoan/Desk");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		
		
		
		
	}
}
