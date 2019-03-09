package misc1;

import java.util.Scanner;

public class FactorialDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number whose factorial is required: ");
		int number = sc.nextInt();
		//int number = 5;
		int fact = 1;
		for(int i=1; i<=number; i++) {
			fact = fact*i;
		}
		System.out.println(fact);
		sc.close();
	}

}
