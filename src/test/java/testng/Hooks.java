package testng;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import maven.Baseclass;

public class Hooks extends Baseclass{
	@Before
	public void BeforeMethod() {
		date();
	}
	@After
	public void afterMethod() {
		date();
	}
	
}
