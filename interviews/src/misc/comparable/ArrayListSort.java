package misc.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {

	// @SuppressWarnings("unchecked")
	public static void main(String[] args) {

		ArrayList<Student> arrList = new ArrayList<>();

		arrList.add(new Student("Hari", 122, 33));
		arrList.add(new Student("Gita", 123, 27));
		arrList.add(new Student("Ram", 121, 34));
		arrList.add(new Student("David", 124, 30));

		Collections.sort(arrList);
		for (Student student : arrList) {
			System.out.println(student);

		}
	}

}
