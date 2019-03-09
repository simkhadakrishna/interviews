package misc.arraylist;

import java.util.ArrayList;

public class ArrayListToArray {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("Hello");
		arr.add("Hi");
		arr.add("ola");
		
		System.out.println(arr);
		
		String array[] = new String[arr.size()];
		for(int j = 0; j<arr.size(); j++) {
			array[j] = arr.get(j);
		}
		for (String k : array) {
			System.out.println(k);
		}
	}

}
