package com.krish.interview.collections;

import java.util.Arrays;

public class ConvertArraysToList {

	public static void main(String[] args) {

		String city[] = {"kathmandu", "pokhara", "biratnager", "butwal"};
		
		for(int i = 0; i<=city.length-1; i++) {
			Arrays.asList(city[i]);
		}
		
		for (String c : city) {
			System.out.println(c);
		}
	}

}
