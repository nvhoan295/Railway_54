package Demo;

public class Program {
	
	public static void changeName(Student student) {
		student.setName("B");
	}
	
	
	public static void main(String[] args) {
		Student student = new Student("A", 10);
		
		changeName(student);
		System.out.println(student);
		
		
	}
}
