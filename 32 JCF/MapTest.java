package jcf;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(0, "a");
		map.put(0, "b"); // Overwrite value if key is duplicated.
		
		System.out.println(map);
		
		System.out.println(map.get(0));
		System.out.println(map.get(1));

		Set<Integer> keys = map.keySet();
		System.out.println(keys);
		for (Integer integer : keys) {
			System.out.println(integer + " : " + map.get(integer));
		}
		
		Map<String, String> newMap = new HashMap<>();
		
		newMap.put("1", "a");
		newMap.put("2", "a");
		newMap.put("3", "a");
		
		System.out.println(newMap.size());
		System.out.println(newMap.containsKey("1"));
		System.out.println(newMap.containsValue("b"));
		System.out.println(newMap.isEmpty());
		
		newMap.remove("1");
		
		newMap.replace("2", "b");
		
		System.out.println(newMap);
		
		newMap.clear();
		
		System.out.println(newMap);
	}

}
