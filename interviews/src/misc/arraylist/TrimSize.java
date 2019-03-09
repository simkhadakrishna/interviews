package misc.arraylist;

import java.util.ArrayList;

public class TrimSize {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>(50);
		a1.add(5);
		a1.add(6);
		a1.add(24);
		a1.add(21);
		a1.add(15);
		a1.add(22);
		a1.add(19);
		a1.add(24);
		a1.add(26);
		a1.add(13);
		a1.trimToSize();
		System.out.println(a1);
	}

}
