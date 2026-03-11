package model;

import model.enums.ProfDegree; 


public class Professor {

	private long profId;
	private String name;
	private String surname;
	private String personCode;
	private ProfDegree degree;
	
	private static long counter = 1000;
	
	//2. getters===========================================================
	public long getProfId() {
		return profId;
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
	public ProfDegree getDegree() {
		return degree;
	}
	
	
	// Setters===========================================================
	public void setProfId() {
		profId = counter;
		counter++;
	}
	String msg = ""; //parbaudes
	public void setName(String inputName) {
		if((inputName != null) && (!inputName.isEmpty()) && (inputName.matches("[A-Z]{1}[a-z]{2,15}([ ]{1}[A-Z]{1}[a-z]{2,15})?"))    ) {
			name = inputName;
		}
		else {
			name = "Unknown";
		}
	}
	public void setSurname(String inputSurname) {
		if((inputSurname != null) && (!inputSurname.isEmpty()) 
				&& (inputSurname.matches("[A-Z]{1}[a-z]{2,15}([-]{1}[A-Z]{1}[a-z]{2,15})?"))    ) {
			surname = inputSurname;
		}
		else {
			surname = "Unknown";
		}
	}
	public void setPersonCode(String inputPersonCode) {
		if ((inputPersonCode != null) && (!inputPersonCode.isEmpty()) 
				&& (inputPersonCode.matches("[0-9]{6}[-]{1}[0-9]{5}")) ) {
			personCode = inputPersonCode;
		}
		else {
			personCode = "Unknown";
		}
	}
	public void setDegree(ProfDegree inputDegree) {
		if(inputDegree!=null) {
			degree = inputDegree;
		}
		else {
			degree = ProfDegree.unknown;
		}
	}
	
	//4.1. bezagrumenta konstruktors===========================================================
	public Professor() {
		setProfId();
		setName("Reinis");
		setSurname("Vecvagars-Paruskins");
		setPersonCode("181818-12345");
		setDegree(ProfDegree.bachelor);
	}
	
	//4.2 argumenta konstruktors===========================================================
	public Professor(String inputName, String inputSurname, String inputPersonCode, 
			ProfDegree inputDegree) {
		setProfId();
		setName(inputName);
		setSurname(inputSurname);
		setPersonCode(inputPersonCode);
		setDegree(inputDegree);
	}
	
	// toString funkcija===========================================================
	public String toString() {
		String result = profId + ": " + name + " " + surname + " (" + personCode + ") " + degree;
		return result;
	}
	
	
	
	
	
	
}
