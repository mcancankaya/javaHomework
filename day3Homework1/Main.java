package day3Homework1;

public class Main {

	public static void main(String[] args) {
	
		User user=new User(1, "userinadı", "userinsoyadı", "usermail@mail.com", "userinadresi");
		
		Student student =new Student(2, "MCan", "cankaya", "mccankaya45@hotmail.com", "tr","Java+React");
	
	
		Instructor instructor=new Instructor(3,"Engin","Demiroğ","engindemirog@mail.com","TR","MCT,PMP,ITIL");

		
		StudentManager studentManager=new StudentManager();
		studentManager.add(student);
		studentManager.addCourse(student);
		
		InstructorManager instructorManager= new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.addCertificate(instructor);
		
		UserManager userManager=new UserManager();
		User[] users= {user,instructor,student};

		for (User user2 : users) {
			userManager.addMultiple(user2);
		}
		
	}

}
