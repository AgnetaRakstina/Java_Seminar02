package model;

public class Student {
	//1. mainigie
	private long studId;
	private String name;
	private String surname;
	private String personCode;
	
	//lai id butu unikals
	private static long counter = 0;
	
	
	//2. get funkcija
	public long getStudId() {
		return studId;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public String getPersonCode() {
		return personCode;
	}
	
	//3. set funkcija
	public void setStudId() {
		studId = counter;
		counter++;
	}
	String msg = ""; //parbaudes
	public void setName(String inputName) {
		if((inputName != null) && (!inputName.isEmpty()) && (inputName.matches("[A-z]{1}[a-z]")) ) {
			name = inputName;
		}
		else {
			name = "Unknown";
		}
	}
	public void setSurname(String inputSurame) {
		if((inputSurame != null) && (!inputSurame.isEmpty()) && (inputSurame.matches("[A-z]{1}[a-z")) ) {
			name = inputSurame;
		}
		else {
			name = "Unknown";
		}
	}
	public void setPersonCode(String inputPersonCode) {
		
	}
	
	
	
	
	//4.1. bezagrumenta konstruktors
	//4.2 argumenta konstruktors
	//5. toString fuinkcijas
	//6. visas parejas funkcijas pec nepieciesamibas
	
	
	
	
}
