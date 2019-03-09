package misc.arraylist;

import java.util.ArrayList;

public class Clone {
	public static void main(String[] args) {
		
		ArrayList<String> a1 = new ArrayList<>();;
		a1.add("mango");
		a1.add("apple");
		a1.add("pear");
		System.out.println("elements in a1: " + a1);
		
		Object a2 = a1.clone();
		System.out.println("elements in a2: " + a2);
		
		a1.add("guava");
		System.out.println("------------");
		System.out.println(a1);
		System.out.println(a2);
	}

}
