/**
 * The problem of deep copy is that we have to create the two different objects, and have to pick each value
 * of one object to the other object. This maked the programming bit tedios.
 * 
 * Shallow Cloning: The process of creating bitwise copy of an object is called shallow cloning. If the 
 * main object contain primitive variables, then exactly duplicate copy will be created in the cloned object.
 * If the main object contain any reference variable, then corresponding object won't be created just duplicate
 * reference variable will be created pointing to old contained object. Object class clone method meant for
 * shallow cloning.
 */

package clone.deepcopy;

public class DeepCopy {

	public static void main(String[] args) {

			PQR obj1 = new PQR();
			obj1.i = 7;
			obj1.j = 9;
			
			PQR obj2 = new PQR();
			obj2.i = obj1.i;
			obj2.j = obj1.j;
			
			/*
			 * what happens if we change the value of obj2.
			 */
			obj2.j = 15;
			
			System.out.println(obj1);
			System.out.println(obj2);
	}

}
