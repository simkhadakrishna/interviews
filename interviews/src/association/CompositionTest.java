package association;

public class CompositionTest {

	public static void main(String[] args) {
		
		compositionDemo();
	}

	private static void compositionDemo() {
		Address address = new Address();
		address.setAddressLine1(" ");
		address.setAddressLine2(" ");
		address.setCity("Newport News");
		address.setStreet("46 Blake Loop.");
		
		Person person = new Person();
		person.setEmpId(15);
		person.setFirstName("rajesh");
		person.setLastName("hari");
		
		System.out.println("person..............");
		System.out.println(person);
		System.out.println("address........");
		System.out.println(address);
		System.out.println("---------------");
		person = null;
		System.out.println(person);
		System.out.println(address);
	}

}
