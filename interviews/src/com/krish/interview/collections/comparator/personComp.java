package com.krish.interview.collections.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class personComp {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("ram", 23));
		persons.add(new Person("sam", 21));
		persons.add(new Person("david", 25));
		persons.add(new Person("shiva", 27));
		
		System.out.println(persons);
		
		Collections.sort(persons, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.age.compareTo(o2.age);
			}
			
		});
		System.out.println(persons);
		Collections.sort(persons, (Person o1, Person o2) -> o1.name.compareTo(o2.name));
		System.out.println(persons);

	}
}
