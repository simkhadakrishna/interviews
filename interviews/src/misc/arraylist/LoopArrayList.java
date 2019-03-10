/**
 * ArrayList is a Collection class that implements List interface and it is based on an array data structure.
 * Most of the developers choose ArrayList over Array because of the functionality and flexibility of it.
 * ArrayList is a re-sizable-array implementaion of List interface. ArrayList can dynamically grow and shrink
 * after addition or removal of elements. Apart from these benefits, ArrayList class enables us to use pre-
 * defined methods which makes our job easy.
 */

package misc.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class LoopArrayList {

	public static void main(String[] args) {

			ArrayList<Integer> arrList = new ArrayList<Integer>();
			System.out.println("Size of the array: " + arrList.size());
			arrList.add(15);
			arrList.add(5);
			arrList.add(7);
			arrList.add(9);
			System.out.println("Size of the array: " + arrList.size());
			arrList.add(21);
			arrList.add(14);
			
			System.out.println("Size of the array: " + arrList.size());
			//sort
			System.out.println("Ascending order");
			Collections.sort(arrList);
			System.out.println(arrList);
		/*ArrayList<Integer> arrList = (ArrayList<Integer>) Arrays.asList(5, 7, 9, 14, 21);*/
			//For Loop
			System.out.println("For Loop");
			for(int i = 0; i<arrList.size(); i++) {
				Integer integer = arrList.get(i);
				System.out.print(integer + " ");
			}
			//Advanced For Loop
			System.out.println();
			System.out.println("Advanced For Loop");
			for (Integer item : arrList) {
				System.out.print(item + " ");
			}
			//While Loop
			System.out.println();
			System.out.println("While Loop");
			int count = 0;
			while(count < arrList.size()) {
				System.out.print(arrList.get(count) + " ");
				count++;
			}
			//Iterator
			Collections.sort(arrList, Collections.reverseOrder());
			System.out.println();
			System.out.println("Reverse Order");
			System.out.println(arrList);
			System.out.println("Iterator");
			Iterator<Integer> iterator = arrList.iterator();
			while(iterator.hasNext()) {
				System.out.print(iterator.next() + " ");
			}
	}

}
