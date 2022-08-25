package Assignment1;
public class Test {
	public static void main(String[] args) {
		Department dep1 = new Department();
		dep1.id = 1;
		dep1.name = "Sale";
		
		Department dep2 = new Department();
		dep2.id = 2;
		dep2.name = "Kỹ thuật";
		
		Department dep3 = new Department();
		dep3.id = 3;
		dep3.name = "Tổ chức";
		
		Position pos1 = new Position();
		pos1.id = 1;
		pos1.name = PositionName.Dev;
		
		Position pos2 = new Position();
		pos2.id = 2;
		pos2.name = PositionName.Test;
		System.out.println(pos2.name);
		
		System.out.println(dep2.name);
		
		Account ac1 = new Account();
		ac1.id = 1;
		ac1.departmentId = dep1;
		ac1.positionId = pos1;
		ac1.fullName = "Nguyen Van A";
		
		Account ac2 = new Account();
		ac2.id = 2;
		ac2.positionId = pos2;
		ac2.departmentId = dep2;
		ac2.fullName = "Tran B";
		
//		Assignment 2
//		Exercise 1:
//		Question1;
		
		if (ac2.departmentId == null) {
			System.out.println("Nhân viên này chưa có phòng ban");
		} else {
			System.out.println("Phòng ban của nhân viên này là: "+ ac2.departmentId.name);
		}
		
//		Question 2:
		if(ac2.groups == null) {
			System.out.println("Nhân viên này chưa có group");
		} else {
			System.out.println("Nhân viên này trong Group ...");
		}
//		Question 3:
//		Sử dụng toán tử ternary để làm Question 1
		
		String question1 = (ac2.departmentId == null) ? "Nhân viên này chưa có phòng ban" : "Phòng ban nhân viên là ";
		System.out.println(question1);
		
//		Question 4:
//			Sử dụng toán tử ternary để làm yêu cầu sau:
//			Kiểm tra Position của account thứ 1
//			Nếu Position = Dev thì in ra text "Đây là Developer"
//			Nếu không phải thì in ra text "Người này không phải là Developer"
		if (ac1.departmentId.name == "Dev") {
			System.out.println("Nó là Dev");
		} else {
			System.out.println("Nó không phải Dev");
		}
		
	}
}
