package misc.debug;

import java.util.List;
import java.util.Map;

public class DebugPerson {
	public static void main(String[] args) {
		List<Person> personList = DataUtil.getPersondata();
		System.out.println("PersonList: " + personList);
		Map<Integer, Person> personMap = DataUtil.getPersonMap();
		System.out.println("PersonMap: " + personMap);
	}

}
