package init;

import java.io.File;
import java.io.IOException;

public class File1 {
	public static void main(String[] args) throws IOException {
		File file = new File("/Users/nguyenhoan/Desktop/");
		if (file.exists()) {
			System.out.println("Tồn tại");
		} else {
			System.out.println("Không tồn tại");
		}
		
		File file1 = new File("/Users/nguyenhoan/Desktop/studen.txt");
		file1.createNewFile();
		
		for (String list : file.list()) {
			System.out.println(list);
		}
	}
}
