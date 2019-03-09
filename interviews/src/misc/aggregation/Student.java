package misc.aggregation;

public class Student {
	int rollNo;
	String studentName;
	Address address;
	public Student(int rollNo, String studentName, Address address) {
		super();
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.address = address;
	}
	public static void main(String[] args) {
		Address ad = new Address(55, "Kathmandu", "Bagmati", "Nepal");
		Student obj = new Student(21, "Ram", ad);
		System.out.println(obj.studentName);
		System.out.println(obj.rollNo);
		System.out.println(obj.address.streetNo);
		System.out.println(obj.address.city);
		System.out.println(obj.address.State);
		System.out.println(obj.address.country);
	}

}
