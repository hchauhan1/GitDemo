package ListInterface;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		List l1 = new ArrayList();
		
		l1.add(0,55);
		l1.add(1,65);
		
		System.out.println(l1);
		
		List l2 = new ArrayList();
		
		l2.add(3);
		l2.add(3);
		l2.add(5);
		
		l1.addAll(2, l2);
		
		//l1.remove(4);
		
		System.out.println("new list: " + l1);
		System.out.println("value at 1st index: " + l1.get(1));
		
		l1.set(4, 7);
		System.out.println("new list: " + l1);
		
		System.out.println("Index of 3: " + l1.indexOf(3));
		System.out.println("Last index of 3: "+ l1.lastIndexOf(3));
		
		List l3 = new ArrayList();
		
		l3 = l1.subList(2, 4);
		
		System.out.println("Sub list from 2 to 4 index is: "+ l3);

	}

}