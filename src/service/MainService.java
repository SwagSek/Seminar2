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
		Professor pr1 = new Professor();
		Professor pr2 = new Professor("Karina", "Skirmante", Degree.mg);
		allProfessors.add(pr1);
		allProfessors.add(pr2);
		for(Professor professor : allProfessors) {
			System.out.println(professor);
		}
		
		Student stu1 = new Student();
		Student stu2 = new Student("Klavs", "Grinvalds");
		
		allStudents.add(stu1);
		allStudents.add(stu2);
		for(Student student : allStudents) {
			System.out.println(student);
		}
		
		Course c1 = new Course();
		Course c2 = new Course("Programmesana timekli JAVA", 4, pr2);
		allCourses.add(c1);
		allCourses.add(c2);
		for(Course course : allCourses) {
			System.out.println(course);
		}
		
		Grade g1 = new Grade();
		Grade g2 = new Grade(10, stu2, c2);
		Grade g3 = new Grade(7, stu2, c1);
		allGrades.add(g1);
		allGrades.add(g2);
		allGrades.add(g3);
		System.out.println(g2);
		for(Grade grade : allGrades) {
			System.out.println(grade);
		}
	}

}
