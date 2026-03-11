package model;


public class Course {
	//1. mainigie===========================================================
	private long courseId;
	private String title;
	private byte creditPoints;
	private Professor Professor; //TODO izveidot ari esipeju ka pasniedz vairaki pasniedzeji vienu un to pasu kursu
	
	private static long counter = 20000;
	
	//2. getters===============================================================
	public long getCourseId() {
		return courseId;
	}
	public String getTitle() {
		return title;
	}
	public byte getCreditPoints() {
		return creditPoints;
	}
	public Professor getProfessors() {
		return Professor;
	}
	
	//3. setters===========================================================
	public void setCourseId() {
		courseId = counter;
		counter++;
	}
	public void setTitle(String inputTitle) {
		if ((inputTitle != null) && (inputTitle.matches("[A-Z]{1}[A-Za-z0-9 ]{3,40}"))) {
			title = inputTitle;
		}
		else {
			title = "Unknown";
		}
			
	}
	public void setCreditPoints(byte inputCreditPoints) {
		if(inputCreditPoints >= 1 && inputCreditPoints <= 30) {
			creditPoints = inputCreditPoints;
		}
		else {
			creditPoints = 1;
		}
	}
	public void setProfessor(Professor inputProfessor) {
		if(inputProfessor != null) {
			Professor = inputProfessor;
		}
		else {
			Professor = new Professor();
		}
	}
	
	//4. Bez argumenta konstruktors
	public Course() {
		setCourseId();
		setTitle("JAVA programming");
		setCreditPoints((byte)6);
		setProfessor(new Professor()); //sim noklusetajam kursam bus piesaistits noklusetais professors 
	}
	
	//5. argumenta kontsukrots 
	public Course(String inputTitle, byte inputCreditPoints, Professor inputProfessor) {
		setCourseId();
		setTitle(inputTitle);
		setCreditPoints(inputCreditPoints);
		setProfessor(inputProfessor);
	}
	
	// 6. toString funkcija
	public String toString() {
		String result = courseId + ": " + title + " (" + creditPoints + " KP), " + 
		Professor.getName().charAt(0) + ". " + Professor.getSurname();
		return result;
	}
	
	//7. papildus funkcija
	
	
	
	
	
	
	
	
	
	
	 
}
