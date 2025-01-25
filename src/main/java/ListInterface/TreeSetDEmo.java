package ListInterface;

import java.util.TreeSet;

public class TreeSetDEmo {

	public static void main(String[] args) {
		
		TreeSet tset = new TreeSet();
		
		tset.add(123);
		tset.add(13);
		tset.add(23);
		tset.add(3);
		tset.add(2);
		tset.add(1);
		tset.add(12);
		tset.add(1213);
		
		System.out.println(tset);
		
		System.out.println(tset.headSet(13));
		System.out.println(tset.tailSet(13));
		
		

	}

}
