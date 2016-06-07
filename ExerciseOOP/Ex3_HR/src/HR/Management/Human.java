package HR.Management;

public abstract class Human {
	
	
	@Override
	public String toString() {
		return "Human [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	String firstName;
	String lastName;
	
	public Human(){
		this.firstName = null;
		this.lastName = null;
	}
	
	public Human(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName(){
		return this.firstName;
	}
	
	public String getLastName(){
		return this.lastName;
	}
	
	

	

}
