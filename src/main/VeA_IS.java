package main;

import model.Professor;
import model.Student;
import model.enums.ProfDegree;

public class VeA_IS {

	public static void main(String[] args) {
		//datu tips     noseaukums  = new konsturktors
		Student			stud1		= new Student();
		System.out.println(stud1);
		Student stud2 = new Student("Rendijs", "Serna", "121234-45678");
		System.out.println(stud2);
		Student stud3 = new Student("671547", "Ser2d", null);
		System.out.println(stud3);
		
		
		Professor prof1 = new Professor();
		System.out.println(prof1);
		
		Professor prof2 = new Professor("Vairis", "Caune", "120914-12121", ProfDegree.phd);
		System.out.println(prof2);
		
		Professor prof3 = new Professor("Galina", "Hilkevica", "12198-3456", ProfDegree.phd);
		System.out.println(prof3);
		
		
	}
	
	
	
}
