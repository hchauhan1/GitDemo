package org.nextgen.algorithms;

public class firstnonrepeatativechar {
	
	public static void main(String args[]) {
		
		String input = "aabbcddeefcgf";
		boolean f =false;
		for(int i = 0; i<= input.length()-1; i++) {
			//System.out.println(input.charAt(i)+ " i");
			
			for(int j = 0; j<= input.length()-1; j++) {
				//System.out.println(input.charAt(j) + " j");
				
				if(i!=j && input.charAt(i)==input.charAt(j)) {
					f =false;
					break;
				}else {
					f=true;
				}
			}
			if(f) {
				System.out.println("First non repeating charachter is " + input.charAt(i));
				break;
			}	
		}
	}
}
