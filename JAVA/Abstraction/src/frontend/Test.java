package frontend;

import entity.VietnamesePhone;

public class Test{
	public static void main(String[] args) {
		VietnamesePhone vn1 = new VietnamesePhone();
		vn1.insertContact("Hoan", "0799244668");
		
		vn1.removeContact("Hoan");
		
		vn1.updateContact("Thao", "0982708939");
		
		vn1.searchContract("Hoan");
	}
	
}
