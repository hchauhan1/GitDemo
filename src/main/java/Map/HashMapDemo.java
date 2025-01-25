package Map;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hmap = new HashMap();
		
		hmap.put("Harsh",27);
		hmap.put("Pankti",21);
		hmap.put("Aneree", 26);
		hmap.put("Geo",28);
		
		System.out.println(hmap);
		
		if (hmap.containsKey("Harsh")) {
			
			System.out.println("Age of Harsh: "+ hmap.get("Harsh"));
			
		}
		System.out.println("Size of Hash Map: "+ hmap.size());
		
		System.out.println("Size of Hash Map: "+ hmap.size());
		System.out.println("Size of Hash Map: "+ hmap.size());
		
	}

}
