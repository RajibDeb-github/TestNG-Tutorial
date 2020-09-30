package tutorial1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class test1 {
	@Test (groups="regression") 
	public void firsttest() {
		System.out.println("First test");
	}
	@Test (timeOut=1000)
	public void firstday() {
		System.out.println("First Day");
	}
	@Parameters("URL")
	@Test
	public void firstphone(String value) {
		System.out.println("First Phone");
		System.out.println(value);
	}
	
	@Test //(dependsOnMethods="win")
	public void firstlove() {
		System.out.println("First Love");
	}
	
	@Test (groups="regression")  
	public void secondtest() {
		System.out.println("Second test");
	}
	@Test
	public void win() {
		System.out.println("Win");
	}
	@Test (enabled=false)
	public void loss() {
		System.out.println("Lost");
	}
	

}
