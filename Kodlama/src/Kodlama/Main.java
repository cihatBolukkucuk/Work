package Kodlama;

public class Main {

	public static void main(String[] args) {

		User user = new User(1,"Cihat","123");
		Student student= new Student(2,"Ali", "1234");
		Instructor instructor=new Instructor(3, "Ayse","12345");
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager =new InstructorManager();
		UserManager userManager= new UserManager();
		
		userManager.add(user);
		userManager.delete(user);
		studentManager.add(student);
		studentManager.delete(student);
		instructorManager.add(instructor);
		instructorManager.add(instructor);
		
	}

}
