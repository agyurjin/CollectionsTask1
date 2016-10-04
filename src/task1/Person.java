package task1;

public class Person {

	private String firstName;
	private String lastName;
	private int idNumber;
	private String phoneNumber;

	
	public Person(String first, String last, int id, String phone){
		this.firstName = first;
		this.lastName = last;
		this.idNumber = id;
		this.phoneNumber = phone;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
