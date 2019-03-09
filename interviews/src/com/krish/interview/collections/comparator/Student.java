package com.krish.interview.collections.comparator;

public class Student implements Comparable<Student>{
	private String name;
	private String major;
	private String age;
	public Student(String name, String major, String age) {
		super();
		this.name = name;
		this.major = major;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student[name=" + name + ", major=" + major + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.name);
	}

}
