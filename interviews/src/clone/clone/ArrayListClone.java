package clone.clone;

/**
 * @author durga
 * The process of creating exactly duplicate object is called cloning. The main purpose of cloning is 
 * to maintain backup copy, and to preserve the state of an object. We can perform cloning by using 
 * clone() method of object class. 
 *                 protected native object clone() throws CloneNotSupported Exception
 * we can perform cloning only for cloneable object. An object is said to be cloneable iff the corresponding
 * class implements cloneable interface. Cloneable interface is present in java.lang package, and it does not
 * contain any method. It is a marker interface. If we are trying to perform cloning for non-cloneable object
 * then we will get runtime exception saying CloneNotSupportedException.
 */

import java.util.ArrayList;
import java.util.List;

public class ArrayListClone {

	public static void main(String[] args) {

			List<String> a1 = new ArrayList<>();
			a1.add("apple");
			a1.add("mango");
			a1.add("pear");
			
			System.out.println(a1);
			
			ArrayList<String> a2 =(ArrayList<String>) ((ArrayList<String>) a1).clone();
			System.out.println(a2);
			a1.add("guava");
			System.out.println(a1);
			System.out.println(a2);
	}

}
