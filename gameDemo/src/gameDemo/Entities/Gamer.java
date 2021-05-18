package gameDemo.Entities;

import gameDemo.Abstract.Entity;

public class Gamer implements Entity{
	private int id;
	private String firstNameString;
	private String lastNameString;
	private int birthYear;
	private String nationalIdString;
	
	public Gamer() {
		
	}

	public Gamer(int id, String firstNameString, String lastNameString, int birthYear, String nationalIdString) {
		super();
		this.id = id;
		this.firstNameString = firstNameString;
		this.lastNameString = lastNameString;
		this.birthYear = birthYear;
		this.nationalIdString = nationalIdString;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstNameString() {
		return firstNameString;
	}

	public void setFirstNameString(String firstNameString) {
		this.firstNameString = firstNameString;
	}

	public String getLastNameString() {
		return lastNameString;
	}

	public void setLastNameString(String lastNameString) {
		this.lastNameString = lastNameString;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public String getNationalIdString() {
		return nationalIdString;
	}

	public void setNationalIdString(String nationalIdString) {
		this.nationalIdString = nationalIdString;
	}
	
	
}
