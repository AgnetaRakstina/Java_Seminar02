package model;
// mainigie, setteri un getteri panemsi no studne classes
public class Person {
	//1. mainigie
	protected String name; //no private uz protected lai varetu izsaukt name utt ieksa to string
	protected String surname;
	protected String personCode;
	
	//2. getteri
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public String getPersonCode() {
		return personCode;
	}
	
	//3. setteri
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
	
	//4. no args constructor
	public Person() {
		setName("Liga");
		setSurname("Jauka");
		setPersonCode("00923-12345");
	}
	
	//5. args constructor
	public Person(String inputName, String inputSurname, String inputPersonCode) {
		setName(inputName);
		setSurname(inputSurname);
		setPersonCode(inputPersonCode);
	}
	
	//6. to string 
	public String toStrin() {
		String result = name + " " + surname + " (" + personCode + ")";
		return result;
	}
	
	
	
	
	
	
	
	
	
}
