package model;

public class Student {
	private long stID;
	private String name;
	private String surname;
	private static long counter = 0;
	
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

	public Student() {
		setStID();
		setName("");
		setSurname("");
	}
	
	public Student(String name, String surname) {
		setStID();
		setName(name);
		setSurname(surname);
	}

	public String toString() {
		return "Student [stID=" + stID + ", name=" + name + ", surname=" + surname + "]";
	}
}
