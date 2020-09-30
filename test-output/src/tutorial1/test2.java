package tutorial1;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test2 {
	/*with 'priority' [@Test ((priority=1)] keyword defines the priority of the methods, 
	 * if few are assigned with priority and few are without priority the application must run with without priority items
	 * @BeforeMethod & @AfterMethod are applicable within the same class methods
	 * @BeforeTest & @AfterTest are running before the test and after the test respectively
	 * <include name="first.*"/> regler expression  
	 * */
	@Test (groups="regression") 
	public void thirdtest() {
		System.out.println("Third test");
	}
	@Test (groups="regression")
	public void fourthtest() {
		System.out.println("Fourth test");
	}
	@BeforeTest
	public void hello() {
		System.out.println("hello world");
	}
	@AfterTest
	public void end() {
		System.out.println("End of the world");
	}
	@Test (dataProvider="data")
	public static void sixthtest(String x) {
		System.out.println(x);
		//System.out.println(y);
		//System.out.println(z);
	}
	
	
	@Parameters("URL1")
	@Test
	public void fifthtest(String value) {
		System.out.println("Fifth Test");
		System.out.println(value);		
	}
	@DataProvider
	public static String data() {
		String a="Hello";
		//String b="world";
		//int c=2020;
		return a;
	}
	
	

}
