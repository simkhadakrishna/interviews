package misc.comparable;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("ram", 10, 3);
		Employee e2 = new Employee("hari", 10, 3);
		Employee e3 = new Employee("raju", 10, 3);
		
		System.out.println("Compare to return: " + e1.compareTo(e2));
		
		int result = e1.compareTo(e2);
		
		if(result < 0) {
			System.out.println(e1.getName() + " comes before " + e2.getName());
		}
		else if(result > 0) {
			System.out.println(e1.getName() + " comes after " + e2.getName());
		}
		else
			System.out.println(e1.getName() + " is equal to " + e2.getName() );
	}

}
