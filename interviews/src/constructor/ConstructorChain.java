package constructor;

public class ConstructorChain {
	private String empName;
	private int empSalary;
	private String empAddress;
	
	public ConstructorChain() {
		this("ram");
	}
	public ConstructorChain(String name) {
		this(name, 13000);
	}
	public ConstructorChain(String name, int sal) {
		this(name, sal, "ktm");
	}
	public ConstructorChain(String name, int sal, String address) {
		
		this.empName = name;
		this.empSalary = sal;
		this.empAddress = address;
	}
	public void disp() {
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee Salary: " + empSalary);
		System.out.println("Employee Address: " + empAddress);
	}

	public static void main(String[] args) {
		ConstructorChain obj = new ConstructorChain();
		obj.disp();

	}

}
