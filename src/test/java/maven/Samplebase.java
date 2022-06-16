package maven;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Samplebase extends Baseclass {
	public static void main(String[] args) throws IOException {
		launchBrowser();
		launchUrl("https://www.facebook.com/");
		toMaxWindow();
		WebElement username = driver.findElement(By.id("email"));
		toFillTextBox(username, "bibin");
		toTakeSnap("img1");
	}
	
	

}
