package maven;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import junit.framework.Assert;

public class Junit extends Baseclass {

	@BeforeClass
	public static void bfClass() {
		System.out.println("*****before class*****");

	}

	@Before
	public void bftest() {
		System.out.println("****before*****");
		launchBrowser();
		toMaxWindow();
		Date d = new Date();
		System.out.println(d);
	}

	@After
	public void aftest() {
		toClose();
		Date d = new Date();
		System.out.println(d);

		System.out.println("****after****");
	}
	@Test
	public void tc1() {
		System.out.println("Test1");
		launchUrl("https://www.amazon.in/");
		String title = toGetTitle();
		Assert.assertTrue("check tc1", title.contains("www"));
	}

	@Test
	public void tc2() {
		System.out.println("Test2");
		launchUrl("https://www.facebook.com/");
		toGetTitle();
		toGetUrl();
	}
	
	@Test
	public void tc3() {
		System.out.println("Test3");
		launchUrl("https://www.flipkart.com/");
		toGetTitle();
		toGetUrl();
	}

	@AfterClass
	public static void aftclass() {
		System.out.println("after class");
	}
}