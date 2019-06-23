package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handleiframe {

	public static void main(String[] args) {
	  
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Workspace\\AutomationWithSelenium\\Drivers\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
	     d.get("C:/Users/Omita/Desktop/snaps/iframe.html");
	    
WebElement email=d.findElement(By.id("uname_01"));        //by user & pwd//
email.sendKeys("ghghgh");
WebElement pass=d.findElement(By.id("pname_00"));
pass.sendKeys("om");
WebElement f=d.findElement(By.xpath("//iframe[@src='dropdown.html']"));    //ny webelement method//
//d.switchTo().frame("iframe_b");
d.switchTo().frame(0);                     //by index method//
//d.switchTo().frame(f);
WebElement user=d.findElement(By.name("a"));
user.sendKeys("Ankita");

WebElement pass1=d.findElement(By.name("b"));
pass1.sendKeys("om");
d.switchTo().defaultContent();

	}

}
