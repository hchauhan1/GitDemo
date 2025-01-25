package ExceptionHandling;

public class MultiCatch {

	public static void main(String[] args) {
		
		try {
			
			int value =100;
			
			int result =value/0;
			
			String test = null;
			
			System.out.println(test.length());
			
		}catch(ArithmeticException e){
			
			System.out.println("Specific error generated");
			
			System.out.println(e);
			
			e.printStackTrace();
			
		}catch (Exception e) {
			
			System.out.println("gneral error generated");
			System.out.println("gneral error no");
			System.out.println("gneral error yes");
		}

	}

}
