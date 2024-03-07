package model;

public class Professor extends Person{
	private long pID;
	private Degree degree;
	private static long counter = 0;
	
	//Gettersprivate String name;
	public long getpID() {
		return pID;
	}

	public Degree getDegree() {
		return degree;
	}
	
	//Setters
	public void setpID() {
		pID = counter;
		counter++;
	}

	public void setDegree (Degree degree) {
		if (degree != null)
			this.degree = degree;
		else 
			this.degree = Degree.other;
	}
	
	//Constructors
	public Professor () {
		super();
		setpID();
		setDegree(Degree.other);
	}
	
	public Professor(String name, String surname, String personCode, Degree degree) {
		super(name, surname, personCode);
		setpID();
		setDegree(degree);
	}
	
	//toString
	public String toString() {
		return pID + ": " + degree + ", " + super.toString();
	}
}
