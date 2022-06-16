package testng;

import org.testng.annotations.Test;

public class aclass {
	@Test(groups="smoke")
	private void tc1() {
		System.out.println("test 1");
	}
	@Test(groups="regression")
	private void tc2() {
		System.out.println("test 2");
	}
	@Test(groups="sanity")
		private void tc3() {
			System.out.println("test 3");
		
	
}
}

