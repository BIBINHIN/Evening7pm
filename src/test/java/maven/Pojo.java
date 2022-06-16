package maven;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Pojo extends Baseclass{
		public Pojo() {
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(id="email")
		private WebElement txtuser;
		
		@FindBys({
			@FindBy(id="pass"),
		})
		
		private WebElement txtpass;
		
		@CacheLookup
		@FindAll({
			@FindBy(name="login"),
		})
		
		private List<WebElement> btnClk;

		public WebElement getTxtuser() {
			return txtuser;
		}

		public void setTxtuser(WebElement txtuser) {
			this.txtuser = txtuser;
		}

		public WebElement getTxtpass() {
			return txtpass;
		}

		public void setTxtpass(WebElement txtpass) {
			this.txtpass = txtpass;
		}

		public List<WebElement> getBtnClk() {
			return btnClk;
		}

		public void setBtnClk(List<WebElement> btnClk) {
			this.btnClk = btnClk;
		}
		
		}
		



