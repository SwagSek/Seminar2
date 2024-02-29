package model;

public class Professor {
	private long pID;
	private String name;
	private String surname;
	private Degree degree;
	private static long counter = 0;
	
	//Getters
	public long getpID() {
		return pID;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public Degree getDegree() {
		return degree;
	}
	
	//Setters
	public void setpID() {
		pID = counter;
		counter++;
	}
	
	public void setName(String name) {
		if(name != null && name.matches("[A-Z]{1}[a-z]+")) {
			this.name = name;
		}
		else this.name = "Undefined";
	}
	
	public void setSurname(String surname) {
		if(surname != null && surname.matches("[A-Z]{1}[a-z]+")) {
			this.surname = surname;
		}
		else this.surname = "Undefined";
	}
	
	public void setDegree (Degree degree) {
		if (degree != null)
			this.degree = degree;
		else 
			this.degree = Degree.other;
	}
	
	//Constructors
	public Professor () {
		setpID();
		setName("");
		setSurname("");
		setDegree(Degree.other);
	}
	
	public Professor(String name, String surname, Degree degree) {
		setpID();
		setName(name);
		setSurname(surname);
		setDegree(degree);
	}
	
	//toString
	public String toString() {
		return pID + ": " + degree + ", " + name + " " + surname;
	}
}
