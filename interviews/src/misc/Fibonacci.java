package misc;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		sc.close();

		int fibnacci = fib(num);
		System.out.println("The fibonacci number is: " + fibnacci);

	}

	public static int fib(int num) {
		if (num == 1 || num == 2) {
			return 1;
		} else {
			return num = (fib(num - 1) + fib(num - 2));
		}
	}

}
