package entity.question2_3;

public class Employee extends User{

	public Employee(String name, double salaryRatio) {
		super(name, salaryRatio);
	}

	@Override
	public double calculatePay() {
		
		return  salaryRatio * 420;
	}

	
	
	
	
}
