/**
 * In shallow cloning, by using cloned object reference, if we perform any change to the contained object
 * then those changes will be reflected to the main object. To overcome this problem, we should go for deep
 * cloning. The process of creating exactly duplicate independent copy including contained object is called
 * deep cloning. In deep cloning, if the main object conatain any primitive variable, then in the cloned
 * object duplicate copies will be created. If the main object contain any reference variable, then the
 * corresponding contained object also will be created in the cloned copy. By default object, class clone method
 * is meant for shallow cloning. But, we can implement deep cloning explicitly by overriding the clone method
 * in our class.
 */

package clone.shallowcopy;

public class ShallowDemo {

	public static void main(String[] args) throws CloneNotSupportedException {

			Cat c = new Cat(10);
			Dog d1 = new Dog(c, 20);
			System.out.println(d1.i+ " " + d1.c.j);
			Dog d2 = (Dog) d1.clone();
			System.out.println(d2.i + " " + d2.c);
			
			d2.i = 888;
			d2.c.j = 999;
			System.out.println(d2.i + " " + d2.c);
			System.out.println(d1.i + " " + d1.c.j);
			
			
			
			
	}

}
