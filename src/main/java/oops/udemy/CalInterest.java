package oops.udemy;

public class CalInterest {

	public static void main(String[] args) {
		
		
		Bofa ba = new Bofa();
		Amex am = new Amex();
		Bank prnt = new Bank ();
		
		System.out.println(ba.getInterest());
		System.out.println(am.getInterest());
		System.out.println(prnt.getInterest());
		
		

	}

}
