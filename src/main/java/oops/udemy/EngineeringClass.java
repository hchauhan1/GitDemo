package oops.udemy;

public class EngineeringClass implements Student {

	public static void main(String[] args) {
		
		System.out.println("Name of University: "+ Student.uniName);
		
		EngineeringClass eng = new EngineeringClass();
		
		eng.displayName();
		eng.getsSudentNumber();
		eng.getStandard();
	}

	public void displayName() {
		System.out.println("We are Engineering class");
		
	}

	public void getsSudentNumber() {
		System.out.println("We are 120 students");
		
	}

	public void getStandard() {
		System.out.println("We are in Computer Science");
		
	}

}
