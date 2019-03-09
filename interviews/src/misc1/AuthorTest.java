package misc1;

import java.util.ArrayList;
import java.util.Collections;

public class AuthorTest {
	public static void main(String[] args) {
		ArrayList<Author> a1 = new ArrayList<Author>();
		a1.add(new Author("ram", "simkhada", "muna madan"));
		a1.add(new Author("hari", "ghimire", "village life"));
		a1.add(new Author("sam", "simkhada", "kathmandu"));
		a1.add(new Author("shiva", "kapri", "pokhara"));
		
		Collections.sort(a1);
		for (Author author : a1) {
			System.out.println(author.lastName + "," + author.firstName + ", " + author.bookName);
		}
	}

}
