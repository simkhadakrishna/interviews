package misc.comparable;

public class Employee implements Comparable<Employee>{
	private String name;
	private int grade;
	private int gpa;
	
	public Employee(String name, int grade, int gpa) {
		this.name = name;
		this.grade = grade;
		this.gpa = gpa;
	}
	
	public String getName() {return name;}
	public int getGrade() {return grade;}
	public int getGpa() {return gpa;}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", grade=" + grade + ", gpa=" + gpa + "]";
	}

	@Override
	public int compareTo(Employee other) {
		//Employee other = (Employee)temp;
		if(this.getGrade() > other.getGrade()) {
			return +1;
		}
		else if(this.getGrade() < other.getGrade()) {
			return -1;
		}
		else {
			return 0;
	}

	/*@Override
	public int compareTo(Object temp) {
		Employee other = (Employee)temp;
		if(getGrade() > other.getGrade()) {
			return +1;
		}
		else if(getGrade() < other.getGrade()) {
			return -1;
		}
		else {
			return 0;
		}*/
	}
	
	

}
