package ListInterface;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet hs = new HashSet();
		
		hs.add("harry");
		hs.add("potter");
		hs.add("albus");
		hs.add(3);
		hs.add(4);
		
		System.out.println("Hashlist is: " + hs);
		
		Iterator i = hs.iterator();
		while(i.hasNext()) {
			
			System.out.print(i.next()+ " ");
		}
		
		
		hs.remove(3);
		
		System.out.println(hs);

	}

}
