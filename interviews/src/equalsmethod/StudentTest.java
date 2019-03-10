package equalsmethod;

import java.util.HashSet;
import java.util.Set;

public class StudentTest {

	public static void main(String[] args) {

			Student s1 = new Student("John", "Smith", 33333);
			Student s2 = new Student("John", "Smith", 33333);
			Student s3 = new Student("Bob", "Smith", 33333);
			System.out.printf("s1.equals(s2)? %s%n ", s1.equals(s2));
			System.out.printf("s1.equals(s3)? %s%n ", s1.equals(s3));
			
			Set<Student> set = new HashSet<>();
			set.add(s1);
			set.add(s1);
			set.add(s2);
			set.add(s3);
			System.out.println(s1.hashCode());
			System.out.println(s2.hashCode());
			System.out.println(s3.hashCode());
			System.out.println(set.size());
	}

}
