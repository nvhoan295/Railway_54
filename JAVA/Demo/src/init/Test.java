package init;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Test {
	public static void main(String[] args) {
		Account account = new Account(1, "Hoàn", new Date(2022, 2, 23));
		
		System.out.println(account.getCreateDate());
		
		
		Locale locale = new Locale("vn", "VN");
		DateFormat dateformat = DateFormat.getDateInstance(DateFormat.DEFAULT,
		locale);
		String date = dateformat.format(account.getCreateDate());
		System.out.println(date);
		
		
	}
	
}
