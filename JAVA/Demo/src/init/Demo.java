package init;

public class Demo {
	public static void main(String[] args) {
		nhapThongTin();
	}

	public static void nhapThongTin() {
		try {
			inputAge();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void inputAge() throws Exception {
		System.out.println("1");
		throw new Exception("wrong input");
	}
}
