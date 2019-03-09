package com.krish.interview.oops;

public class Overload {
	void demo(int a) {
		System.out.println("Value of a is: " +a);
	}
	void demo(int a, int b) {
		System.out.println("Values of a and b are : " + a + " " + b +" respectively.");
	}
	double demo(double a) {
		System.out.println("Value of a is: " + a);
		return a*a;
		
	}
	public static void main(String[] args) {
		Overload obj = new Overload();
		obj.demo(5);
		obj.demo(5, 7);
		double result = obj.demo(3.5);
		System.out.println(result);
	}

}
