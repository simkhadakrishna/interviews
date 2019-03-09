package misc1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeDemo {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("ram", "ktm", 17));
		list.add(new Employee("hari", "pokhara", 19));
		list.add(new Employee("shiva", "biratnagar", 21));
		list.add(new Employee("ganesh", "palpa", 18));
		
		Collections.sort(list);
		for (Employee emp : list) {
			System.out.println(emp.empAge);
			
		}
			
		System.out.println("-----Employee Name Comapring-------");
		
		Collections.sort(list, new NameComparator());
		for (Employee e : list) {
			System.out.println(e.empName);
			
		}
		System.out.println("-------Comparision by address:-----------");
		Collections.sort(list, new AddressComparator());
		for (Employee empl : list) {
			System.out.println(empl.empAddress);
			
		}
	}

}
