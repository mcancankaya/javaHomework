package day3Homework1;

public class Student extends User {
	String registeredCourse;

	public Student(int id, String firstName, String lastName, String email, String adress, String registeredCourse) {
		super(id, firstName, lastName, email, adress);
		this.registeredCourse = registeredCourse;
	}

	public String getRegisteredCourse() {
		return registeredCourse;
	}

	public void setRegisteredCourse(String registeredCourse) {
		this.registeredCourse = registeredCourse;
	}
	
	
	

}
