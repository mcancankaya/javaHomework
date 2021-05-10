package day3Homework1;

public class InstructorManager {
	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName()+""+instructor.getLastName()+" Adlý Eðitmen Eklendi.");
	}
	public void delete(Instructor instructor) {
		System.out.println(instructor.getFirstName()+""+instructor.getLastName()+" Adlý Eðitmen Silindi.");
	}
	public void addCertificate(Instructor instructor) {
		System.out.println(instructor.getCertificate()+" sertifikasý "+instructor.getFirstName()+""+instructor.getLastName()+" isimli eðitmene eklendi.");
	}

}
