package Map;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		LinkedHashMap<String,Integer> lmap = new LinkedHashMap();
		
		lmap.put("Harsh",27);
		lmap.put("Pankti",21);
		lmap.put("Aneree", 26);
		lmap.put("Geo",28);
		lmap.putIfAbsent("Harsh",27);
		
		System.out.println(lmap);
		
		System.out.println("Size of LHash Map: " + lmap.size());
		
		System.out.println("Is LHash Map Empty? " + lmap.isEmpty());
		
		System.out.println("Does LHash Map contains Aneree? " + lmap.containsKey("Aneree"));
		
		System.out.println("Does LHash Map value contains 26? " + lmap.containsValue(26));

		
	}

}
