/*
 * By using standard JAVA API
 */

package misc;

import java.util.Scanner;

public class StringReverse1 {

	public static void main(String[] args) {
		String original;
		String rev = "";
		
		System.out.println("Enter the string required to reverse: ");
		Scanner sc = new Scanner(System.in);
		original = sc.nextLine();
		sc.close();
		//int len = original.length();
		//we need stringbuffer object
		
		StringBuffer sb = new StringBuffer(original);
		rev = sb.reverse().toString();
		System.out.println("String to be reversed: " + original);
		System.out.println("Reversed string: " + rev);

	}

}
