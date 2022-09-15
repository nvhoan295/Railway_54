package entity;

public class VietnamesePhone extends Phone{

	@Override
	public void insertContact(String name, String phone) {
		System.out.println("insert Contract "+ name + " phone: "+ phone);
	}

	@Override
	public void removeContact(String name) {
		System.out.println("Remove Contract "+ name);
	}

	@Override
	public void updateContact(String name, String phone) {
		System.out.println("Update contract "+ name + " Phone "+ phone);
	}

	@Override
	public void searchContract(String name) {
		System.out.println("Search contract "+ name);
	}
	
	
}
