package org.nextgen.algorithms;

public class ExplainingTest {
	
	public static void main(String arg[]) {
		
		int initial =2;
		int counter =0;
		
		while(counter<100) {
			boolean flag=true;
			for (int i =2;i<=initial/2;i++) {
			
				if(initial%i==0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println(initial);
				counter++;
			}
			initial++;
		}
	}

}

