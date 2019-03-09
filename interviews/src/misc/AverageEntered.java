package misc;

import java.util.Scanner;

public class AverageEntered {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers do you want to enter:");
		int n = sc.nextInt();

		int[] arr = new int[n];

		double total = 0;

		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println("Enter element number " + (i + 1) + " : ");
			arr[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i <= arr.length - 1; i++) {
			total = total + arr[i];
		}
		System.out.println("Total = " + total);
		double average = total / arr.length;
		System.out.println("Average = " + average);
	}

}
