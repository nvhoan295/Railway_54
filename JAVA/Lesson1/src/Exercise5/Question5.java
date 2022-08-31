package Exercise5;

import java.util.Scanner;

import exercise.Account;
import exercise.Position;
import exercise.Position.PositionName;

public class Question5 {
	
//		Question 5:
//			Viết lệnh cho phép người dùng tạo account (viết thành method)
//			Đối với property Position, Người dùng nhập vào 1 2 3 4 5 và vào
//			chương trình sẽ chuyển thành Position.Dev, Position.Test,
//			Position.ScrumMaster, Position.PM
		public static void taoAcc() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Mời bạn nhập thông tin Account");
			Account acc = new Account();
			System.out.println("Nhập ID: ");
			acc.id = sc.nextInt();
			System.out.println("Nhập Email: ");
			acc.email = sc.next();
			System.out.println("Nhập tên: ");
			acc.fullName = sc.next();
			System.out.println("Nhập Position 1.Dev , 2.Test, 3. Scrum_Master, 4.PM");
			int posNum = sc.nextInt();
			switch (posNum) {
			case 1:
				Position pos1 = new Position(1, PositionName.DEV);
				acc.positionID = pos1;
				break;
			case 2:
				Position pos2 = new Position(2, PositionName.TEST);
				acc.positionID = pos2;
				break;
			case 3:
				Position pos3 = new Position(3, PositionName.SCRUM_MASTER);
				acc.positionID = pos3;
				break;
			case 4:
				Position pos4 = new Position(4, PositionName.PM);
				acc.positionID = pos4;
				break;
			}
			
			System.out.println("Thông tin Account vừa nhập");
			System.out.println("ID: "+ acc.id);
			System.out.println("Email: "+ acc.email);
			System.out.println("Tên: "+ acc.fullName);
			System.out.println("Vị trí: "+ acc.positionID.name);
		}
		
		public static void main(String[] args) {
			taoAcc();
		}

}
