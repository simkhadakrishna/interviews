package com.krish.interview.collections.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeComparator{

	public static void main(String[] args) {
		List<Employee> eList = new ArrayList<>();
		eList.add(new Employee(01, "ram", "ktm"));
		eList.add(new Employee(02, "hari", "pokhara"));
		eList.add(new Employee(10, "sam", "Biratnagar"));
		eList.add(new Employee(04, "ravi", "patan"));
		
		
		Comparator com = new Comparator<Employee>() {
		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.empName.compareTo(o2.empName);
		}
	};
	Collections.sort(eList, com);
	System.out.println(eList);
	}
}

	
