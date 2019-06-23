package Automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class automation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Workspace\\AutomationWithSelenium\\Drivers\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
	     d.get("https://www.google.com");
	     d.getTitle();
	     String title=d.getTitle();
	     System.out.println(title);
	     
	    
	    d.close();
	}

}
 