/*
 * There are two ways: 1. using own logic and 2. using standard JAVA API
 */

package misc;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {

			//using own logic
		String original;
		String rev = " ";
		
		System.out.println("Enter the original string: ");
		Scanner sc = new Scanner(System.in);
		original = sc.nextLine();
		sc.close();
		 int len = original.length();
		 
		 for(int i = len-1; i>=0; i--) {
			 rev = rev + original.charAt(i);
		 }
		 System.out.println("Original String: " + original);
		 System.out.println("Reversed String: " + rev);
	}

}
