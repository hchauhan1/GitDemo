package TestNGPackage;

//import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SampleClass {
	
		@BeforeSuite
		public void beforeSuiteMethod() {
			
			System.out.println("Executing before test suite");
			
		}
		
		@AfterSuite
		public void afterSuiteMEthod() {
			
			System.out.println("Executing after test suite");
			
		}
}
