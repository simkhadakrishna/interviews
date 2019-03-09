package hash;

import java.util.HashMap;
import java.util.Map;

public class Equals {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(1);
		Employee emp2 = new Employee(2);
		
		Map<Employee, String> map = new HashMap<>();
		map.put(emp1, "Jack");
		map.put(emp2, "Jack");
		
		System.out.println(map.size());
		
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(2);
		
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(i1, "one");
		map1.put(i2, "one");
		System.out.println(map1.size());
		
	}

}
