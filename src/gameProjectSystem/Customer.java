package gameProjectSystem;

public class Customer {

	String identityNumber;
	String name;
	String lastName;
	double birthYear;
	
	public Customer() {
		
	}
	
	public Customer(String identityNumber, String name, String lastName, double birthYear) {
		super();
		this.identityNumber = identityNumber;
		this.name = name;
		this.lastName = lastName;
		this.birthYear = birthYear;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(double birthYear) {
		this.birthYear = birthYear;
	}
	
	
	
}
