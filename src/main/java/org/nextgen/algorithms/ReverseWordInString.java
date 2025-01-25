package org.nextgen.algorithms;

public class ReverseWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input ="How are you? I am good";
		String output="";
		boolean l=false;
		//looping through the string
		for(int i =0; i<input.length(); i++) {
			
			//finding a space in string or the end
			if(input.charAt(i)==' '|| i==input.length()-1) {
				
				//to add space after reversing
				if(l) {
					output = output+" ";
				}
				//to increment last index digit to for second loop to read from correct index
				if(i==input.length()-1) {
					i++;
				}
				// reversing the word and excluding the previous space
				for(int j=i-1; j<=i; j--) {
					if(input.charAt(j)!=' ') {
						output = output+ input.charAt(j);
					}
					//breaking loop after reversing the word
					if(input.charAt(j)==' '|| j==0) {
						l=true;
						break;
					}
				}
			}
		}
		//printing the word
		System.out.println(output);
	}

}
