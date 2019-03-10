/*
 * Integer is a wrapper class, as we know all the wrapper classes I mean it may be integer, it may be Character
 * or any other has already implemented the hashcode() and equals() methods. This means the hashcode and equals 
 * methods are already been overwrriden in those wrapper classes.[if two objects hashcode are same, at that 
 * time equals method gone be used, and their content will be checked. If the hascode is same and the 
 * content is same that will be a duplicate element or duplicate object.
 * But, in the case of Employee class, no hashcode and equals methods are there. So we need to generate the
 * hashcode and equals methods. 
 */

package equalsmethod;

import java.util.HashMap;
import java.util.Map;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee emp1 = new Employee(1);
		Employee emp2 = new Employee(1);
		Map<Employee, String> map = new HashMap<>();
		map.put(emp1, "jack");
		map.put(emp2, "jack");
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(map.size());
		
		Integer i = new Integer(1);
		Integer i2 = new Integer(1);
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(i, "david");
		map1.put(i2, "david");
		System.out.println(map1.size());
	}

}
