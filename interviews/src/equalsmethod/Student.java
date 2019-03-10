/*
 * 1. If two objects are equal, they MUST have the same hashcode.
 * 2. If two objects have the same hashcode, they are NOT necessarily equal.
 */

package equalsmethod;

import java.util.Objects;

public class Student {
	private String firstName;
	private String lastName;
	private int ssn;
	public Student(String firstName, String lastName, int ssn) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getSsn() {
		return ssn;
	}
	
	@Override
	public boolean equals(Object obj) {
		//if(obj == null) return false;
		//if(!(obj instanceof Student)) return false;
		if((obj instanceof Student)) return true;
		Student s = (Student)obj;
		return firstName.equalsIgnoreCase(s.getFirstName()) &&
				lastName.equalsIgnoreCase(s.getLastName()) &&
				ssn == s.getSsn();
	}
	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName, ssn);
	}

}
