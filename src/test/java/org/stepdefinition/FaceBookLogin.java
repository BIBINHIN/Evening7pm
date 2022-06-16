package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookLogin {
	public static WebDriver driver;
	@Given("user has to launch the chrome browser and hit the facebook url")
	public void user_has_to_launch_the_chrome_browser_and_hit_the_facebook_url() {
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    
	}

	@When("user has to pass the value in email field")
	public void user_has_to_pass_the_value_in_email_field() {
	   WebElement txtEmail = driver.findElement(By.id("email"));
	   txtEmail.sendKeys("bibin@gmail.com");
	   
	}

	@When("user has to pass the value in password field")
	public void user_has_to_pass_the_value_in_password_field() {
	    WebElement txtPass = driver.findElement(By.id("pass"));
	    txtPass.sendKeys("123");
	}

	@When("user has to click the login button")
	public void user_has_to_click_the_login_button() {
	    WebElement btnlogin =driver.findElement(By.name("login"));
	    btnlogin.click();
	}

	@When("user has to navigate the home page")
	public void user_ha_to_navigate_the_home_page() {
	    System.out.println("to check the mail");
	}

	@Then("user has to close the browser")
	public void user_has_to_close_the_browser() {
	    driver.close();
	}


}
