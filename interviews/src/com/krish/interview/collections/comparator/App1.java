package com.krish.interview.collections.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class App1 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("zebra");
		al.add("elephant");
		al.add("tiger");
		al.add("deer");
		
		Collections.sort(al, new comparator());
		System.out.println(al);
	}
}
