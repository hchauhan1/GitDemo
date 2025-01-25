package ListInterface;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(3);
		list.add(32);
		list.add(43);
		list.add(35);
		list.add(3);
		
		System.out.println(list);
		
		System.out.println(list.get(4));
	

	}

}
