package model;

public class Student {
	//1. mainigie===========================================================
	private long studId;
	private String name;
	private String surname;
	private String personCode;
	
	//lai id butu unikals
	private static long counter = 0;
	
	
	//2. get funkcija===========================================================
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
	
	//3. set funkcija===========================================================
	public void setStudId() {
		studId = counter;
		counter++;
	}
	String msg = ""; //parbaudes
	public void setName(String inputName) {
		if((inputName != null) && (!inputName.isEmpty()) && (inputName.matches("[A-z]{1}[a-z]{2,15}?")) ) {
			name = inputName;
		}
		else {
			name = "Unknown";
		}
	}
	public void setSurname(String inputSurame) {
		if((inputSurame != null) && (!inputSurame.isEmpty()) && (inputSurame.matches("[A-Z]{1}[a-z]{2,15}([-]{1}[A-Z]{1}[a-z]{2,15})?")) ) {
			surname = inputSurame;
		}
		else {
			surname = "Unknown";
		}
	}
	public void setPersonCode(String inputPersonCode) {
		if ((inputPersonCode != null) && (!inputPersonCode.isEmpty() 
				&& inputPersonCode.matches("[0-9]{6}[-]{1}[0-9]{5}")) ) {
			personCode = inputPersonCode;
		}
		else {
			personCode = "Unknown";
		}
	}
	

	//4.1. bezagrumenta konstruktors===========================================================
	public Student() {
		setStudId();
		setName("Janis");
		setSurname("Berzins-Kalnins");
		setPersonCode("121212-12345");
	}
	

	
	//4.2 argumenta konstruktors===========================================================
	public Student(String inputName, String inputSurname, String inputPersonCode) {
		setStudId();
		setName(inputName);
		setSurname(inputSurname);
		setPersonCode(inputPersonCode);
	}
	
	
	//5. toString fuinkcijas, parraksta===========================================================
	@Override //jaraksta (nav obligati)
	public String toString() {
		//piemers 1: Karina Skirmante ()
		String result = studId + ": " + name + " " + surname + " (" + personCode + ")"; 
		return result;
	}
	
	
	
	//6. visas parejas funkcijas pec nepieciesamibas
	
	
	
	
}
