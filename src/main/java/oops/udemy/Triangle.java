package oops.udemy;

public class Triangle extends Shape {

	public static void main(String[] args) {

		Shape s = new Circle();
		Shape s1 = new Triangle();
		
		s.displayShape();
		s1.displayShape();

	}

	public void displayShape() {
		System.out.println("Shape is Triangle");
		
	}

}
