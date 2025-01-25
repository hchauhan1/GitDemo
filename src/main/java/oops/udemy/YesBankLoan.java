package oops.udemy;

public class YesBankLoan extends BankLoan {

	public static void main(String[] args) {
		
		BankLoan ba = new BankLoan();
		
		ba.setAge(20);
		ba.setAmount(1000000);
		ba.setName("Harry");
		
		System.out.println("Age = " + ba.getAge());
		System.out.println("Amount = " + ba.getAmount());
		System.out.println("Name = " +ba.getName());
		
	}

}
