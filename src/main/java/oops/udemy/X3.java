package oops.udemy;

public class X3 extends bmw{
	
	static String model = "X3";

	public static void main(String[] args) {
		
		bmw objbmw = new bmw();
		
		System.out.println("Model is " + model);
		System.out.println("Brand is " + objbmw.name);
		System.out.println("Behaviour: ");
		
		objbmw.run();

	}

}
