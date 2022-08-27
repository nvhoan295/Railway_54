package Exercise5;

import java.util.Scanner;

import Assignment1.*;

public class Question5 {
	public static void main(String[] args) {

//	Question 5:
//		Viết lệnh cho phép người dùng tạo account (viết thành method)
//		Đối với property Position, Người dùng nhập vào 1 2 3 4 5 và vào
//		chương trình sẽ chuyển thành Position.Dev, Position.Test,
//		Position.ScrumMaster, Position.PM

		Scanner sc = new Scanner(System.in);
		Account acc = new Account();
		System.out.println("Nhập ID: ");
		acc.id = sc.nextInt();
		
		System.out.println("Nhập tên: ");
		acc.fullName = sc.next();
		
		System.out.println("Nhập Position: 1.Dev, 2.Test, 3.Scrum_Master, 4.PM");

		int posNum = sc.nextInt();
		
		switch (posNum) {
		case 1:
			Position pos1 = new Position();
			pos1.name = PositionName.Dev;
			acc.positionId = pos1;
			break;
		case 2:
			Position pos2 = new Position();
			pos2.name = PositionName.Test;
			acc.positionId = pos2;
			break;
		case 3:
			Position pos3 = new Position();
			pos3.name = PositionName.Secrum_Master;
			acc.positionId = pos3;
			break;
		case 4:
			Position pos4 = new Position();
			pos4.name = PositionName.PM;
			acc.positionId = pos4;
			break;
		default:
			System.out.println("Nhập sai");
			break;
		}
		
		System.out.println("Thông tin Account:");
		System.out.println("ID: "+  acc.id + " Name: "+ acc.fullName + " Vị Trí: "+ acc.positionId.name);
		

	}
}
