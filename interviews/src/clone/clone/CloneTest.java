/**
 * In cloning, we write the coding as shallow copy, and make it to work as deep copy.
 */

package clone.clone;

public class CloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {

			STU obj = new STU();
			obj.i = 5;
			obj.j = 6;
			
			STU obj1 = (STU) obj.clone();
			obj1.j = 10;
/*
 * This looks like a shallow copy, because there is only one object, and two references are pointing to the
 * same object. But, it works as the had copy. So this is the beauty of the cloning.
 */
			
			System.out.println(obj);
			
			System.out.println(obj1);
	}

}
