package day3Homework1;

public class InstructorManager {
	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName()+""+instructor.getLastName()+" Adl� E�itmen Eklendi.");
	}
	public void delete(Instructor instructor) {
		System.out.println(instructor.getFirstName()+""+instructor.getLastName()+" Adl� E�itmen Silindi.");
	}
	public void addCertificate(Instructor instructor) {
		System.out.println(instructor.getCertificate()+" sertifikas� "+instructor.getFirstName()+""+instructor.getLastName()+" isimli e�itmene eklendi.");
	}

}
