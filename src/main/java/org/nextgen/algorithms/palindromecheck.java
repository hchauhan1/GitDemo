package org.nextgen.algorithms;

public class palindromecheck {
	
	public static void main(String args[]) {
		
		String s = "racecar";
		/*StringBuilder builder = new StringBuilder();
		for (int counter = s.length()-1;counter>=0; counter-- ) {
			builder.append(s.charAt(counter));
		}
		String rev = builder.toString();
		System.out.println(rev);
		System.out.println(s);
		if(rev.equals(s))
			System.out.println("Palindrome!");
		else
			System.out.println("Not a Palindrome!");*/
		int length = s.length() - 1;
		int t = 0;
		for (int counter = 0;counter<= s.length()/2 ; counter++ ) {
			if (s.charAt(length) == s.charAt(counter)) {
				t =1;
				length--;
			} else {
				System.out.println("Not a Palindrome!");
				t = 0;
				
				break;
			}
		}
		if (t==1) 
			System.out.println("Palindrome!");
			
	}
}
