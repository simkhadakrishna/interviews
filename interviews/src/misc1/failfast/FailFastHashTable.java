package misc1.failfast;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastHashTable {

	public static void main(String[] args) {

			Map<String, String> tmap = new ConcurrentHashMap<>();
			tmap.put("emp1", "ram");
			tmap.put("emp2", "hari");
			
			Iterator<String> keys = tmap.keySet().iterator();
			while(keys.hasNext()) {
				System.out.println(tmap.get(keys.next()));
	/*
	 * Even if we put new object, it does not throw the exception.
	 */
				tmap.put("emp3", "sam");
			}
			
			System.out.println("----------------");
			keys = tmap.keySet().iterator();
			
			while(keys.hasNext()) {
				System.out.println(tmap.get(keys.next()));
			}
	}

}
