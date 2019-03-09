/**
 * Write a Program to find the first fifteen prime numbers.
 */
package com.krish.interview.misc;

import java.util.Scanner;

public class FirstFifteenPrime {

	public static void main(String[] args) {
		int n;
		int status = 1;
		int num = 3;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the value of n:");
		 n = sc.nextInt();
		 
		 if(n>=1) {
			 System.out.println("First " + n + " prime numbers are:");
			 System.out.print(2 + ", ");
		 }
		 for(int i = 2; i<=n;) {
			 for(int j = 2; j<=Math.sqrt(num);j++) {
				 if(num%j==0) {
					 status=0;
					 break;
				 }
				 
			 }
			 if(status!=0) {
				 System.out.print(num + ", ");
				 i++;
			 }
			 status=1;
			 num++;
		 }
		 sc.close();
	}

}
