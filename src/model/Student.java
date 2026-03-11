package model;
 //iznem ara visus mainigoes, getterus un setterus un ieliek inheritance class inside person
//students mant person klasi
public class Student extends Person {
	//1. mainigie===========================================================
	private long studId;

	
	//lai id butu unikals
	private static long counter = 0;
	
	
	//2. get funkcija===========================================================
	public long getStudId() {
		return studId;
	}

	
	//3. set funkcija===========================================================
	public void setStudId() {
		studId = counter;
		counter++;
	}
	String msg = ""; //parbaudes

	

	//4.1. bezagrumenta konstruktors===========================================================
	public Student() {
		super(); //izsauksies automatiski person konstruktors. Saka pirmo
		setStudId();
		
		//setName("Janis");
		//setSurname("Berzins-Kalnins");
		//setPersonCode("121212-12345");
	}
	

	
	//4.2 argumenta konstruktors===========================================================
	public Student(String inputName, String inputSurname, String inputPersonCode) {
		super(inputName, inputSurname, inputPersonCode); //izsauks konstruktoru
		setStudId();
		//setName(inputName);
		//setSurname(inputSurname);
		//setPersonCode(inputPersonCode);
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
