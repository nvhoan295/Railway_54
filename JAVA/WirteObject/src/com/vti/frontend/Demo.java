package com.vti.frontend;

import com.vti.Utils.IOManager;

public class Demo {
	public static void main(String[] args) {

		try {
			IOManager.writeFile("/Users/nguyenhoan/Desktop/Thao.txt", "Độc lập tự do \n", true);
		} catch (Exception e) {
			System.out.println("Ko tìm thấy file");
		}

	}
}
