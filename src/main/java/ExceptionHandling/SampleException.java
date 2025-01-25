package ExceptionHandling;

public class SampleException {

	public static void main(String[] args) {
		
		try {
			
			int value= 100;
			int result = value/0;
			
			System.out.println("The value is: "+ result);
			
		}catch (Exception e) {
			
			System.out.println(e);
			System.out.println("Please enter valid value");
			
			e.printStackTrace();
		}

	}

}
