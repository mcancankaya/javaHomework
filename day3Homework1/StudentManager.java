package day3Homework1;

public class StudentManager {
	public void add(Student student) {
		System.out.println(student.getFirstName()+student.getLastName()+" eklendi.");
		
	}
	public void delete(Student student) {
		System.out.println(student.getFirstName()+student.getLastName()+" Silindi.");
	}
	public void addCourse(Student student) {
		System.out.println(student.getRegisteredCourse()+" Kursu "+student.getFirstName()+" isimli öğrenciye eklendi.");
	}
}
