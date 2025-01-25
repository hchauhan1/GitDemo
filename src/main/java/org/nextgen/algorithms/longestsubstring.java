package org.nextgen.algorithms;

public class longestsubstring {
	
	public static void main(String args[]) {
		
		String s = "bbbbbbbbb";
		String largest ="";
		for(int i=0;i<=s.length()-1;i++) {
			for (int j=i; j<=s.length()-1;j++) {
				//same charachter
				if(i!=j && s.charAt(j)==s.charAt(j-1)) {
					String s3 = s.substring(i,j);
					if(s3.length()>=largest.length()) {
						largest = s3;
						//System.out.println(largest+"1");
					}
				break;
				// longest non reapeating charachters
				}else if(i!=j && s.charAt(i)!=s.charAt(j)) {
					String s2 = s.substring(i,j+1);
					if(s2.length()>=largest.length()) {
						largest = s2;
						//System.out.println(largest+"1");
					}
				// whenever any character repeats it will break
				}else if(i!=j && s.charAt(i)==s.charAt(j)) {
					String s1= s.substring(i,j);
					if(s1.length()>=largest.length()) {
						largest = s1;
						//System.out.println(largest+"2");
					}
				break;
				}
			}
		}
		System.out.print(largest.length()+ "("+ largest+")");	
	}
}
