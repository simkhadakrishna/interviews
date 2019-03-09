package association;

public class AggregationTest {

	public static void main(String[] args) {
		aggregationDemo();
	}

	private static void aggregationDemo() {
		Address address = new Address();
		address.setAddressLine1(" ");
		address.setAddressLine2(" ");
		address.setCity("Newport News");
		address.setStreet("46 Blake Loop.");
		
		
		Employee employee = new Employee();
		employee.setAge(25);
		employee.setEmpId("aa");
		employee.setFirstName("Ram");
		employee.setLastName("simkhada");
		employee.setAddress(address);
		
		System.out.println(employee);
		System.out.println(address);
		employee = null;
		System.out.println(employee);
		System.out.println(address);
	}

}
