package init;

public class Hoan extends Exception {
	@Override
	public String getMessage() {
		System.out.println("Không chia được cho 0");
		return null;
	}
}
