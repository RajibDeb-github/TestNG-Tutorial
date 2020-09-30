package tutorial1;

import org.testng.annotations.Test;

public class test3 {
	
	@Test (enabled=false)
	public void logIn() {
		System.out.println("Login application");
	}
	@Test 
	public void logOut() {
		System.out.println("Logout application");
	}
	@Test 	
	public void publicWait() {
		System.out.println("Wait");
	}

}
