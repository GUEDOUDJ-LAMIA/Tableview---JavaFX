package application;

import javafx.beans.property.SimpleStringProperty;

public class Person {

	private final SimpleStringProperty FirstName ;

	private final SimpleStringProperty LastName ;

	private final SimpleStringProperty Email ;

	private final SimpleStringProperty Gender ;

	private final SimpleStringProperty BirthDate ;

	public Person(String firstName, String lastName, String email,
			String gender, String birthDate) {
		super();
		FirstName =new SimpleStringProperty( firstName);
		LastName =new SimpleStringProperty (lastName);
		Email = new SimpleStringProperty(email);
		Gender =new SimpleStringProperty ( gender);
		BirthDate =new  SimpleStringProperty (birthDate);
	}

	public String getFirstName() {
		return FirstName.get();
	}

	public void setFirstName(String fName) {
		FirstName.set(fName);
	}
	
	public String getLirstName() {
		return LastName.get();
	}
	
	public void setLastName(String lName) {
		LastName.set(lName);
	}
	
	public String getEmail() {
		return Email.get();
	}
	public void setEmail(String email) {
		Email.set(email);
	}
	
	public String getGender() {
		return Gender.get();
	}
	
	public void setGender(String gender) {
		Gender.set(gender);
	}
	
	public String getBirthDate() {
		return BirthDate.get();
	}
	public void setBrithData(String bdate) {
		 BirthDate.set(bdate);
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
