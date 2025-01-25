package org.nextgen.algorithms;

public class reversenumber {

	public static void main(String args[]) {
		
		int input = 12345;
		int rev = 0;
		for (int counter = 0; input !=0; counter++ ) {
			int r = input % 10;
			rev = rev * 10 + r;
			input = input / 10;
		}
		System.out.print("Reversed no. = " + rev);
	}
}
