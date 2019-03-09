/**
 * If we have control over the object use this interface to sort (Student, Bicycle, Person etc).
 * -java.lang package
 * Int CompareTo(Object o1)
 * -Collections.sort(List)
 */

package com.krish.interview.collections.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class AppComparable {
	public static void main(String[] args) {
		ArrayList<Student> studArr = new ArrayList<>();
		studArr.add(new Student("ram", "computer", "25"));
		studArr.add(new Student("sam", "sociology", "22"));
		studArr.add(new Student("hari", "Science", "24"));
		studArr.add(new Student("david", "English", "23"));
		
		Collections.sort(studArr);
		
		for (int i = 0; i < studArr.size(); i++) {
			System.out.println(
					studArr.get(i).getName() + " , " + studArr.get(i).getMajor() + " , " + studArr.get(i).getAge());
		}
		
		System.out.println(studArr);
	}

}
