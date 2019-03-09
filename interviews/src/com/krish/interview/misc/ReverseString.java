/**
 * Write a Program to reverse a string
 */
package com.krish.interview.misc;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Welcome";
		String reversed = reverseString(str);
		System.out.println("The reversed string is: "+ reversed);
	}

	private static String reverseString(String str) {
		//if(str.isEmpty()) {
			if(str.length()==0){
				//if(str.length()<2)
			return str;
		}else
		
		return reverseString(str.substring(1))+ str.charAt(0);
	}

}
