import java.util.Random;

public class Exercise1 {
	public static void main(String[] args) {
		
		String[] ho = {"Nguyen", "Tran", "Le", "Pham", "Trinh", "Dinh", "Mac"};
		String[] dem = {"Minh", "Van", "Quang", "Tung", "Tien", "Khac", "Ngoc"};
		String[] ten = {"Hoan", "Thao", "Diep", "Cuong", "Thong", "Thuy", "Lam"};
		
		Random rd = new Random();
		int i = rd.nextInt(7);
		int j = rd.nextInt(7);
		int k = rd.nextInt(7);
			System.out.println(ho[i]+ " "+ dem[j]+ " " + ten[k]);
			System.out.println(ho[i]+ " "+ dem[j]+ " " + ten[k]);
			System.out.println(ho[i]+ " "+ dem[j]+ " " + ten[k]);
		
		String[] hoTen = new String[10];
		hoTen[0] = ho[i]+ " "+ dem[j]+ " " + ten[k];
		
		
		
		
		
		
	}
}
