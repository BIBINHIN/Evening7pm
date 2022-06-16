package testng;

import org.testng.annotations.Test;

public class bclass {
	@Test(groups="smoke")
	private void tc4() {
		System.out.println("test 4");
	}
	@Test(groups="regression")
	private void tc5() {
		System.out.println("test 5");
	}
	@Test(groups="sanity")
		private void tc6() {
			System.out.println("test 6");
		
	
}
}


