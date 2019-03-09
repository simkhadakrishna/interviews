/**
 * Comparator is an interface that enables us to provide custom comparision logic
 * for data types that we have no control over. If we have no control over objejcts
 * use this interface(Integers, Long, String etc). 
 * -java.util package
 * -Int compare(Object o1, Object o2)
 * -Collectios.sort(List,Comparator)
 */
package com.krish.interview.collections.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class App2 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("zeb");
		al.add("elephant");
		al.add("t");
		al.add("deer");
		
		Collections.sort(al, new SortByLength());
		System.out.println(al);
	}
}
