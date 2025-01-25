package org.nextgen.algorithms;

public class primeornot {
	
	public static void main(String args[]) {
		
		int input = 151;
		byte t = 0;
		for (int counter =2; counter <= input/2; counter++) {
			if(input%counter == 0) {
				System.out.println(counter);
				t=1;
				break;
			}
		}
		if (t==0)
			System.out.print("Prime no.!! " + input);
		else
			System.out.println("Not a prime no.!!");
	}
}
