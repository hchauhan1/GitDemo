package org.nextgen.algorithms;

public class First100PrimeNo {
	
	public static void main(String args[]) {
		
		int initial = 2;
		boolean flag = true;
		byte counter = 0;
		while(counter<100) {
			for(int i = 2; i<=initial/2; i++) {
				if(initial%i==0) {
					flag =false;
					break;
				}
			}
			if (flag ==true) {
				System.out.println(initial);
				counter++;
			}
			flag=true;
			initial++;
		}
	}
}
