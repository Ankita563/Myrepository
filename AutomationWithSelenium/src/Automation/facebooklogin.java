package Automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooklogin {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Workspace\\AutomationWithSelenium\\Drivers\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
	     d.get("https://www.facebook.com/");
	     FileInputStream fis=new FileInputStream("C:\\Selenium_Workspace\\AutomationWithSelenium\\config.properties");
	        Properties pro=new Properties();
	        pro.load(fis);
	     WebElement user=d.findElement(By.id("email"));
	     user.sendKeys(pro.getProperty("username"));
         WebElement pass=d.findElement(By.id("pass"));
        		 pass.sendKeys(pro.getProperty("password"));
        WebElement login=d.findElement(By.xpath("//input[@value='Log In']"));
        
        login.click();
        
        
}

}