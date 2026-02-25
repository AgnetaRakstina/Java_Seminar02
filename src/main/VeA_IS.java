package main;

import model.Student;

public class VeA_IS {

	public static void main(String[] args) {
		//datu tips     noseaukums  = new konsturktors
		Student			stud1		= new Student();
		System.out.println(stud1);
		Student stud2 = new Student("Rendijs", "Serna", "121234-45678");
		System.out.println(stud2);
		Student stud3 = new Student("671547", "Ser2d", null);
		System.out.println(stud3);
	}
	
	
	
}
