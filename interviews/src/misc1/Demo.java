package misc1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		int[] arr = {11, 55, 22, 0, 89};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		String[] names = {"ram", "sam", "shiva", "hari"};
		/*Arrays.sort(names);
		System.out.println(Arrays.toString(names));*/
		for (String name: names) {
			System.out.println(name + " ");
			
			
			}
		System.out.println("Fruits");
		List<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("mango");
		fruits.add("grapes");
		
		Collections.sort(fruits);
		for (String fruit : fruits) {
			System.out.println(fruit);
			
		}
	}

}
