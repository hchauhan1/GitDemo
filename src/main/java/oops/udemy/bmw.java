package oops.udemy;

public class bmw extends car {

	String name = "BMW";
	
	public void getName() {
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public void run() {
		
		System.out.println("BMW is running");
		super.run();
	}
	
	public static void main(String[] args) {
		
		/*car objcar = new car();
		System.out.print(car.name);
		objcar.run();*/
		
		bmw objbmw = new bmw();
		
		objbmw.getName();
		objbmw.run();
	}
	
}
