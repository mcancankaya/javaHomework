package Entities;

import java.time.LocalDate;

public class Gamer {
	private int gamerId;
	private String firstName;
	private String lastName;
	private String nationalityId;
	private LocalDate dateOfBirth;
	
	public Gamer(int gamerId, String firstName, String lastName, String nationalityId, LocalDate dateOfBirth) {
		super();
		this.gamerId = gamerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.dateOfBirth = dateOfBirth;
	}

	public int getGamerId() {
		return gamerId;
	}

	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getNationalityId() {
		return Long.parseLong(nationalityId);
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
}
