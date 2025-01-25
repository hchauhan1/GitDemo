package org.udemy.algorithms;

public class Dog {
	
	String name = "Jackie";
	String breed = "Bulldog";
	int height = 3;
	
	public void barking() {
		System.out.println(name + " is barking");
	}

	public static void main(String[] args) {
		
		Dog dogclass= new Dog();
		Dog obj2 = new Dog();
		
		System.out.println(dogclass.height);
		
		dogclass.barking();
		
		obj2.barking();

	}

}
