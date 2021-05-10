package day3Homework1;

public class Instructor	extends User {
	String Certificate;

	public Instructor(int id, String firstName, String lastName, String email, String adress, String certificate) {
		super(id, firstName, lastName, email, adress);
		Certificate = certificate;
	}

	public String getCertificate() {
		return Certificate;
	}

	public void setCertificate(String certificate) {
		Certificate = certificate;
	}
	

}
