package misc1;

public class Employee implements Comparable<Employee>{
	String empName;
	String empAddress;
	int empAge;
	
	public Employee(String name, String address, int age) {
		this.empName = name;
		this.empAddress = address;
		this.empAge = age;
	}

	@Override
	public int compareTo(Employee e) {
		if(this.empAge==e.empAge) {
			return 0;
		}else if(this.empAge>e.empAge) {
			return +1;
		}else {
			return -1;
		}
	}

	/*@Override
	public String toString() {
		return empName + " " + empAddress + " " + empAge;
	}*/
	

}
