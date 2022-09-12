package init;

import java.util.Date;

public class Test {
	public static void main(String[] args) {
		Account acc1 = new Account();
		Account acc2 = new Account(2, "hoan@gmail.com", "hoan2", "Nguyen Hoan");

		Position pos3 = new Position();
		Account acc3 = new Account(3, "hoan3gmail.com", "hoan3", "Nguyen Hoan3", pos3);
		System.out.println(acc3.createDate);

		Position pos4 = new Position();
		Account acc4 = new Account(4, "hoan4@gmail.com", "hoan4", "Nguyen Hoan 4", pos4, new Date(2022, 04, 13));
		System.out.println(acc4.createDate);
		
		Group group = new Group();
		Group group2 = new Group("Dev", acc4, new Account[] {acc1, acc2, acc4}, new Date());
		Group group3 = new Group("Test", acc4, new Date(), new String[] {"hoan", "hoan2"});
		
		
		for (int i = 0; i < group2.getAccounts().length; i++) {
			System.out.println(group2.getAccounts()[i].getUserName());
		}
		
		
		
		
		
		
		
		
	}
}
