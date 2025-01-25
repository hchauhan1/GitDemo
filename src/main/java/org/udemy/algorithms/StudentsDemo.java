package org.udemy.algorithms;

public class StudentsDemo {
	
	int rollno;
	String name;
	String standard;
	
	public StudentsDemo(int rollno, String name, String standard){
		
		this.rollno = rollno;
		this.name =name;
		this.standard = standard;
		
	}
	
	public void display() {
		
		System.out.println("Rollno.: " + rollno + " Name is: "+ name + " Standard: "+ standard);
		
	}

	public static void main(String[] args) {
		
		StudentsDemo obj = new StudentsDemo(10,"harsh","5th");
		StudentsDemo obj1 = new StudentsDemo(20,"harshraj","4th");
		
		obj.display();
		obj1.display();

	}

}
