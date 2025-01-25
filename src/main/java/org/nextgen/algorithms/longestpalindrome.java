package org.nextgen.algorithms;

public class longestpalindrome {
	
	public static void main(String args[]) {
		
		String input = "tenetmomracecar";
		String largest ="";
		int start =0;
		int end=0;
		for(int index =0;index<input.length();index++) {
			
			int oddLength = palindrome(input,index,index);
			
			int evenLength = palindrome(input,index,index+1);
			
			int maxLength = Math.max(oddLength, evenLength);
			
			if(maxLength> end-start) {
				start = index -((maxLength-1)/2);
				end = index +(maxLength)/2;
			}
			largest = input.substring(start,end+1);
		}
		System.out.println(largest);
		
		
	}
	
	public static int palindrome (String input, int left, int right) {
		
		while(left>=0 && right <input.length() && input.charAt(left)== input.charAt(right)) {
			left--;
			right++;
			
		}
		return right- left-1;
	}
}