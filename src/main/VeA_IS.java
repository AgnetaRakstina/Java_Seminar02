package main;

import model.Professor;
import model.Student;

import java.util.ArrayList;

import model.Course;
import model.Grade;
import model.enums.ProfDegree;

public class VeA_IS {
	
	private static ArrayList<Student> allStudents = new ArrayList<Student>();
	private static ArrayList<Professor> allProfessors = new ArrayList<Professor>();
	private static ArrayList<Course> allCourses = new ArrayList<Course>();
	private static ArrayList<Grade> allGrades = new ArrayList<Grade>();
	

	public static void main(String[] args) {
		System.out.println("=========== STUDENTS ===========");
		//datu tips     noseaukums  = new konsturktors
		Student			stud1		= new Student();
		Student stud2 = new Student("Rendijs", "Serna", "121234-45678");
		Student stud3 = new Student("671547", "Ser2d", null);
		allStudents.add(stud1);
		allStudents.add(stud2);
		allStudents.add(stud3);
		
		for(Student tempS : allStudents) {
			System.out.println(tempS);
		}
		
		System.out.println("=========== PROFESSORS ===========");
		Professor prof1 = new Professor();
		Professor prof2 = new Professor("Vairis", "Caune", "120914-12121", ProfDegree.phd);
		Professor prof3 = new Professor("Galina", "Hilkevica", "12198-3456", ProfDegree.phd);
		allProfessors.add(prof1);
		allProfessors.add(prof2);
		allProfessors.add(prof3);
		
		for(Professor tempS : allProfessors) {
			System.out.println(tempS);
		}
		
		System.out.println("=========== COURSES ===========");
		Course course1 = new Course();
		Course course2 = new Course("Algoritmu teorija", (byte)3, prof2);
		Course course3 = new Course("Matematiska analize", (byte)6, prof3);
		allCourses.add(course1);
		allCourses.add(course2);
		allCourses.add(course3);
		
		for(Course tempS : allCourses) {
			System.out.println(tempS);
		}
		
		System.out.println("=========== GRADES ===========");
		Grade grade1 = new Grade();
		Grade grade2 = new Grade(10, stud1, course1);
		Grade grade3 = new Grade(9, stud2, course2);
		allGrades.add(grade1);
		allGrades.add(grade2);
		allGrades.add(grade3);
		
		for(Grade tempS : allGrades) {
			System.out.println(tempS);
		}
		
		System.out.println("=========== CRUD TESTING ===========");
		try {
			//izveido studentu
			createStudent("Janis", "Berzins", "090512-23456");
			System.out.println(allStudents);
			//ja zinams id gribu visu objektu dabut
			System.out.println(getStudentById(4));//Janis berzins
			//update studentu
			System.out.println(updateById(1, "Rendijs", "Jaukais"));
			System.out.println(allStudents);
			//Dzesana
			deleteById(2); // tiek izdzests unknown students
			System.out.println(allStudents);
			}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
	}
		//CRUD - Create, Retrieve, Update, Delete ====================================
		
	//C - create
	public static void createStudent(String inputName, String inputSurname, String inputPersonCode) throws Exception {
		//TODO - parbaudit ienakosos parametrus	
		for(Student tempS : allStudents) {
			if(tempS.getPersonCode().equals(inputPersonCode)) { //parbauda vai dotais personas kods eksiste, ir pareizs
				throw new Exception("Tads students jau eksiste"); //VAJADZIGS PRIEKS TESTA
			}
		}
		
		Student newStudent = new Student(inputName, inputSurname, inputPersonCode);
		allStudents.add(newStudent);
	}
	
	//R - retrieve by id
	public static Student getStudentById(long id) throws Exception {
		
		if(id < 0) {
			throw new Exception("Id nevar but negativs");
		}
		
		for (Student tempS : allStudents) {
			if(tempS.getStudId() == id) {
				return tempS;
			}
		}
		throw new Exception("Students ar id " + id + " neeksiste!");

	}
	
	//U - update 
	public static Student updateById(int id, String inputName, String inputSurname) throws Exception { //galvena seciba, vispirms id
		Student studentForUpdating = getStudentById(id);
		
		//TODO parbaudit inputName and inputSurname
		if(!studentForUpdating.getName().equals(inputName)) {
			studentForUpdating.setName(inputName);
		}
		if(!studentForUpdating.getSurname().equals(inputSurname)) {
			studentForUpdating.setSurname(inputSurname);
		}
		
		return studentForUpdating;
		
	}
	
	//D - delete
	public static void deleteById(int id) throws Exception {
		Student studentForDeleting = getStudentById(id);
		allStudents.remove(studentForDeleting);
	}
	
}
