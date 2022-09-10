package bang;

import java.time.LocalDate;
import java.util.Random;

public class Exercise4 {
	public static void main(String[] args) {
//		Question 1: In ngẫu nhiên ra 1 số nguyên
		System.out.println("---- Question 1 ------");
		Random random = new Random();
		int x = random.nextInt(100);
		System.out.println(x);
//		Question 2: In ngẫu nhiên ra 1 số thực
		System.out.println("---- Question 2 ------");
		float f = random.nextFloat();
		System.out.println(f);
//		Question 3:
//			Khai báo 1 array bao gồm các tên của các bạn trong lớp, sau đó in ngẫu nhiên
//			ra tên của 1 bạn
		
		System.out.println("----- Question 3 --------");
		String[] ten = { "Phong", "Cường", "Hoà", "Thông", "Mạnh" };
		int a = random.nextInt(ten.length);
		System.out.println(ten[a]);
//		Question 4:
//			Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 24-07-1995 tới ngày 20-12-1995
		
		System.out.println("----- Question 4 --------");
		int minDay = (int) LocalDate.of(1995, 07, 24).toEpochDay();
		int maxDay = (int) LocalDate.of(1995, 12, 20).toEpochDay();
		System.out.println(minDay);
		System.out.println(maxDay);
		int randomInt = minDay + random.nextInt(maxDay - minDay);
		LocalDate randomDate = LocalDate.ofEpochDay(randomInt);
		System.out.println(randomDate);
		
//		Question 5:
//			Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 1 năm trở lại đây
		System.out.println("--------- Question 5 -----------");
		int toDay = (int) LocalDate.now().toEpochDay();
		System.out.println(toDay);
		int soNgayNgauNhien = toDay - random.nextInt(365);
		LocalDate ngayNgauNhien = LocalDate.ofEpochDay(soNgayNgauNhien);
		System.out.println("Ngày ngẫu nhiên trong khoảng 1 năm: " + ngayNgauNhien);
		
//		Question 6:
//			Lấy ngẫu nhiên 1 ngày trong quá khứ
		System.out.println("----- Question 6 -------");
		int maxDay6 = (int) LocalDate.now().toEpochDay();
		System.out.println(maxDay6);
		int random6 = random.nextInt(maxDay6);
		LocalDate ngayQuaKhu = LocalDate.ofEpochDay(random6);
		System.out.println(ngayQuaKhu);
	
//		Question 7:
//			Lấy ngẫu nhiên 1 số có 3 chữ số
		System.out.println("----- Question 7 ---------");
		int y = random.nextInt(900) + 100;
		System.out.println(y);
		
	}

}
