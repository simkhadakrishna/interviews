package com.krish.interview.collections.comparator;

public class Person {
	String name;
	Integer age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return name + " " + age;
	}
	

}
