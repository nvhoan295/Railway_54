package init;

public class Demo2 {
	public static void main(String[] args) throws Hoan {
		try {
			System.out.println(chia(3, 0));
		} catch (Exception e) {
			throw new Hoan();
		}
	}
	
	
	
	public static float chia(int a, int b) {
		return  a / b;

	}
}
