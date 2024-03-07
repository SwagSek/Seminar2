package model;

public class Person {
	private String personCode;
	private String name;
	private String surname;
	
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
	
	public Person() {
		setName("");
		setSurname("");
		setPersonCode("");
	}
	
	public Person(String name, String surname, String personCode) {
		setName(name);
		setSurname(surname);
		setPersonCode(personCode);
	}

	@Override
	public String toString() {
		return "Person [personCode=" + personCode + ", name=" + name + ", surname=" + surname + "]";
	}
	
	
}
