/**
 * Comparator is an interface that enables us to provide custom comparision logic
 * for data types that we have no control over. If we have no control over objejcts
 * use this interface(Integers, Long, String etc). 
 * -java.util package
 * -Int compare(Object o1, Object o2)
 * -Collectios.sort(List,Comparator)
 */

package com.krish.interview.collections.comparator;

import java.util.Comparator;

public class comparator implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		return -o1.compareTo(o2);
	}

}
