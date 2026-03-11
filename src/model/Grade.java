package model;

public class Grade {
	//1.mainigie
	private long gradeId;
	private int gradeValue;
	private Student student;
	private Course course;
	
	private static long counter = 30000;
	
	//2. getters
	public long getGrade() {
		return gradeId;
	}
	public int getGradeValue() {
		return gradeValue;
	}
	public Student getStudent() {
		return student;
	}
	public Course getCourse() {
		return course;
	}
	
	//3. setters
	public void setGradeId() {
		gradeId = counter;
		counter++;
	}
	public void setGradeValue(int inputGradeValue) {
		if(inputGradeValue >= 1 && inputGradeValue <= 10) {
			gradeValue = inputGradeValue;
		}
		else {
			gradeValue = 1;
		}
	}
	public void setStudent(Student inputStudent) {
		if (inputStudent != null) {
			student = inputStudent;
		}
		else {
			student = new Student();
		}
	}
	public void setCourse(Course inputCourse) {
		if (inputCourse != null) {
			course = inputCourse;
		}
		else {
			course = new Course();
		}
	}
	
	//4. bezargumenta konstruktors
	public Grade() {
		setGradeId();
		setGradeValue(1);
		setStudent(new Student());
		setCourse(new Course());
	}
	
	//5. argumenta konstruktors
	public Grade(int inputGradeValue, Student inputStudent, Course inputCourse) {
		setGradeId();
		setGradeValue(inputGradeValue);
		setStudent(inputStudent);
		setCourse(inputCourse);
	}
	//6. tostring
	public String toString() {
		String result = gradeId + ": " + student.getName().charAt(0) + ". " + student.getSurname() +
				" nopelnija " + gradeValue + " kursa: " + course.getTitle();
		return result;
		
	}
	
	

	
	//7. parejas funkcijas
	
}
