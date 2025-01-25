package org.udemy.algorithms;

public class Students {
	
	public Students(){
		System.out.println("HI, I am inside my constructor");
		System.out.println("HI, I am inside my constructor");
	}
	
	int rollno;
	String name;
	
	public Students(int i, String n) {
		
		rollno = i;
		name = n;
		
	}
	
	public void display() {
		System.out.println("Roll no. = "+ rollno + " name: " + name);
	}

	public static void main(String[] args) {
		
		Students stu = new Students();
		Students ct1 = new Students(10,"james");
		Students ct2 = new Students(20, "natalie");
		
		ct1.display();
		ct2.display();
		

	}

}
