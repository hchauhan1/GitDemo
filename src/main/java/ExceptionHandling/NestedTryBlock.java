package ExceptionHandling;

public class NestedTryBlock {
	
	public static void main(String[] args) {
		
		try {
			
			System.out.println("First try block");
			
			int value =100;
			int result = 100/1;
			
			try {
				System.out.println("Second block");
				
				String s = null;
				System.out.println(s.length());
				
				try {
					
					System.out.println("Third block");
					
					int[] arr = new int[4];
					System.out.println(arr[5]);
					
				}catch(Exception e){
					
					System.out.println("End of third");
				}
			}catch(Exception e) {
				
				System.out.println("End of Second block");
				e.printStackTrace();
			}
			
		}catch (Exception e) {
			
			System.out.println("End of block one");
			System.out.println("222");
			System.out.println("333");
			//my band
			System.out.println("444");
			System.out.println("555");
			System.out.println("999");
		}
	}
}
