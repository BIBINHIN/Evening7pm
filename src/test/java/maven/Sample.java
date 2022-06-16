package maven;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Sample {
	@Test
	public void tc5() {
		System.out.println("Test_One");
	}
	@Test
	public void tc3() {
		System.out.println("Test_two");
		
	}
	@Test
	
	public void tc7() {
	System.out.println("date");
	}
	
	@Before
	public void starttime() {
    System.out.println("starttime");
	}
	@After
	
	public void aftertime() {
System.out.println("aftertime");
	}
	
	@AfterClass
	public static void launch() {
System.out.println("Brower");
	}
	
	@BeforeClass
	
	public static void close() {
System.out.println("close");
	}
	
	
}

