package service;

import java.util.ArrayList;

import model.Course;
import model.Degree;
import model.Grade;
import model.Professor;
import model.Student;

public class MainService {

	private static ArrayList<Professor> allProfessors = new ArrayList<Professor>();
	private static ArrayList<Student> allStudents = new ArrayList<Student>();
	private static ArrayList<Course> allCourses = new ArrayList<Course>();
	private static ArrayList<Grade> allGrades = new ArrayList<Grade>();
	
	public static void main(String[] args) {
		Professor pr1 = new Professor("Galina", "Hilkevica", Degree.phd);
		Professor pr2 = new Professor("Karina", "Skirmante", Degree.mg);
		allProfessors.add(pr1);
		allProfessors.add(pr2);
		for(Professor professor : allProfessors) {
			System.out.println(professor);
		}
		
		Student stu1 = new Student("Elvijs", "Leistmanis", "122366-75343");
		Student stu2 = new Student("Klavs", "Grinvalds", "753456-85533");
		
		allStudents.add(stu1);
		allStudents.add(stu2);
		for(Student student : allStudents) {
			System.out.println(student);
		}
		
		Course c1 = new Course("Objektoorienteta Programesana", 4, pr2);
		Course c2 = new Course("Programmesana timekli JAVA", 4, pr2);
		allCourses.add(c1);
		allCourses.add(c2);
		for(Course course : allCourses) {
			System.out.println(course);
		}
		
		Grade g2 = new Grade(10, stu2, c2);
		Grade g1 = new Grade(5, stu1, c2);
		allGrades.add(g1);
		allGrades.add(g2);
		for(Grade grade : allGrades) {
			System.out.println(grade);
		}
		
		try {
			System.out.println(stu2.getName() + " " + stu2.getSurname() + ": " + calculateAvgGradeByStudent(stu2));
			System.out.println(c2.getTitle() + ": " + avgGradeForCourse(c2));
			System.out.println(pr2.getName() + " " + pr2.getSurname() + ": " + howManyCoursesByProf(pr2));
		} 
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static float calculateAvgGradeByStudent(Student student) throws Exception {
		if (student == null) throw new Exception("Problem with input argument.");
		
		float sum = 0;
		int howMany = 0;
		
		for (Grade grade : allGrades) {
			if(grade.getStudent().equals(student) ) {
				sum += grade.getValue();
				howMany++;
			}
		}
		if(howMany == 0) throw new Exception("There is no grade for this student.");
		return sum/howMany;
	}
	
	public static float avgGradeForCourse(Course course) throws Exception {
		if (course == null) throw new Exception("Problem with input argument.");
		
		float sum = 0;
		int howMany = 0;
		
		for (Grade grade : allGrades) {
			if(grade.getCourse().equals(course) ) {
				sum += grade.getValue();
				howMany++;
			}
		}
		if(howMany == 0) throw new Exception("There is no grade for this course.");
		return sum/howMany;
	}
	
	public static int howManyCoursesByProf(Professor professor) throws Exception {
		if (professor == null) throw new Exception("Problem with input argument.");
		
		int howMany = 0;
		for(Course course : allCourses) {
			if(course.getProfessor().equals(professor)) {
				howMany++;
			}
		}
		return howMany;
	}
	
	//CRUD create - retrieve - update - delete
	
	
}
