package init;

public class Exercise5 {
	public static void question1(Department department) {
//		Question 1:
//			In ra thông tin của phòng ban thứ 1 (sử dụng toString())
		System.out.println(department.toString());
	}

	public static void question2(Department[] departments) {
//		Question 2:
//			In ra thông tin của tất cả phòng ban (sử dụng toString())
		for (int i = 0; i < departments.length; i++) {
			System.out.println(departments[i]);
		}

	}

	public static void question3(Department department) {
		System.out.println(department.hashCode());
	}

	public static void question4(Department department) {
//		Question 4: Kiểm tra xem phòng ban thứ 1 có tên là "Phòng A" không?
		if (department.getName().equals("Phòng A")) {
			System.out.println("Đúng");
		} else {
			System.out.println("Sai");
		}

	}

	public static void question5(Department dep1, Department dep2) {
//		Question 5: So sánh 2 phòng ban thứ 1 và phòng ban thứ 2 xem có bằng nhau
//		không (bằng nhau khi tên của 2 phòng ban đó bằng nhau)
		if (dep1.getName().equals(dep2.getName())) {
			System.out.println("Bằng nhau");
		} else {
			System.out.println("Khác nhau");
		}

	}

	public static void question6(Department[] departments) {
//		Question 6: Khởi tạo 1 array phòng ban gồm 5 phòng ban, sau đó in ra danh
//		sách phòng ban theo thứ tự tăng dần theo tên (sắp xếp theo vần ABCD)
//		VD:
//		Accounting
//		Boss of director
//		Marketing
//		Sale
//		Waiting room
		for (int i = 0; i < departments.length; i++) {
			System.out.println(departments[i].getName());
		}
		
		// Chưa làm ra

	}

	public static void main(String[] args) {
		Department dep1 = new Department(1, "Phòng A");
		Department dep2 = new Department(2, "Giam doc");
		Department dep3 = new Department(3, "Ky thuat");
		Department dep4 = new Department(4, "Phòng A");
		Department dep5 = new Department(5, "Tài Chính");

//		question1(dep4);
//		question2(new Department[] { dep1, dep2, dep3, dep4 });
//		question3(dep1);
//		question4(dep1);
//		question5(dep1, dep4);
		question6(new Department[] { dep1, dep2, dep3, dep4, dep5 });
	}

}
