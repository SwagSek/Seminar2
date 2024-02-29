package model;

public class Course {
	private long cID;
	private String title;
	private int creditPoints;
	private Professor professor;
	public static long counter = 100000;
	
	public long getcID() {
		return cID;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getCreditPoints() {
		return creditPoints;
	}
	
	public Professor getProfessor() {
		return professor;
	}
	
	public void setcID() {
		cID = counter;
		counter++;
	}
	
	public void setTitle(String title) {
		if (title != null && title.matches("[A-Za-z 0-9]{4,40}"))
			this.title = title;
		else
			this.title = "Undefined";
	}
	
	public void setCreditPoints(int creditPoints) {
		if (creditPoints > 0 && creditPoints <= 20)
			this.creditPoints = creditPoints;
		else this.creditPoints = 2;
	}
	
	public void setProfessor(Professor professor) {
		if (professor != null)
			this.professor = professor;
		else
			this.professor = new Professor();
	}

	public Course() {
		setcID();
		setTitle("");
		setCreditPoints(0);
		setProfessor(new Professor());
	}
	
	public Course(String title, int creditPoints, Professor professor) {
		setcID();
		setTitle(title);
		setCreditPoints(creditPoints);
		setProfessor(professor);
	}

	public String toString() {
		return "Course [cID=" + cID + ", title=" + title + ", creditPoints=" + creditPoints + ", professor=" + professor.getName() + " " + professor.getSurname()
				+ "]";
	}
}
