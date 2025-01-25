package org.nextgen.algorithms;

import java.util.Arrays;

public class arraycombinations {
	
	public static void main(String args[]) {
	
	/*	int[] input= {1,2,3};		
		int n= input.length;
		int t = 0;
		for (int i =0;i<n;i++){
			System.out.print("{");
			for(int j =i; j<n;j++) {
				if(j== n-1) {
					System.out.print(input[j]);
				}else if(t==0){
					System.out.print(input[j] + ",");
				}else if(input[i]!=input[j+1] && t==1) {
					System.out.print();
				}
				
			}
			System.out.print("}\n");
			t=1;
		}
	}*/
		int input[] = { 1, 2, 3 };
	    // int input[] = {10,11,12,13};
	    possibleNumbers(input, 0);
	}

	public static void possibleNumbers(int[] x, int index) {
	    if (index == x.length) {
	        for (int i = 0; i < x.length; i++) {
	            System.out.print(x[i] + " ");
	        }
	        System.out.println();
	    }
	    for (int i = index; i < x.length; i++) {
	        int temp = x[index];
	        x[index] = x[i];
	        x[i] = temp;
	        possibleNumbers(x, index + 1);

	        temp = x[index];
	        x[index] = x[i];
	        x[i] = temp;
	    }
	}
}
