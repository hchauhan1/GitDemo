package org.nextgen.algorithms;

public class CharacterLength {
	
	public static void main(String[] arg) {
		String Input = "ara";
		
		int total = 0;
		int counter =0;
		boolean flag = false;
		char marker = 'a';
		
		for(int i = 0; i<Input.length(); i++) {
			
			 if(Input.charAt(i)== marker && flag == false) {
				 
				 flag =true;
			 }
			 
			 if(flag == true && Input.charAt(i)!=marker && Input.charAt(i)!= ' ') {
				 
				 counter++;
			 }
			 if(flag == true && Input.charAt(i)==marker) {
				 
				 total = total + counter;
				 counter =0;
			 }
			 
		}
		
		if(total>=0 && flag==true)
			System.out.println(total);
		else if(flag ==false && counter==0)
			System.out.println(-1);
		
	}

}
