package singleton;

public class SingletonDemo {
	public static void main(String[] args) {
		/*Company comp1 = new Company();
		Company comp2 = new Company();*/
		
		Company comp1 = Company.getInstance();
		System.out.println(comp1);
		Company comp2 = Company.getInstance();
		System.out.println(comp2);
		
		System.out.println(comp1==comp2);
	}
	

}
