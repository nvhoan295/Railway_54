package init;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<Account> accounts = new ArrayList<>();
		accounts.add(new Account(1, "Thao", null));
		accounts.add(new Account(2, "lisa", null));
		System.out.println(accounts.size());
	
		System.out.println(accounts.size());
		accounts.add(new Account(2, "Hoàn", null));
		System.out.println(accounts.get(1).getName());
		System.out.println(accounts.size());
		if (accounts.isEmpty()) {
			System.out.println("Rỗng");
		} else {
			System.out.println("KHông rỗng");
		}
		System.out.println(accounts.toString());
		
		
	}
}
