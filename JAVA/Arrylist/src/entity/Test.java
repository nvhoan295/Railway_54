package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	static Scanner scanner = new Scanner(System.in);
	static List<Person> persons = new ArrayList<>();

	public static void main(String[] args) {

		// Dữ liệu có sẵn
		Person person1 = new Person("Hoan", 32, "Hà Nội");
		Person person2 = new Person("Thao", 32, "Hà Nội");
		Person person3 = new Person("Lisa", 1, "Hà Nội");
		Person person4 = new Person("Huy", 1, "Hà Nội");
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);
		persons.add(person4);

		System.out.println("Nhập chức năng \n" + "1. Thêm tên\n" + "2. Thông tin\n" + "3. Thoát");
		int choose = scanner.nextInt();
		switch (choose) {
		case 1:
			addPerson();
			System.out.println(persons.size());
			for (Person string : persons) {
				System.out.println(string);
			}
			break;
		case 2:
			timKiem();
			break;
		case 3:
			System.out.println("Thoát. Tạm biệt");
			return;
		default:
			System.out.println("Nhập lại");
			break;
		}

		
	}

	public static void addPerson() {

		System.out.println("Tạo Account");
		Person person = new Person();
		System.out.print("Nhập tên: ");
		person.setTen(scanner.next());
		System.out.print("Nhập tuổi: ");
		person.setTuoi(scanner.nextInt());
		System.out.println("Nhập quê Quán: ");
		person.setQueQuan(scanner.next());

		persons.add(person);
	}

	public static void timKiem() {
		System.out.println("Thông Tin Account");
		System.out.println("Nhập tên: ");
		String tenCanTim = scanner.next();
		
		for (Person nguoi : persons) {
			if (nguoi.getTen().equals(tenCanTim)) {
				System.out.println(nguoi.toString());
			} else {
				System.out.println("Không tim thấy");
			}
		}

	}

}
