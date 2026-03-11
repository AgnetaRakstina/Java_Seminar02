package model;

import model.enums.ProfDegree; 


public class Professor extends Person {

	private long profId;
	//iznemt ara name surname person code jo tie ir ieksa person
	private ProfDegree degree;
	
	private static long counter = 1000;
	
	//2. getters===========================================================
	public long getProfId() {
		return profId;
	}
	//remove name surname and person code beacause that awas insid ethe person code
	public ProfDegree getDegree() {
		return degree;
	}
	
	
	// Setters===========================================================
	public void setProfId() {
		profId = counter;
		counter++;
	}
	String msg = ""; //parbaudes
	//removed the name surname and persn code since that is inside the person codd
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
		super("Reinis", "Vecvagars-Paruskins", "121212-56794");
		setProfId();
		setDegree(ProfDegree.bachelor);
	}
	
	//4.2 argumenta konstruktors===========================================================
	public Professor(String inputName, String inputSurname, String inputPersonCode, ProfDegree inputDegree) {
		super(inputName, inputSurname, inputPersonCode);
		setProfId();
		setDegree(inputDegree);
	}
	
	// toString funkcija===========================================================
	public String toString() {
		String result = profId + ": " + name + " " + surname + " (" + personCode + ") " + degree;
		return result;
	}
	
	
	
	
	
	
}
