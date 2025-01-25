package TestNGPackage;

import org.testng.annotations.Test;

public class FacebookLogin {
	
		@Test
		public void loginWithValidCredetials() {
			
			System.out.println("Hi, I am successfully logged in");
		}
		@Test
		public void loginWithInvalidCredetials() {
			
			System.out.println("Hi, I am not able to login");
		}
}
