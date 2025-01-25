package org.nextgen.algorithms;

public class first5perfectno {
	
	public static void main(String args[]) {
		
		int initial=1;
		byte counter =0;
		int sum = 0;
		while (counter<5) {
			for (int i =1; i<= initial/2; i++) {
				if(initial%i == 0) {
					sum+= i;
				}
			}
			if(initial == sum) {
				counter++;
				System.out.print(counter);
				System.out.print(" " + sum  + "\n");
			}
			/*if (initial==8128) {
				initial= 35500000;
			}*/
			sum =0;
			initial++;
			/*if (initial%1000==0) {
				System.out.println(initial);
			}*/
		}
	}
}
