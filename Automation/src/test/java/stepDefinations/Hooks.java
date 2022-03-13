package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@MobileTest")
	public void beforevalidation() {
		System.err.println("Before mobilehook");
		
	}
	
	@After("@MobileTest")
	public void aftervalidation() {
		System.out.println("after mobile hook");
		
	}
}
