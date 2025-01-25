package org.nextgen.algorithms;

public class perfectnumber {
	
	public static void main(String args[]) {
		
		int input = 33550336;
		int counter =1;
		int sum = 0;
		for (counter =1; counter <= input/2; counter++) {
			if(input%counter == 0) {
				System.out.println(counter);
				sum+= counter;
			}
		}
		if (sum == input)
			System.out.print("Perfect no.!! " + sum);
		else
			System.out.println("Not a Perfect number!");
	}
}
