package tutorial1;

import org.testng.annotations.Test;

public class test4 {
	
@Test 
 public void beforeLogin() {
	 System.out.println("Before login");
 }

@Test 	
 public void afterLogIn() {
	 System.out.println("After login");
 }
@Test 	
 public void beforeLogOut() {
	 System.out.println("Before logout");
 }
@Test (priority=6)	
 public void afterLogout() {
	 System.out.println("After logout");
 }
}
