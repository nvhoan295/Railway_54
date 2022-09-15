package entity.question2_3;

public abstract class User {
//	Hãy xây dựng 1 class User với các thuộc tính name kiểu String và
//	salary ratio kiểu double.
//	a) Viết các hàm cho phép nhập và trả về name, salary ratio.
//	b) Viết hàm calculatePay() dạng abstract trả về thu nhập của nhân
//	viên, kiểu double.
//	c) Viết hàm displayInfor()

	private String name;
	protected double salaryRatio;

	public User(String name, double salaryRatio) {
		this.name = name;
		this.salaryRatio = salaryRatio;
	}
	
	public abstract double calculatePay();
	
	public void displayInfor() {
		System.out.println("Name: "+ name);
		System.out.println("Salary Ratio: "+ salaryRatio);
		System.out.println("Pay: "+ calculatePay());
	}
	
	

}
