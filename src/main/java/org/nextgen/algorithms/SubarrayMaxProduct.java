package org.nextgen.algorithms;

import java.util.Arrays;
//import java.io.*;
//import java.lang.*;

public class SubarrayMaxProduct {
	
	public static void main(String agr[]) {
		
		int input[]= {0,1,2,3,0,-4,-5,6,0};
		int product = 1;
		product = Product(input,product);
		if (product<0) {
			int maxproduct = MaxProduct(input,product);		
			System.out.println(maxproduct);
		}else{
			System.out.println(product);
		}
		System.out.println(Arrays.toString(input));	
	}
	
	//if products is negative...find the largest negative no. and divide
	public static int MaxProduct(int input[],int product) {
		int biggestneg = 0;
		for (int i =0; i<input.length;i++) {
			if(input[i]<0) {
				biggestneg=input[i];
				break;
			}
		}
		for (int i =0; i<input.length;i++) {
			if(input[i]<0 && input[i]>= biggestneg) {
				biggestneg = input[i];
			}	
		}
		System.out.println(biggestneg);
		product = product/biggestneg;
		return product;
	}
	
	// to get the product of the array...avoiding 0 and 1
	public static int Product(int input[], int product) {
		for (int i =0;i<input.length;i++){
			boolean flag = true;
			while(input[i]==0 || input[i]==1) {
				if(i==input.length-1) {
					flag=false;
					break;
				}else {
					i++;
				}
			}
			if(flag) {
				product = product * input[i];
			}
		}
		return product;
	}
}
