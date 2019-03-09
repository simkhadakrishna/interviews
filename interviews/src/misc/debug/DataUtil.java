package misc.debug;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataUtil {

	public static List<Person> getPersondata() {
		Person steve = new Person("Steve", 40, "US");
		Person personWithNullCountry = new Person("Person with null country", 20, null);
		Person martin = new Person("Martin", 50, "Germany");
		Person personWithNullName = new Person(null, 40, "England");
		Person marco = new Person("Marco", 20, "Netherlands");
		Person personWithZeroAge = new Person("Marco", 0, "Netherlands");
		
		List<Person> personList = new ArrayList<>();
		personList.add(steve);
		personList.add(personWithNullCountry);
		personList.add(martin);
		personList.add(personWithNullName);
		personList.add(marco);
		personList.add(personWithZeroAge);
		return personList;
	}

	public static Map<Integer, Person> getPersonMap() {
		Person steve = new Person("Steve", 40, "US");
		Person martin = new Person("Martin", 50, "Germany");
		Map<Integer, Person> personMap = new HashMap<>();
		personMap.put(1, steve);
		personMap.put(2, martin);
		return personMap;
	}

}
