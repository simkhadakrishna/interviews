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
		/*ArrayList<Integer> arrList = (ArrayList<Integer>) Arrays.asList(5, 7, 9, 14, 21);*/
			//For Loop
			System.out.println("For Loop");
			for(int counter = 0; counter<arrList.size(); counter++) {
				Integer integer = arrList.get(counter);
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
			System.out.println("Iterator");
			Iterator<Integer> iterator = arrList.iterator();
			while(iterator.hasNext()) {
				System.out.print(iterator.next() + " ");
			}
	}

}
