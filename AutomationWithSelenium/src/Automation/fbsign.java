package Automation;         

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;   
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fbsign {
                                                                   
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Workspace\\AutomationWithSelenium\\Drivers\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
	     d.get("https://www.facebook.com/");
	     WebElement m=d.findElement(By.name("birthday_day"));
	     Select date= new Select(m);
	     date.selectByVisibleText("7");

	     
	     WebElement n=d.findElement(By.name("birthday_month"));
	     Select month= new Select(n);
	     month.selectByVisibleText("june");
	     WebElement o=d.findElement(By.name("birthday_year"));
	     Select year=new Select(o);
	     year.selectByVisibleText("1989");
	     
	     
	     
	    
	     
	     
		

	}

}
