package model;

public class Student {
	private long stID;
	private String name;
	private String surname;
	private static long counter = 10000;
	private String personCode;
	
	public long getStID() {
		return stID;
	}
	
	public void setStID() {
		stID = counter;
		counter++;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if(name != null && name.matches("[A-Z]{1}[a-z]+")) {
			this.name = name;
		}
		else this.name = "Undefined";
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		if(surname != null && surname.matches("[A-Z]{1}[a-z]+")) {
			this.surname = surname;
		}
		else this.surname = "Undefined";
	}
	
	
	public String getPersonCode() {
		return personCode;
	}

	public void setPersonCode(String personCode) {
		if (personCode != null && personCode.matches("[0-9]{6}-[0-9]{5}"))
			this.personCode = personCode;
		else
			this.personCode = "Undefined";
	}

	public Student() {
		setStID();
		setName("");
		setSurname("");
		setPersonCode("");
	}
	
	public Student(String name, String surname, String personCode) {
		setStID();
		setName(name);
		setSurname(surname);
		setPersonCode(personCode);
	}

	public String toString() {
		return "Student [stID=" + stID + ", name=" + name + ", surname=" + surname + ", personCode=" + personCode + "]";
	}
}
