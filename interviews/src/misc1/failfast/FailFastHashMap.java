package misc1.failfast;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFastHashMap {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		map.put("emp1", "ram");
		map.put("emp2", "hari");
		
		Iterator<String> keys = map.keySet().iterator();
		while(keys.hasNext()) {
			System.out.println(map.get(keys.next()));
/*
 * If we added map object here, we are going to get CocnurrentModificationException. So HashMap is fail fast.
 */
			map.put("emp3", "sam");
		}
		
	}

}
