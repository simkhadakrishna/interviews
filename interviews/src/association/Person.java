package association;

public class Person {
	private int empId;
	private String firstName;
	private String lastName;
	private Address address;
	
	public Address getAddress() {
		return address;
	}

	//composition example
	public Person() {
		address = new Address();
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
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

	@Override
	public String toString() {
		return "Person [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ "]";
	}
	

}
