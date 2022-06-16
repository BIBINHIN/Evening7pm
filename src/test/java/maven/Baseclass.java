package maven;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
			public static WebDriver driver;
			static Actions a;
			private static Robot r;
				
			public static void launchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
			}
			
			public static void launchUrl(String url) {
				driver.get(url);
			}
			public static void toMaxWindow() {
				driver.manage().window().maximize();
			}
			public static String toGetTitle() {
				String title=driver.getTitle();
				return title;
			}
			public static String toGetUrl() {
				String url=driver.getCurrentUrl();
				return url;
			}
			public static void toFillTextBox(WebElement e,String val) {
				e.sendKeys(val);
			}
			public static void btnClk(WebElement ele) {
				ele.click();
			}
			public static void toFetchTxt(WebElement e) {
				String tx=e.getText();
				System.out.println(tx);
			}
			public static void toClose() {
				driver.quit();
			}
			public static String toGetValue(WebElement ele) {
				String tx=ele.getAttribute("value");
				return tx;
			}
			public static void toMove(WebElement e) {
				a=new Actions (driver);
				a.moveToElement(e).perform();
			}
			public static void doubleClk(WebElement ele) {
				a=new Actions(driver);
				a.doubleClick(ele).perform();
			}
		    public static void rightClk(WebElement ele) {
				a=new Actions(driver);
				a.contextClick(ele).perform();
			}
		    public static void toPressDownArrow() throws AWTException {
		    	r=new Robot();
		    	r.keyPress(KeyEvent.VK_DOWN);
		    	r.keyRelease(KeyEvent.VK_DOWN);
		    	
				
			}
		    
		    public static void toCopy() throws AWTException {
				r=new Robot();
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyRelease(KeyEvent.VK_CONTROL);
			}
		    
		    public static void toTakeSnap(String fileName) throws IOException {
		    	TakesScreenshot t=(TakesScreenshot)driver;
		    	File src=t.getScreenshotAs(OutputType.FILE);
		    	File dest=new File("C:\\Users\\S.Radha\\Documents\\"+fileName+".jpg");
		    	FileUtils.copyFile(src, dest);
		    }
		    
		    public static void date() {
				Date d= new Date();
				SimpleDateFormat s= new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
				String format = s.format(d);
				System.out.println(format);

			}
}
			
			
