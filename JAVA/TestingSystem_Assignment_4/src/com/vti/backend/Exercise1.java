package com.vti.backend;

import java.util.Date;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Group;
import com.vti.entity.Position;
import com.vti.entity.Position.PositionName;

public class Exercise1 {
	public static void question1() {
//		Question 1:
//			Tạo constructor cho department:
//			a) không có parameters
//			b) Có 1 parameter là nameDepartment và default id của
//			Department = 0
//			Khởi tạo 1 Object với mỗi constructor ở trên
		Department dep1 = new Department();
		Department dep2 = new Department("Sale");

		System.out.println(dep1);
		System.out.println(dep2);
	}

	public static void question2() {
//		Question 2:
//			Tạo constructor cho Account:
//			a) Không có parameters
//			b) Có các parameter là id, Email, Username, FirstName,
//			LastName (với FullName = FirstName + LastName)
//			c) Có các parameter là id, Email, Username, FirstName,
//			LastName (với FullName = FirstName + LastName) và
//			Position của User, default createDate = now
//			d) Có các parameter là id, Email, Username, FirstName,
//			LastName (với FullName = FirstName + LastName) và
//			Position của User, createDate
//			Khởi tạo 1 Object với mỗi constructor ở trên
		Account acc1 = new Account();
		Account acc2 = new Account(2, "name2@gmail.com", "name2", "Nguyen", "Hoan");
		Account acc3 = new Account(3, "name3@gmail.com", "name3", "thao", "nguyen", new Position(1, PositionName.DEV));
		System.out.println(acc3);
		Account acc4 = new Account(0, "name4@gmail.com", "name4", "lisa", "nguyen", new Position(2, PositionName.TEST),
				new Date(2000));
		System.out.println(acc4);

	}

	public static void question3() {
//		Question 3:
//			Tạo constructor cho Group:
//			a) không có parameters
//			b) Có các parameter là GroupName, Creator, array Account[]
//			accounts, CreateDate
//			c) Có các parameter là GroupName, Creator, array String[]
//			usernames , CreateDate
//			Với mỗi username thì sẽ khởi tạo 1 Account (chỉ có thông tin
//			username, các thông tin còn lại = null).
//			Khởi tạo 1 Object với mỗi constructor ở trên
		// a
		Group group1 = new Group();
		System.out.println(group1);
		// b
		Account acc1 = new Account();
		Account acc2 = new Account(2, "name2@gmail.com", "name2", "Nguyen", "Hoan");
		Account creator = new Account(3, "name3@gmail.com", "name3", "thao", "nguyen",
				new Position(1, PositionName.DEV));
		Account acc4 = new Account(0, "name4@gmail.com", "name4", "lisa", "nguyen", new Position(2, PositionName.TEST),
				new Date(2000));
		Group group2 = new Group(null, creator, new Account[] { acc1, acc2 }, new Date());
		System.out.println(group2);
		for (int i = 0; i < new Account[] { acc1, acc2 }.length; i++) {
			System.out.println(new Account[] { acc1, acc2 }[i].getUserName());
		}
		// c
		String[] userNames = new String[] { "name2", "name3", "name4" };
		Group group3 = new Group(0, null, creator, userNames, new Date());

		System.out.println(group3);

	}
}
