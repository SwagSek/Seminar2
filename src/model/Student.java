package model;

public class Student extends Person{
	private long stID;
	private static long counter = 10000;

	
	public long getStID() {
		return stID;
	}
	
	public void setStID() {
		stID = counter;
		counter++;
	}
	
	public Student() {
		super();
		setStID();
	}
	
	public Student(String name, String surname, String personCode) {
		super(name, surname, personCode);
		setStID();
	}

	public String toString() {
		return stID + ": " + super.toString();
	}
}
