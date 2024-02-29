package model;

public class Grade {
	private long gID;
	private int value;
	private Student student;
	private Course course;
	private static long counter = 200000;
	
	public long getgID() {
		return gID;
	}
	public int getValue() {
		return value;
	}
	public Student getStudent() {
		return student;
	}
	public Course getCourse() {
		return course;
	}
	
	public void setgID() {
		gID = counter;
		counter++;
	}
	public void setValue(int value) {
		if (value > 0 && value <= 10)
			this.value = value;
		else
			this.value = 1;
	}
	public void setStudent(Student student) {
		if (student != null)
			this.student = student;
		else
			this.student = new Student();
	}
	public void setCourse(Course course) {
		if (course != null)
			this.course = course;
		else
			this.course = new Course();
	}
	
	public Grade() {
		setgID();
		setValue(1);
		setStudent(new Student());
		setCourse(new Course());
	}
	
	public Grade(int value, Student student, Course course) {
		setgID();
		setValue(value);
		setStudent(student);
		setCourse(course);
	}
	
	public String toString() {
		return "Grade [gID=" + gID + ", value=" + value + ", student=" + student.getName() + " " + student.getSurname() + ", course=" + course.getTitle() + "]";
	}
	
	
}
