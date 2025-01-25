package oops.udemy;

public class BankLoan {
	
	private String name;
	private int amount;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		if (age>=18 && age<=50)
			this.age = age;
		else
			System.out.println("Invalid age");
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getAmount() {
		return amount;
	}

}
