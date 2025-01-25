package org.nextgen.algorithms;

public class numpairandsum {
	
	public static void main(String args[]) {
		
		int[] arr = {1,2,3,4,5}; 
		int sumgiven = 7;
		int counter1 = 0;
		int counter2;
		for (counter1 = 0; counter1< arr.length; counter1++ ) {
			for (counter2 = counter1 +1; counter2< arr.length; counter2 ++) {
				int sum = arr[counter1] + arr[counter2];
				if (sum == sumgiven) {
					System.out.println("Pair " + arr[counter1] + " + " + arr[counter2] + "= " + sum);
				} 
			}
		}
	}
}
