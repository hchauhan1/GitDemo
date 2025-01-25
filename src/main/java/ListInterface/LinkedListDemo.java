package ListInterface;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList listl = new LinkedList();
		
		listl.add(3);
		listl.add(33);
		listl.add("Add string");
		listl.add(89);
		listl.add("new string");
		listl.add("final");
		
		System.out.println(listl);
		
		listl.addFirst(56);
		
		System.out.println(listl);

	}

}
