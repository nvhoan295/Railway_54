import java.util.Random;

public class Exercise1 {
	
	
	public static void main(String[] args) {
		
		Random rd = new Random();
		
		String[] ho = {"Nguyen", "Tran", "Le", "Pham", "Trinh", "Dinh", "Mac"};
		String[] dem = {"Minh", "Van", "Quang", "Tung", "Tien", "Khac", "Ngoc"};
		String[] ten = {"Hoan", "Thao", "Diep", "Cuong", "Thong", "Thuy", "Lam"};
		
		String[] hoVaTen = new String[3];
		
		for (int i = 0; i < ho.length; i++) {
			hoVaTen[0] = ho[i];
		}
		
		for (int j = 0; j < dem.length; j++) {
			hoVaTen[1] = dem[j];
		}
		
		for (int k = 0; k < ten.length; k++) {
			hoVaTen[2] = ten[k];
		}
		
		System.out.println(hoVaTen[0] + " " + hoVaTen[1] + " " + hoVaTen[2]);
		
	}
}
