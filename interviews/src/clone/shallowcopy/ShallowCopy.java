/**
 * In shallow copy two references point towards the same object [In following example]. Not creating two objects.
 * Creating two references. So in heap memory, there will be only one object with two references. So, when
 * we make change on one, that will be reflected on other also.
 * 
 * 1. cloned object and original object are not 100% disjoint.
 * 1. cloned object and original object are 100% disjoint.
 * 
 * 2. Any changes made on cloned object will be reflected in original object and vice versa.
 * 2. Any changes made on cloned object will not be reflected on original object and vice-versa.
 * 
 * 3. Default version of cloned method created the shallow copy of an object.
 * 3. To create deep copy of an object, we have to override the clone() method.
 * 
 * 4. Shallow copy is preferred if an object has only primitive field.
 * 4. Deep copy is preferred if an object has references to other objects as fields.
 * 
 * 5. shallow copy is fast and less expensive.
 * 5. deep copy is slow and expensive.
 */

package clone.shallowcopy;

public class ShallowCopy {

	public static void main(String[] args) {
		
		ABC obj = new ABC();
		obj.i = 5;
		obj.j = 7;
		
		//ABC obj1 = new ABC();
		ABC obj1 = obj;
		obj1.j = 10;
		
		System.out.println(obj);
		System.out.println(obj1);

	}

}
