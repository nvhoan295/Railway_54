package com.vti.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.entity.exercise1.News;

public class MyNewsBackend {
	public static void question1() {
		Scanner scanner = new Scanner(System.in);
		List<News> lists = new ArrayList<>();
		News new1 = new News();
		new1.setTitle("Bầu cử");
		lists.add(new1);

		while (true) {
			System.out.println("------- MENU ---------");
			System.out.println("1. Insert news\n" + "2. View list news\n" + "3. Average rate\n" + "4. Exit");

			News news = new News();
			System.out.println("Nhập: ");
			int choose = scanner.nextInt();

			switch (choose) {
			case 1:
				news.input();
				lists.add(news);
				System.out.println("Số tin tức hiện có: " + lists.size());
				break;
			case 2:
				System.out.println("Số tin tức hiện có: " + lists.size());
				for (News string : lists) {
					string.display();
				}
				break;
			case 3:
				new News().calculate();
				break;
			case 4:
				System.out.println("Thoát ");
				return;
			default:
				System.out.println("Nhập lại: ");
				break;
			}

		}
	}
}
