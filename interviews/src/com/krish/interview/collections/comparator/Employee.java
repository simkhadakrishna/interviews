package com.krish.interview.collections.comparator;

public class Employee {
	int empId;
	String empName;
	String empAddress;
	public Employee(int empId, String empName, String empAddress) {
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
	}
	@Override
	public String toString() {
		return empName;
	}
	
	

}
