package testng;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import maven.Baseclass;

public class NewAccountPojo extends Baseclass {
	public NewAccountPojo() {
	PageFactory.initElements(driver,this);
}
	
	@FindAll({
		@FindBy(xpath="(//a[@role='button'])[2]")
	})private WebElement newAccountButton;
	
	@FindAll({
		@FindBy(xpath=""))
}
}