package frontend;

import entity.question2_3.Employee;
import entity.question2_3.Manager;
import entity.question2_3.Waiter;

public class ProgramQues2_3 {
	public static void main(String[] args) {
		Employee employee = new Employee("Peter", 3000);
		employee.calculatePay();
		employee.displayInfor();
		
		
		Manager manager = new Manager("Join", 5000);
		manager.calculatePay();
		manager.displayInfor();
		
		Waiter waiter = new Waiter("Marry", 2000);
		waiter.calculatePay();
		waiter.displayInfor();
		
	}
}
