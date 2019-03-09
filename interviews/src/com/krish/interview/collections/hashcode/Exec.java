package com.krish.interview.collections.hashcode;

import java.util.HashMap;
import java.util.Map;

public class Exec {

	public static void main(String[] args) {
		Student s = new Student("2345h");
		Student s2 = new Student("2345h");
		
		System.out.println(s.equals(s2));
		System.out.println(s==s2);
		
		Map<Student, ReportCard> studentReport = new HashMap<Student, ReportCard>();
		studentReport.put(s, new ReportCard());
		studentReport.put(s2, new ReportCard());
		
		System.out.println(studentReport.size());
	}

}
